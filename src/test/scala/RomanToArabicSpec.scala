import org.scalatest.{FreeSpec, MustMatchers, WordSpec}

class RomanToArabicSpec extends WordSpec with MustMatchers {
  "RomanToArabic when given a Roman number" must {

    "return the equivalent Arabic Number as a 1 char string " in {
      RomanToArabic.romanToArabic("I") mustEqual 1
      RomanToArabic.romanToArabic("V") mustEqual 5

    }
    "return the equivalent Arabic Number when given a 2 char string of descending Roman numbers" in {
      RomanToArabic.romanToArabic("VI") mustEqual 6
    }

    "return the equivalent Arabic Number when given  a variable length string of descending Roman numbers " in {
      RomanToArabic.romanToArabic("MDCLXVIII") mustEqual 1668
    }

    "return the equivalent Arabic Number when given  a 2 char string of ascending Roman numbers" in {
      RomanToArabic.romanToArabic("IX") mustEqual 9
    }

    "return the equivalent Arabic Number when given  string of 3 chars ascending and descending Roman numbers " in {
      RomanToArabic.romanToArabic("XIV") mustEqual 14
    }

    "return the equivalent Arabic Number  when given variable length string of ascending and descending Roman numbers " in {
      RomanToArabic.romanToArabic("MMXIX") mustEqual 2019
    }
  }

}