fun main(args: Array<String>) {
  val a = solution(intArrayOf(3, 8, 9, 7, 6), 5)
  val b = solution(intArrayOf(1, 2, 3, 4), 4)
  a.forEach {
    println(it)
  }
  b.forEach {
    println(it)
  }
}

fun solution(A: IntArray, K: Int): IntArray {
  // check before dive into a lot of looping process
  if (A.size == K || K == 0 || K % A.size == 0) return A

  val a = A.toMutableList()
  val b = mutableListOf<Int>()
  val k = if (K > a.size) K.minus(a.size) else K

  // remove last index k's elements from list a
  repeat(k) {
    b.add(a.last())
    a.removeAt(a.size.minus(1))
  }

  // add elements of b into a as first elements each
  b.forEach {
    a.add(0, it)
  }

  return a.toIntArray()
}
