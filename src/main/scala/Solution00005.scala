object Solution00005:
  def longestPalindrome(s: String): String =
    s.indices.foldLeft((s, ""))(findLongestPalindromeAt)._2

  def findLongestPalindromeAt(t: (String, String), idx: Int): (String, String) =
    (
      t._1,
      findLongestPalindromeBetween(
        expandAroundCenter(t._1, idx, idx, t._2),
        expandAroundCenter(t._1, idx, idx + 1, t._2),
        t._2
      )
    )

  def findLongestPalindromeBetween(pl1: String, pl2: String, lpl: String): String =
    val longestestPalindrome = if (pl1.size > pl2.size) pl1 else pl2
    if (longestestPalindrome.size > lpl.size) longestestPalindrome else lpl

  def expandAroundCenter(s: String, l: Int, r: Int, p: String): String =
    (l >= 0 && r < s.size && s(l) == s(r)) match
      case true =>
        if (p.size < (r + 1) - l)
          expandAroundCenter(s, l - 1, r + 1, s.slice(l, (r + 1)))
        else
          expandAroundCenter(s, l - 1, r + 1, p)
      case _ => p
