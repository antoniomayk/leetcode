class Solution00007Suite extends munit.FunSuite:
  test("01"):
    val x = 123
    val obtained = Solution00007.reverse(x)
    val expected = 321
    assertEquals(obtained, expected)

  test("02"):
    val x = -123
    val obtained = Solution00007.reverse(x)
    val expected = -321
    assertEquals(obtained, expected)

  test("03"):
    val x = 120
    val obtained = Solution00007.reverse(x)
    val expected = 21
    assertEquals(obtained, expected)

  test("03"):
    val x = -120
    val obtained = Solution00007.reverse(x)
    val expected = -21
    assertEquals(obtained, expected)

  test("04"):
    val x = 1534236469
    val obtained = Solution00007.reverse(x)
    val expected = 0
    assertEquals(obtained, expected)

  test("05"):
    val x = 0
    val obtained = Solution00007.reverse(x)
    val expected = 0
    assertEquals(obtained, expected)

  test("06"):
    val x = 901000
    val obtained = Solution00007.reverse(x)
    val expected = 109
    assertEquals(obtained, expected)

  test("07"):
    val x = -2147483412
    val obtained = Solution00007.reverse(x)
    val expected = -2143847412
    assertEquals(obtained, expected)

  test("08"):
    val x = -2147483648
    val obtained = Solution00007.reverse(x)
    val expected = 0
    assertEquals(obtained, expected)

  test("09"):
    val x = 463847412
    val obtained = Solution00007.reverse(x)
    val expected = 214748364
    assertEquals(obtained, expected)
