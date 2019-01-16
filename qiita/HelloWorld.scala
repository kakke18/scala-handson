object HelloWorld{
  def main(args: Array[String]): Unit = {
    if(args.size == 0){
      val strs = Array("Hello", "World")
      output(strs)
    } else {
      printf("Invalid args.")
    }
  }

  def output(strs: Array[String]): Unit = {
    for(str <- strs){
      printf("%s ", str)
    }
  }
}
