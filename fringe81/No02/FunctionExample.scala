object FunctionExample{
  def main(args: Array[String]){
    var calc = (x: Int) => x + 5: Int

    println("y=" + calc(1))
    println("y=" + calc(2))
  }
}
