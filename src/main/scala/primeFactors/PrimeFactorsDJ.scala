package primeFactors

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

/**
 * Created by dave on 27/04/16.
 */
object PrimeFactorsDJ {
  def result(num: Int) : List[Int] = {
    val lBuf = new ListBuffer[Int]()
    num match {
      case 1 => List()
      case _ => getFactors(num, 2, lBuf)
    }
    lBuf.toList
  }

  @tailrec
  def getFactors(num: Int, factor: Int, factors : ListBuffer[Int]) : Unit = {
    if (num > 1) {
      num % factor match {
        case 0 => getFactors(num/factor, factor, factors += factor)
        case _ => getFactors(num, factor + 1, factors)
      }
    }
  }

  def resultB(num: Int) : List[Int] = {
    @tailrec
    def resultAcc(num: Int, factor: Int, factors: ListBuffer[Int]): ListBuffer[Int] = {
      if (num == 1) {
        factors
      } else {
        num % factor match {
          case 0 => resultAcc(num / factor, factor, factors += factor)
          case _ => resultAcc(num, factor + 1, factors)
        }
      }
    }
    resultAcc(num, 2, new ListBuffer[Int]()).toList
  }

  @tailrec
  def resultC(num: Int, factor: Int = 2, factors: ListBuffer[Int] = new ListBuffer[Int]()): List[Int] = {
      if (num == 1) {
        factors.toList
      } else {
        num % factor match {
          case 0 => resultC(num / factor, factor, factors += factor)
          case _ => resultC(num, factor + 1, factors)

        }
      }
    }


}
