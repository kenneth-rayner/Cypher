import org.scalatest.{MustMatchers, WordSpec}

class ScaleBalancerSpec extends WordSpec with MustMatchers {
    "Cypher when called"  must {


      "When a is input return 1 " in {

      Cypher.convertToNumber('a') mustEqual 1
      }
    }
    "when b is input return 2" in {

      Cypher.convertToNumber('b') mustEqual 2
    }
}
