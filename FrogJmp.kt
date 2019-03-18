fun main(args: Array<String>) {
  println(solution(10, 85, 30))
  println(solution(4, 92, 7))
}

fun solution(X: Int, Y: Int, D: Int) : Int {
  // case 1: X == Y -> no jumps -> return 0
  if (X == Y) return 0

  // case 2: X + D == Y -> one jump -> return 1
  if (X.plus(D) == Y) return 1

  // case 3: X < Y -> need to jump -> return ???
  val sub_Y_X = Y - X
  val div = sub_Y_X / D
  val div_rem = sub_Y_X % D
  return when {
    div == 0 -> 1
    div_rem == 0 -> div
    else -> div.plus(1)
  }
}
