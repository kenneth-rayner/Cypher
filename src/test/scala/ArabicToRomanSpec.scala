import org.scalatest.{MustMatchers, WordSpec}

class ArabicToRomanSpec extends WordSpec with MustMatchers {

  "ArabicToRoman" must {
    "should return the correct Roman number counterpart as a string when given a Arabic number" when {
      "less than 10 " in {
        ArabicToRoman.arabicToRoman(1) mustEqual "I"
        ArabicToRoman.arabicToRoman(2) mustEqual "II"
        ArabicToRoman.arabicToRoman(3) mustEqual "III"
        ArabicToRoman.arabicToRoman(4) mustEqual "IV"
      }
      "between 10 and 99 " in {
        ArabicToRoman.arabicToRoman(10) mustEqual "X"
        ArabicToRoman.arabicToRoman(11) mustEqual "XI"
        ArabicToRoman.arabicToRoman(49) mustEqual "XLIX"
        ArabicToRoman.arabicToRoman(51) mustEqual "LI"
        ArabicToRoman.arabicToRoman(99) mustEqual "XCIX"

      }
      "between 100 and 999 " in {
        ArabicToRoman.arabicToRoman(100) mustEqual "C"
        ArabicToRoman.arabicToRoman(101) mustEqual "CI"
        ArabicToRoman.arabicToRoman(110) mustEqual "CX"
        ArabicToRoman.arabicToRoman(111) mustEqual "CXI"
        ArabicToRoman.arabicToRoman(199) mustEqual "CXCIX"
        ArabicToRoman.arabicToRoman(999) mustEqual "CMXCIX"

      }
      "between 1000 and 2999 " in {
        ArabicToRoman.arabicToRoman(1000) mustEqual "M"
        ArabicToRoman.arabicToRoman(2000) mustEqual "MM"
        ArabicToRoman.arabicToRoman(1100) mustEqual "MC"
        ArabicToRoman.arabicToRoman(1110) mustEqual "MCX"
        ArabicToRoman.arabicToRoman(1111) mustEqual "MCXI"
        ArabicToRoman.arabicToRoman(1199) mustEqual "MCXCIX"
        ArabicToRoman.arabicToRoman(1999) mustEqual "MCMXCIX"
        ArabicToRoman.arabicToRoman(2999) mustEqual "MMCMXCIX"

      }


    }
  }
}