class Solution00002Suite extends munit.FunSuite:
  test("01"):
    val l1 = ListNode(2, ListNode(4, ListNode(3)))
    val l2 = ListNode(5, ListNode(6, ListNode(4)))
    val obtained = Solution00002.addTwoNumbers(l1, l2)
    val expected = ListNode(7, ListNode(0, ListNode(8)))
    assertEquals(obtained, expected)

  test("02"):
    val l1 = ListNode(0)
    val l2 = ListNode(0)
    val obtained = Solution00002.addTwoNumbers(l1, l2)
    val expected = ListNode(0)
    assertEquals(obtained, expected)

  test("03"):
    val l1 = ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))))
    val l2 = ListNode(9, ListNode(9, ListNode(9, ListNode(9))))
    val obtained = Solution00002.addTwoNumbers(l1, l2)
    val expected = ListNode(8, ListNode(9, ListNode(9, ListNode(9, ListNode(0, ListNode(0, ListNode(0, ListNode(1))))))))
    assertEquals(obtained, expected)
