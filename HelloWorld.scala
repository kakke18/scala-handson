object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")

    // Scalaの制御構文
    // if式
    val age: Int = 17
    if(age < 18) {
      println("18歳未満です．")
    } else {
      println("18歳以上です．")
    }

    // while式
    var i: Int = 0
    while(i <= 10) {
      println("i = " + i)
      i += 1
    }

    // for式
    for(x <- 1 to 3; y <- 1 until 3 if x != y) {
      println("x:" + x + " y: " + y)
    }

    for(e <- List("A", "B", "C")) println(e)

    // match式
    var taro: String = "Taro"
    taro = taro match {
      case "Taro" => "male"
      case "Hanako" => "female"
    }
    println(taro)

    // パターンをまとめる
    "abc" match {
      case "abc" => println("abc")
      case "def" => println("def")
    }
    "abc" match {
      case "abc" | "def" =>
        println("abc")
        println("def")
    }

    // パターンマッチによる値の取り出し
    val lst = List("A", "B", "C")
    lst match {
      case List("A", b, c) =>
        println("b = " + b)
        println("c = " + c)
      case _ =>
        println("nothing")
    }

    val lst2 = List("A", "B", "C")
    lst2 match {
      case List("A", b, c) if b != "B" =>
        println("b = " + b)
        println("c = " + c)
      case _ =>
        println("nothing")
    }

    val lst3 = List(List("A"), List("B","C"))
    lst3 match {
      case List(a@List("A"), x) =>
        println(a)
        println(x)
      case _ =>
        println("nothing")
    }

    // 中置パターンを使った値の取り出し
    val lst4 = List("A", "B", "C")
    lst4 match {
      case "A" ::  b :: c :: _ =>
        println("b = " + b)
        println("c = " + c)
      case _ =>
        println("nothing")
    }

    // 型によるパターンマッチ
    import java.util.Locale
    val obj: AnyRef = "String Literal"
    obj match {
      case v: java.lang.Integer =>
        println("Integer")
      case v: String =>
        println(v.toUpperCase(Locale.ENGLISH))
    }

    // JVM制約による型のパターンマッチの落とし穴
    val obj2: AnyRef = List("A")
    obj2 match {
      case v: List[_] => println("List[_]")
    }

    // 練習問題
    for(i <- 0 until 10) {
      val charList = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match {
        case List(a, b, c, d, _) => List(a, b, c, d, a).mkString
      }
      println(charList)
    }
  }
}
