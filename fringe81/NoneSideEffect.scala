object NoneSideEffect{
  def main(args: Array[String]){
    var add = (x: Int) => x + 5

    println("total = " + add(1))
    println("total = " + add(1))
    println("total = " + add(1))
  }
}
