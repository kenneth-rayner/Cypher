object Cypher {


  def convertToNumber (input:Char): Int = {

    val lettersToNumbers = ('a' to 'z').zip(1 to 26).toMap

       lettersToNumbers(input)
  }
}
