fun main(args: Array<String>) {
    println(solution(1041))
    println(solution(543))
    println(solution(31))
}

fun solution(N: Int): Int {

  // binary number of 1 is 0, so return 1
  if (N == 1) return 1

  // to save the resulf of subtraction
  val sub_result = mutableListOf<Int>()
  var num = N

  // unitl num becomes 1 or 0, subtract given number by 2
  while (num > 1) {
    sub_result.add(0, num % 2)
    num = num / 2
  }
  sub_result.add(0, num)

  // list does not contain 0, that means all number is 1 and return 0
  if (!sub_result.contains(0)) return 0

  // it does not matter if the last number of list is 0, so remove it until we find 1 at the last of list
  while (sub_result.last() == 0) { sub_result.removeAt(sub_result.size.minus(1)) }
  if (!sub_result.contains(0)) return 0

  // it does not matter if the first number of list is 0, so remove it until we find 1 at the first of list
  while (sub_result.first() == 0) { sub_result.removeAt(sub_result.size.minus(1)) }
  if (!sub_result.contains(0)) return 0

  // at this point, we are going to count the number of 0 between 1 and 1
  var num_str = ""
  sub_result.forEach {
    num_str = num_str + it.toString()
  }
  // the elements left in the list if empty value or string of 0
  val lst = num_str.split("1")
  var max_zero_count = 0

  // let's count the longest elements
  lst.forEach {
    max_zero_count = if (it.length > max_zero_count) it.length else max_zero_count
  }
  return max_zero_count
}
