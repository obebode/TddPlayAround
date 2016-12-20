import org.specs2.mutable.Specification

class NumberOperationsSpec extends Specification {

  val num = new NumberOperations(6, 7, 3, 10, 50)
  " sum of the numbers 6,7,3,10,50 will be 76 " in {
    num.sum(6, 7, 3, 10, 50) must be equalTo 76
  }

  " average of the numbers 6,7,3,10,50 will be 15.2 " in {
    num.average(6, 7, 3, 10, 50) must be equalTo 15.2
  }

  " product of the numbers 6,7,3,10,50 will be: 63000 " in {
    num.product(6, 7, 3, 10, 50) must be equalTo 63000
  }

  " maximum of the numbers 6,7,3,10,50 will be: 50 " in {
    num.max(6, 7, 3, 10, 50) must be equalTo 50
  }

  " maximum of the numbers 100,50,3200,150,10 will be: 3200 " in {
    val num1 = new NumberOperations(100, 50, 3200, 150, 10)
    num1.max(100, 50, 3200, 150, 10) must be equalTo 3200
  }

  " minimum of the numbers 6,7,3,10,50 will be: 3 " in {
    num.min(6, 7, 3, 10, 50) must be equalTo 3
  }

  " minimum of the numbers 100,50,3200,150,10 will be: 3200 " in {
    val num1 = new NumberOperations(100, 50, 3200, 150, 10)
    num1.min(100, 50, 3200, 150, 10) must be equalTo 10
  }

}
