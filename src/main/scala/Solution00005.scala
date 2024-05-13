object Solution00005:
  def longestPalindrome(s: String): String =
    s.indices
      .foldLeft((s, ""))({ (t, idx) =>
        val p1 = expand(t._1, idx, idx, t._2)
        val p2 = expand(t._1, idx, idx + 1, t._2)
        val lp = Seq(p1, p2, t._2).maxBy(_.size)
        (t._1, lp)
      })
      ._2

  def expand(s: String, l: Int, r: Int, lp: String): String =
    if (l >= 0 && r < s.size && s(l) == s(r))
      expand(s, l - 1, r + 1, Seq(lp, s.slice(l, r + 1)).maxBy(_.size))
    else lp
