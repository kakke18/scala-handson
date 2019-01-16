object SideEffect{
  var total = 0

  def main(args: Array[String]){
    var add = (x: Int) => {
      total += x
      total
    }
    println("total = " + add(1))
    println("total = " + add(1))
    println("total = " + add(1))
  }
}
