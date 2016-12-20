

object IntPower {

  def intPower(x: Double, n: Int): Double = {
    // n is > 0 and even
    if (n > 0 & n % 2 == 0) {
      val y = intPower(x, n / 2)
      y * y
    }
    // n is odd ...
    else if (n > 0) x * intPower(x, n - 1)
    else if (n == 0) 1
    else intPower(x, -n)
  }
}
