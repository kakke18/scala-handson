class Person(name: String, age: Int, private val weight: Int)

// オブジェクト名がPerson以外だとエラー
// 以下のようなものをコンパニオンオブジェクトという
object Person {
  def printweight() : Unit = {
    val taro = new Person("Taro", 20, 70)
    println(taro.weight)
  }
}
