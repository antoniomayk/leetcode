object Solution00006:
  def convert(s: String, numRows: Int): String =
    numRows match
      case 1 => s
      case _ =>
        s.foldLeft(List.fill(numRows)(List.empty[Char]), 0, true)({ (t, c) =>
          (t, c) match
            case ((m, r, true), c) => processCharacter(m, r, c, r + 1 < m.size)
            case ((m, r, _), c)    => processCharacter(m, r, c, r - 1 < 0)
        })._1
          .map(_.mkString)
          .mkString

  def processCharacter(m: List[List[Char]], r: Int, c: Char, b: Boolean): (List[List[Char]], Int, Boolean) =
    (m.updated(r, m(r) :+ c), if (b) r + 1 else r - 1, b)
