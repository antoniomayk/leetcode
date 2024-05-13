object Solution00007:
  def reverse(x: Int, result: Int = 0): Int = (x, result) match
    case (x, result) if x != 0 =>
      (result, x % 10) match
        case (result, digit) if (result > Int.MaxValue / 10 || (result == Int.MaxValue / 10 && digit > 7))  => 0
        case (result, digit) if (result < Int.MinValue / 10 || (result == Int.MinValue / 10 && digit < -8)) => 0
        case (result, digit) => reverse(x / 10, result * 10 + digit)
    case _ => result
