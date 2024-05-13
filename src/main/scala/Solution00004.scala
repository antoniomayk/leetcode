object Solution00004:
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double =
    if (nums1.size > nums2.size) return findMedianSortedArrays(nums2, nums1)
    return calculateMedian(nums1, nums2, 0, nums1.size)

  def calculateMedian(nums1: Array[Int], nums2: Array[Int], l: Int, r: Int): Double =
    if (l <= r)
      val mid = (nums1.size + nums2.size + 1) / 2
      val mid1 = (l + r) / 2
      val mid2 = mid - mid1
      val l1 = if (mid1 - 1 >= 0) nums1(mid1 - 1) else Int.MinValue
      val l2 = if (mid2 - 1 >= 0) nums2(mid2 - 1) else Int.MinValue
      val r1 = if (mid1 < nums1.size) nums1(mid1) else Int.MaxValue
      val r2 = if (mid2 < nums2.size) nums2(mid2) else Int.MaxValue
      (l1, r1, l2, r2) match
        case (l1, r1, l2, r2) if l1 <= r2 && l2 <= r1 =>
          if ((nums1.size + nums2.size) % 2 == 1) l1 max l2
          else ((l1 max l2) + (r1 min r2)) / 2.0
        case (l1, r1, l2, r2) if l1 > r2 => calculateMedian(nums1, nums2, l, mid1 - 1)
        case _                           => calculateMedian(nums1, nums2, mid1 + 1, r)
    else -1
