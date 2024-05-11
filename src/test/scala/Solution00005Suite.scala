class Solution00005Suite extends munit.FunSuite:
  test("01"):
    val s = "babad"
    val obtained = Solution00005.longestPalindrome(s)
    val expected = "bab"
    assertEquals(obtained, expected)

  test("02"):
    val s = "cbbd"
    val obtained = Solution00005.longestPalindrome(s)
    val expected = "bb"
    assertEquals(obtained, expected)
