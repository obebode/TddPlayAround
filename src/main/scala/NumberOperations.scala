
class NumberOperations(a: Int, b: Int, c: Int, d: Int, e: Int) {

  def sum(a: Int, b: Int, c: Int, d: Int, e: Int): Double = {
    a + b + c + d + e
  }

  def average(a: Int, b: Int, c: Int, d: Int, e: Int): Double = {
    sum(a, b, c, d, e) / 5
  }

  def product(a: Int, b: Int, c: Int, d: Int, e: Int): Double = {
    a * b * c * d * e
  }

  def max(a: Int, b: Int, c: Int, d: Int, e: Int): Double = {
    a max b max c max d max e
  }

  def min(a: Int, b: Int, c: Int, d: Int, e: Int): Double = {
    a min b min c min d min e
  }

}
