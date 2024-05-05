import scala.collection.mutable.HashMap

object Solution00001:
  def twoSum(nums: Array[Int], target: Int): Array[Int] = twoSumHelper(0, target, nums, new HashMap[Int, Int])

  def twoSumHelper(index: Int, target: Int, nums: Array[Int], map: HashMap[Int, Int]): Array[Int] = index match
    case index if index > nums.length => Array.empty
    case _ =>
      map.get(target - nums(index)) match
        case Some(x) => Array(x, index)
        case None    => twoSumHelper(index + 1, target, nums, putKeyVal(map, nums(index), index))

  def putKeyVal(map: HashMap[Int, Int], key: Int, value: Int) =
    map.put(key, value)
    map
