//Find out whether a list is a palindrome.
//Example:
//  scala> isPalindrome(List(1, 2, 3, 2, 1))
//res0: Boolean = true
def isPalindrome(list: List[Int]): Boolean = {
  if (list.length % 2 == 0) false
  else {
    val midIndex = list.length / 2
    list.take(midIndex) == list.drop(midIndex + 1).reverse
  }
}
