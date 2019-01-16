object FirstClassFuntion{
  def main(args: Array[String]){
    val add = (x:Int) => {
      val _add = (x: Int) => x + 5
      _add(x)
    }

    println("total = " + add(1))
    println("total = " + add(2))
    println("total = " + add(1))
  }
}
