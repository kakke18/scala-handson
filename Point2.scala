class Point2(val x: Int, val y: Int) {
  def +(p: Point2): Point2 = {
    new Point2(x + p.x, y + p.y)
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}
