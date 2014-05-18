//Find the Kth element of a list.
//  By convention, the first element in the list is element 0.
//Example:
//
//  scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2
def nth(number: Int, list: List[Int]): Int = {
  list(number)
}

def nth_2(number: Int, list: List[Int]): Int = {
  def nthAcc(number: Int, list: List[Int], acc: Int): Int = list match {
    case head :: Nil =>
      if (number == acc) head
      else throw new IndexOutOfBoundsException
    case head :: tail =>
      if (number == acc) head
      else nthAcc(number, tail, acc + 1)
  }
  nthAcc(number, list, 0)
}