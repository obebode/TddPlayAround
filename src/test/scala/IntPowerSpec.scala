
import org.specs2.mutable.Specification

class IntPowerSpec extends Specification {

  "when x is 2 and n is 2 the result will be 4" in {
    IntPower.intPower(2, 2) must be equalTo 4
  }

  "when x is 4 and n is 2 the result will be 16" in {
    IntPower.intPower(4, 2) must be equalTo 16
  }

  "when x is 4 and n is 3 the result will be 64" in {
    IntPower.intPower(4, 3) must be equalTo 64
  }

  "when x is 4 and n is 0 the result will be 1" in {
    IntPower.intPower(4, 0) must be equalTo 1
  }

  "when x is 4 and n is 0 the result will be 1" in {
    IntPower.intPower(4, 0) must be equalTo 1
  }

  "when x is 4 and n is -1 the result will be 4" in {
    IntPower.intPower(4, -1) must be equalTo 4
  }
}
