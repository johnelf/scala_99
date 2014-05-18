//Flatten a nested list structure.
//  Example:
//  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//res0: List[Any] = List(1, 1, 2, 3, 5, 8)
def flatten[A](list: List[A]): List[A] = list match {
  case Nil => Nil
  case (head: List[A]) :: tail => flatten(head) ::: flatten(tail)
  case head :: tail => head :: flatten(tail)
}
