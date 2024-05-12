class Solution00006Suite extends munit.FunSuite:
  test("01"):
    val s = "PAYPALISHIRING"
    val obtained = Solution00006.convert(s, 3)
    val expected = "PAHNAPLSIIGYIR"
    assertEquals(obtained, expected)

  test("02"):
    val s = "PAYPALISHIRING"
    val obtained = Solution00006.convert(s, 4)
    val expected = "PINALSIGYAHRPI"
    assertEquals(obtained, expected)

  test("03"):
    val s = "A"
    val obtained = Solution00006.convert(s, 1)
    val expected = "A"
    assertEquals(obtained, expected)

  test("04"):
    val s = "AB"
    val obtained = Solution00006.convert(s, 1)
    val expected = "AB"
    assertEquals(obtained, expected)

  test("05"):
    val s = "ABC"
    val obtained = Solution00006.convert(s, 1)
    val expected ="ABC"
    assertEquals(obtained, expected)

  test("06"):
    val s = "ABCD"
    val obtained = Solution00006.convert(s, 1)
    val expected ="ABCD"
    assertEquals(obtained, expected)
