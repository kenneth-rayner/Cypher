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


    val stringToChars: List[Char] = romanNumeral.toList
    val nums: List[Int] = stringToChars.map(x => romanNum(x))


//SOLUTION ONE:
//    nums.foldLeft((0,0)) {
//    case ((acc, previousNUmber), currentNumber) =>
//  (acc + (if (previousNUmber < currentNumber) -(2*previousNUmber) else 0)  + currentNumber, currentNumber) }._1

//SOLUTION TWO
def sortNumbers(numbs: List[Int]): List[Int] = numbs match{
  case Nil => List(0)
  case head :: Nil => List(head)
  case head :: tail => (if(head < tail.head) -head else head) :: sortNumbers(tail)
    }
    sortNumbers(nums).sum
  }
}

