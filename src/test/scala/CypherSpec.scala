import org.scalatest.{MustMatchers, WordSpec}

class CypherSpec extends WordSpec with MustMatchers {
    "Cypher when called"  must {

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
  "when ab is input return List('a','b')" in {

    Cypher.stringToList("ab") mustEqual Array('a','b')
    Cypher.stringToList("ken") mustEqual Array('k','e','n')
  }
  "when List('a','b') is input return List(1,2)" in {

    Cypher.combine(Array('a','b')) mustEqual Array(1,2)
    Cypher.combine(Array('k','e','n')) mustEqual Array(11,5,14)
  }

"return 12341 when 1234 is input if original list length is 5"in {

  Cypher.keyConverter(Array(1,2,3,4),Array(1,2,3,4,5)) mustEqual Array(1,2,3,4,1)

  Cypher.keyConverter(Array(1,2,3,4),Array(1,2,3,4,5,6,7,8,9)) mustEqual Array(1,2,3,4,1,2,3,4,1)

}
     "when ab is input return List(1,2)" in {
       Cypher.combine(Cypher.stringToList("ab")) mustEqual Array(1,2)
       Cypher.combine(Cypher.stringToList("ken")) mustEqual Array(11,5,14)
       Cypher.combine(Cypher.stringToList("scout")) mustEqual Array(19,3,15,21,20)

     }
  "when given a code(List of integers) [19,3,15,21,20] and a key(an integer) 1939 return a List(20,12,18,30,21)" in {
    Cypher.convertCodeAndKey(Array(19,3,15,21,20),1939) mustEqual Array(20,12,18,30,21)
  }
  "when given input('scout',1939) must return  List(20,12,18,30,21)" in {
    Cypher.convertStringToCodedListInt("scout",1939) mustEqual Array(20,12,18,30,21)
 }
  "when given a list of Integers List(20,12,18,30,21) and a key(1931) returns  List(19,3,15,21,20)" in {

    Cypher.codeAndKeyNewCode(Array(20,12,18,30,21),1939) mustEqual Array(19,3,15,21,20)
  }
  "when given a list of Integers List(20,12,18,30,21) and a key(1931) returns  string'scout'" in {

    Cypher.returnString(Array(20,12,18,30,21),1939) mustEqual "scout"
  }
  "when given a list of Integers List(14,10,22,29,6,27,19,18,6,12,8) and a key(1931) returns  string'scout'" in {

    Cypher.returnString(Array(14,10,22,29,6,27,19,18,6,12,8),1939) mustEqual "masterpiece"
  }

}










