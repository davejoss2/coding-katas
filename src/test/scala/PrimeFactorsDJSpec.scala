package primeFactors

import org.scalatest.{FlatSpec, Matchers}

class PrimeFactorsTest extends FlatSpec with Matchers {

  "Prime Factors" must "be List() for 1" in {
    PrimeFactorsDJ.result(1) should equal(List[Int]())
  }

  it must "be List(2) for 2" in {
    PrimeFactorsDJ.result(2) should equal(List(2))
  }

  it must "be List(3) for 3" in {
    PrimeFactorsDJ.result(3) should equal(List(3))
  }

  it must "be List(2, 2) for 4" in {
    PrimeFactorsDJ.result(4) should equal(List(2, 2))
  }

  it must "be List(5) for 5" in {
    PrimeFactorsDJ.result(5) should equal(List(5))
  }

  it must "be List(2, 3) for 6" in {
    PrimeFactorsDJ.result(6) should equal(List(2, 3))
  }

  it must "be List(7) for 7" in {
    PrimeFactorsDJ.result(7) should equal(List(7))
  }

  it must "be List(2, 2, 2) for 8" in {
    PrimeFactorsDJ.result(8) should equal(List(2, 2, 2))
  }

  it must "be List(3, 3) for 9" in {
    PrimeFactorsDJ.result(9) should equal(List(3, 3))
  }

  it must "be List(3, 23) for 69" in {
    PrimeFactorsDJ.result(69) should equal(List(3, 23))
  }

  it must "be List(2, 3, 29) for 174" in {
    PrimeFactorsDJ.result(174) should equal(List(2, 3, 29))
  }

  it must "be List(2147483647) for 2,147,483,647" in {
    PrimeFactorsDJ.result(2147483647) should equal(List(2147483647))
  }

  it must "be List(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2) for 1,073,741,824" in {
    PrimeFactorsDJ.result(1073741824) should equal(List(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2))
  }
}