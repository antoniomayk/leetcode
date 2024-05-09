class Solution00004Suite extends munit.FunSuite:
  test("01"):
    val nums1 = Array(1,3)
    val nums2 = Array(2)
    val obtained = Solution00004.findMedianSortedArrays(nums1, nums2)
    val expected = 2.0
    assertEquals(obtained, expected)

  test("02"):
    val nums1 = Array(1,2)
    val nums2 = Array(3,4)
    val obtained = Solution00004.findMedianSortedArrays(nums1, nums2)
    val expected = 2.5
    assertEquals(obtained, expected)