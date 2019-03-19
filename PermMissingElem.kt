fun main(args: Array<String>) {
  println(solution(intArrayOf(2, 3, 1, 5)))
}

fun solution(A: IntArray): Int {
  val sum_A = A.sum()
  // B is the IntArray having A.size.plus(1) intergers and each interger is sequential.
  val sum_B = A.size.plus(1) * (1 + A.size.plus(1)) / 2
  val missing_interger = sum_B - sum_A
  return missing_interger
}
