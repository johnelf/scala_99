//(**) Eliminate consecutive duplicates of list elements.
//  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
//  Example:
//
//  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
def compress(list: List[Char]): List[Char] = {
  list match {
    case Nil => Nil
    case head :: Nil => List(head)
    case head :: tail =>
      val index = tail.indexWhere(i => i != head)
      if (index != -1)
        head :: compress(tail.drop(index))
      else List(head) ::: compress(tail)
  }
}