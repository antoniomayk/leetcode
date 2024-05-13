object Solution00001:
  def twoSum(nums: Array[Int], target: Int, idx: Int = 0, map: Map[Int, Int] = Map[Int, Int]()): Array[Int] =
    if (nums.length < idx) Array.empty
    else
      map.get(target - nums(idx)) match
        case Some(x) => Array(x, idx)
        case None    => twoSum(nums, target, idx + 1, map + ((nums(idx), idx)))
