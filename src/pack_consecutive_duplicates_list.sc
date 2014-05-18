//(**) Pack consecutive duplicates of list elements into sublists.
//  If a list contains repeated elements they should be placed in separate sublists.
//  Example:
//
//  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
def pack(list: List[Char]): List[List[Char]] = list match {
  case Nil => Nil
  case head :: tail =>
    val index = tail.indexWhere(i => i != head)
    if (index != -1)
      (head :: tail.take(index)) :: pack(tail.drop(index))
    else
    if (tail.length != 0)
      List(head :: tail)
    else
      List(List(head))
}
