object Solution00002:
  def addTwoNumbers(l1: ListNode, l2: ListNode, carry: Int = 0): ListNode = (l1, l2) match
    case (null, null) => if (carry != 0) ListNode(carry) else null
    case (_, null)    => addTwoNumbers(l1, ListNode(carry))
    case (null, _)    => addTwoNumbers(ListNode(carry), l2)
    case (_, _) =>
      val sum = l1.x + l2.x + carry
      ListNode(sum % 10, addTwoNumbers(l1.next, l2.next, sum / 10))
