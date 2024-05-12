object Solution00006:
  def convert(s: String, numRows: Int): String =
    numRows match
      case 1 => s
      case _ =>
        s.foldLeft(List.fill(numRows)(List.empty), 0, true)(processCharacterState)._1.map(_.mkString).mkString

  def processCharacterState(st: (List[List[Char]], Int, Boolean), c: Char): (List[List[Char]], Int, Boolean) =
    (st, c) match
      case ((m, r, true), c) => processCharacter(m, r, c, r + 1 < m.size)
      case ((m, r, _), c)    => processCharacter(m, r, c, r - 1 < 0)

  def processCharacter(m: List[List[Char]], r: Int, c: Char, md: Boolean): (List[List[Char]], Int, Boolean) =
    (m.updated(r, m(r) :+ c), if (md) r + 1 else r - 1, md)
