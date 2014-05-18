// Find the last element of a list.
// Example:
// scala> last(List(1, 1, 2, 3, 5, 8))
// res0: Int = 8
def last(list: List[Int]): Int = list match {
  case Nil => throw new NoSuchElementException
  case head :: Nil => head
  case head :: tail => last(tail)
}

//Find the last but one element of a list.
//  Example:
//  scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5
def penultimate(list: List[Int]): Int = {
  val index = list.length - 2
  if (index >= 0)
    list(index)
  else
    throw new NoSuchElementException
}

//Find the number of elements of a list.
//Example:
//  scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6
def length(list: List[Int]): Int = list match {
  case Nil => 0
  case head :: Nil => 1
  case head :: tail => 1 + length(tail)
}













}























