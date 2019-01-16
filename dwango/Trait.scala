trait TraitA {
  def greet(): Unit
}

trait TraitB extends TraitA {
  def greet(): Unit = println("Good morning")
}

trait TraitC extends TraitA {
  def greet(): Unit = println("Good evening")
}

// overrideしないとメソッド定義の衝突によりエラー
class ClassA extends TraitB with TraitC {
  override def greet(): Unit = {
    println("How are you?")
    super[TraitB].greet()
    super[TraitC].greet()
  }
}

trait TraitD extends TraitA {
  override def greet(): Unit = println("Good morning")
}

trait TraitE extends TraitA {
  override def greet(): Unit = println("Good evening")
}

// トレイトの継承順番が線形化されたため，エラーにならない
// ミックスインの順番に依存
class ClassB extends TraitD with TraitE
class ClassC extends TraitE with TraitD

trait TraitF {
  def greet(): Unit = println("Hello")
}

trait TraitG extends TraitF {
  override def greet() : Unit = {
    super.greet()
    println("My name is Terebi-chan.")
  }
}

trait TraitH extends TraitF {
  override def greet() : Unit = {
    super.greet()
    println("I like niconico.")
  }
}

// superを用いて線形化された親トレイトを使用
class ClassD extends TraitG with TraitH
class ClassE extends TraitH with TraitG

trait A {
  val foo: String
}

trait B extends A {
  val bar = foo + "World"
}

// 'nullWorld'と表示
class C extends B {
  val foo = "Hello"
  def printBar(): Unit = println(bar)
}

trait B2 extends A {
  lazy val bar = foo + "World"
}

// 'HelloWorld'と表示
class C2 extends B2 {
  val foo = "Hello"
  def printBar(): Unit = println(bar)
}
