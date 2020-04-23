import org.scalatest.{MustMatchers, WordSpec}

class CypherSpec extends WordSpec with MustMatchers {
  "Cypher when called" must {

    "When a is input return 1 " in {

      Cypher.convertToNumber('a') mustEqual 1
    }
  }
  "when b is input return 2" in {

    Cypher.convertToNumber('b') mustEqual 2
  }
  "when z is input return 26" in {

    Cypher.convertToNumber('z') mustEqual 26
  }
  "when ab is input return Array('a','b')" in {

    Cypher.stringToArray("ab") mustEqual Array('a', 'b')
  }
  "when ken is input return Array('k','e','n')" in {

    Cypher.stringToArray("ken") mustEqual Array('k', 'e', 'n')
  }
  "when List('a','b') is input return Array(1,2)" in {

    Cypher.combine(Array('a', 'b')) mustEqual Array(1, 2)
  }
  "when List('k','e','n') is input return Array(11,5,14)" in {

    Cypher.combine(Array('k', 'e', 'n')) mustEqual Array(11, 5, 14)
  }
  "when given key 1234 return Array(1,2,3,4" in {

    Cypher.splitKey(1234) mustEqual Array(1, 2, 3, 4)
  }
  "return 12341 when 1234 is input if original array length is 5" in {

    Cypher.keyConverter(Array(1, 2, 3, 4), Array(1, 2, 3, 4, 5)) mustEqual Array(1, 2, 3, 4, 1)
  }
  "return 123412341 when 1234 is input if original array length is 9" in {


    Cypher.keyConverter(Array(1, 2, 3, 4), Array(1, 2, 3, 4, 5, 6, 7, 8, 9)) mustEqual Array(1, 2, 3, 4, 1, 2, 3, 4, 1)

  }
  "when ab is input return Array(1,2)" in {
    Cypher.combine(Cypher.stringToArray("ab")) mustEqual Array(1, 2)
  }
  "when scout is input return Array(19,3,15,21,20)" in {

    Cypher.combine(Cypher.stringToArray("scout")) mustEqual Array(19, 3, 15, 21, 20)

  }

  "when given a array of Integers Array(20,12,18,30,21) and a key(1931) returns  Array(19,3,15,21,20)" in {

    Cypher.codeAndKeyNewCode(Array(20, 12, 18, 30, 21), 1939) mustEqual Array(19, 3, 15, 21, 20)
  }
  "when given a array of Integers Array(20,12,18,30,21) and a key(1931) returns  string'scout'" in {

    Cypher.returnString(Array(20, 12, 18, 30, 21), 1939) mustEqual "scout"
  }
  "when given a array of Integers Array(14,10,22,29,6,27,19,18,6,12,8) and a key(1931) returns  string'masterpiece'" in {

    Cypher.returnString(Array(14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8), 1939) mustEqual "masterpiece"
  }



}
//  "when given a code(List of integers) [19,3,15,21,20] and a key(an integer) 1939 return a List(20,12,18,30,21)" in {
//    Cypher.convertCodeAndKey(Array(19,3,15,21,20),1939) mustEqual Array(20,12,18,30,21)
//  }
//  "when given input('scout',1939) must return  List(20,12,18,30,21)" in {
//    Cypher.convertStringToCodedListInt("scout",1939) mustEqual Array(20,12,18,30,21)
// }










