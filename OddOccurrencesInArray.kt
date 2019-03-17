// this task is in importance of performance.
// searching for the number that is occurred odd times is the one way to find the key
// but what if array A has million intergers? is for loop of all of them is really right choice???
// that is out of performance.

fun main(args: Array<String>) {
  val answer = solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))
  println(answer)
}

fun solution(A: IntArray) : Int {
  if (A.size == 1) return 1
  val a = A.sorted()
  val b = a.distinct()
  b.forEach { base ->
    val c = a.count { it == base }
    if (c % 2 == 1) return base
  }
  return 1
}
