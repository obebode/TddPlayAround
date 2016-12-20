
class Luhn(n: String) {

  def getn: String = n

  def removeLastDigit(n: String): String = {
    n.dropRight(1)
  }

  /*def reverse(s: String) : String =
    (for(i <- s.length - 1 to 0 by -1) yield s(i)).mkString
  */

  def reverse(n: String): List[Int] = {
    n.reverse.map(_.asDigit).toList
  }

  def doubleOddDigits(n: List[Int]): List[Int] = {
    (0 until n.size).map(i => {
      if (i % 2 == 0) {
        n(i) * 2
      } else {
        n(i)
      }
    }).toList
  }

  def doSums(n: List[Int]): Int = {
    n.map(i => {
      i match {
        case i if i > 9 => {
          i.toString.sliding(1).map(_.toInt).sum
        }
        case i => {
          i
        }
      }
    }).sum
  }

  def checkValid(n: String, finalNumber: Int): Boolean = {
    val finalNumber = doubleOddDigits(reverse(n))
    doSums(finalNumber) % 10 == 0

  }
}
