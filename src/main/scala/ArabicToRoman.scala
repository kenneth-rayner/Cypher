object ArabicToRoman {

  def arabicToRoman(arabicNum: Int): String = {


    val singleDigits = List("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    val tens = List("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    val hundreds = List("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")

       ("M" * (arabicNum / 1000)) ++ hundreds(arabicNum % 1000 / 100) ++ tens(arabicNum % 100 / 10) ++ singleDigits(arabicNum % 10)

  }
}