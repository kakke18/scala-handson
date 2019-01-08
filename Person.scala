class Person(name: String, age: Int, private weight: Int)

// オブジェクト名がPerson以外だとエラー
// 以下のようなものをコンパニオンオブジェクトという
Object Person {
  def printweight() : Unit = {
    val taro = new Person("Taro", 20, 70)
    println(taro.weight)
  }
}
