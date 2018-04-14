import Cypher.stringToList

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


  def stringToList(input: String): Array[Char] = {
    input.toArray
  }

  def combine(input: Array[Char]): Array[Int] = {
    input.map(char => convertToNumber(char))
  }

  def splitKey(key: Int): Array[Int] = {
    key.toString.map(_.asDigit).toArray
  }

  def keyConverter(key: Array[Int], originalList: Array[Int]): Array[Int] = {

    val keyMultitplier = originalList.length / key.length
    val remainder = originalList.length % key.length
    val repeatKey = Array.fill(keyMultitplier)(key).flatten
    val remainderKeySlice = key.slice(0, remainder)
    repeatKey ++ remainderKeySlice
  }

  def convertCodeAndKey(code: Array[Int], key2: Int): Array[Int] = {

    val key2Converted = keyConverter(splitKey(key2), code)
    (code, key2Converted).zipped.map(_ + _)

  }

  def convertStringToCodedListInt(inputString: String, key3: Int): Array[Int] = {

    val inputStringAsListInt = combine(stringToList(inputString))
    convertCodeAndKey(inputStringAsListInt, key3)
  }

  def codeAndKeyNewCode(code: Array[Int], key4: Int): Array[Int] = {

    val key4Converted = keyConverter(splitKey(key4), code)
    (code, key4Converted).zipped.map(_ - _)
  }

  def returnString(code: Array[Int], key5: Int): String = {

    val returnStringAsListOfNumbers: Array[Int] = codeAndKeyNewCode(code, key5)
   val retAsListLetters = combine2(returnStringAsListOfNumbers).mkString
    retAsListLetters
  }

}













