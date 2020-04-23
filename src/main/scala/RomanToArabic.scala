object RomanToArabic {

  def romanToArabic(romanNumeral: String): Int = {
    val romanNum = Map('I' -> 1,
      'V' -> 5,
      'X' -> 10,
      'L' -> 50,
      'C' -> 100,
      'D' -> 500,
      'M' -> 1000
    )


    val foo: Seq[Char] = romanNumeral.toList
    val nums: Seq[Int] = foo.map(x => romanNum(x))

//    val sumTuple: (Int, Int) =  nums.foldLeft((0,0)) {
//      case ((acc, previousNUmber), currentNumber) =>
//        (acc + (if (previousNUmber < currentNumber) -(2*previousNUmber) else 0)  + currentNumber, currentNumber) }
//
//    sumTuple._1

          nums.foldLeft((0,0)) {
          case ((acc, previousNUmber), currentNumber) =>
            (acc + (if (previousNUmber < currentNumber) -(2*previousNUmber) else 0)  + currentNumber, currentNumber) }._1




    }
}