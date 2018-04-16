val t1 = List (1,2,3)
val t2 = List (1,2,3,2.4,5,6,7)
val t3 = t2.length/t1.length
val t4 = t2.length
val t5 = t4%t3

val t7 = List.fill(t3)(t1).flatten
val t6 = t1.slice(0,t5)

//val t = List(1,2,3,4)
//val t1 = List(1,2,3,4,5,6,7,8,9,10,11)
//val t2 = t1.length / t.length
//val t3 = List.fill(t2)(t).flatten
//val t4 = t1.length % t.length
//val t5 = t.slice(0, t4)
//t3 ++ t5
(List(1,2), List(5,5)).zipped.map(_ + _)
(List(1,2), List(5,5)).zipped.map(_ + _)


import Cypher.stringToArray



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












