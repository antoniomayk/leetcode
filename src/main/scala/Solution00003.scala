object Solution00003:
  def lengthOfLongestSubstring(
      s: String,
      chars: Set[Char] = Set.empty,
      l: Int = 0,
      r: Int = 0,
      maxLen: Int = 0
  ): Int =
    if (r == s.length)
      maxLen
    else if (chars(s(r)))
      lengthOfLongestSubstring(s, chars - s(l), r, l + 1, maxLen)
    else
      lengthOfLongestSubstring(s, chars + s(r), l, r + 1, maxLen max (r - l + 1))
