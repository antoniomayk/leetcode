class Solution00003Suite extends munit.FunSuite:
  test("01"):
    val s = "abcabcbb"
    val obtained = Solution00003.lengthOfLongestSubstring(s)
    val expected = 3
    assertEquals(obtained, expected)

  test("02"):
    val s = "bbbbb"
    val obtained = Solution00003.lengthOfLongestSubstring(s)
    val expected = 1
    assertEquals(obtained, expected)

  test("03"):
    val s = "pwwkew"
    val obtained = Solution00003.lengthOfLongestSubstring(s)
    val expected = 3
    assertEquals(obtained, expected)
