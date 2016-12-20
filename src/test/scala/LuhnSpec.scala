import org.specs2.mutable.Specification

class LuhnSpec extends Specification {

  val creditCardNum = new Luhn("4556737586899855")

  " take credit card number: 4556737586899855 " in {
    creditCardNum.getn must be equalTo "4556737586899855"
  }

  " remove the last digit of the credit card number will be left with: 455673758689985 " in {
    creditCardNum.removeLastDigit("4556737586899855") must be equalTo "455673758689985"
  }

  " reverse the credit card number string and convert it into List of digits should be:List(76533331)" in {
    creditCardNum.reverse("455673758689985") must be equalTo List(5, 8, 9, 9, 8, 6, 8, 5, 7, 3, 7, 6, 5, 5, 4)
  }

  " double odd number digits in the list and leave even number digits the same " in {
    creditCardNum.doubleOddDigits(List(5, 8, 9, 9, 8, 6, 8, 5, 7, 3, 7, 6, 5, 5, 4)) must be equalTo List(10, 8, 18, 9, 16, 6, 16, 5, 14, 3, 14, 6, 10, 5, 8)
  }

  " Subtract 9 from the numbers over 9 will be: 85" in {
    creditCardNum.doSums(List(10, 8, 18, 9, 16, 6, 16, 5, 14, 3, 14, 6, 10, 5, 8)) must be equalTo 85
  }

  " Check that the card is valid " in {
    val number = "4556737586899855"
    creditCardNum.checkValid(number, 5) must be equalTo false
  }

}
