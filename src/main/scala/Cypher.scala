import Cypher.stringToArray

object Cypher {

  def convertToNumber(input: Char): Int = {

    val lettersToNumbers = ('a' to 'z').zip(1 to 26).toMap
    lettersToNumbers(input)
  }

  def convertToLetters(input: Int): Char = {

    val numbersToLetters = (1 to 26).zip('a' to 'z').toMap
    numbersToLetters(key = input)
  }

  def combine2(input2: Array[Int]): Array[Char] = {
    input2.map(int => convertToLetters(int))
  }

  def stringToArray(input: String): Array[Char] = {
    input.toArray
  }

  def combine(input: Array[Char]): Array[Int] = {
    input.map(char => convertToNumber(char))
  }

  def splitKey(key: Int): Array[Int] = {
    key.toString.map(_.asDigit).toArray
  }

  def keyConverter(key: Array[Int], originalArray: Array[Int]): Array[Int] = {

    val keyMultitplier = originalArray.length / key.length
    val remainder = originalArray.length % key.length
    val repeatKey = Array.fill(keyMultitplier)(key).flatten
    val remainderKeySlice = key.slice(0, remainder)
    repeatKey ++ remainderKeySlice
  }

  def codeAndKeyNewCode(code: Array[Int], key: Int): Array[Int] = {

    val keyConverted = keyConverter(splitKey(key), code)
    (code, keyConverted).zipped.map(_ - _)
  }

  def returnString(code: Array[Int], key: Int): String = {

    val returnStringAsArrayOfNumbers: Array[Int] = codeAndKeyNewCode(code, key)
    combine2(returnStringAsArrayOfNumbers).mkString

  }

}
//  def convertCodeAndKey(code: Array[Int], key2: Int): Array[Int] = {
//
//    val key2Converted = keyConverter(splitKey(key2), code)
//    (code, key2Converted).zipped.map(_ + _)
//  }
//
//  def convertStringToCodedListInt(inputString: String, key3: Int): Array[Int] = {
//
//    val inputStringAsListInt = combine(stringToList(inputString))
//    convertCodeAndKey(inputStringAsListInt, key3)
//  }












