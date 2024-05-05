class Solution00001Suite extends munit.FunSuite:
  test("01"):
    val nums = Array(2, 7, 11, 15)
    val target = 9
    val obtained = Solution00001.twoSum(nums, target)
    val expected = Array(0, 1)
    assertEquals(obtained.toSeq, expected.toSeq)

  test("02"):
    val nums = Array(3, 2, 4)
    val target = 6
    val obtained = Solution00001.twoSum(nums, target)
    val expected = Array(1, 2)
    assertEquals(obtained.toSeq, expected.toSeq)

  test("03"):
    val nums = Array(3, 3)
    val target = 6
    val obtained = Solution00001.twoSum(nums, target)
    val expected = Array(0, 1)
    assertEquals(obtained.toSeq, expected.toSeq)
