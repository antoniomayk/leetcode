import scala.annotation.tailrec

object Solution00004:
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double =
    if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1)
    return calculateMedian(nums1, nums2, 0, nums1.length)

  @tailrec
  def calculateMedian(nums1: Array[Int], nums2: Array[Int], l: Int, r: Int): Double = (l <= r) match
    case true =>
      val mid = (nums1.length + nums2.length + 1) / 2
      val mid1 = (l + r) / 2
      val mid2 = mid - mid1
      val l1 = if (mid1 - 1 >= 0) nums1(mid1 - 1) else Integer.MIN_VALUE
      val l2 = if (mid2 - 1 >= 0) nums2(mid2 - 1) else Integer.MIN_VALUE
      val r1 = if (mid1 < nums1.length) nums1(mid1) else Integer.MAX_VALUE
      val r2 = if (mid2 < nums2.length) nums2(mid2) else Integer.MAX_VALUE
      (l1, r1, l2, r2) match
        case (l1, r1, l2, r2) if l1 <= r2 && l2 <= r1 =>
          if ((nums1.length + nums2.length) % 2 == 1) l1 max l2
          else ((l1 max l2) + (r1 min r2)) / 2.0
        case (l1, r1, l2, r2) if l1 > r2 => calculateMedian(nums1, nums2, l, mid1 - 1)
        case _                           => calculateMedian(nums1, nums2, mid1 + 1, r)
    case false => -1
