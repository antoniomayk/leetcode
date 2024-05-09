import scala.annotation.tailrec

object Solution00003:
  def lengthOfLongestSubstring(s: String): Int = processSubstring(s, Set.empty)

  @tailrec
  def processSubstring(s: String, set: Set[Char], left: Int = 0, longest: Int = 0, idx: Int = 0): Int =
    (idx == s.length) match
      case true => longest
      case false =>
        set(s(idx)) match
          case true  => processSubstring(s, set - s(left), left + 1, longest, idx)
          case false => processSubstring(s, set + s(idx), left, longest.max(idx - left + 1), idx + 1)
