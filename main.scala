object main {
  def main(args: Array[String]):Unit = {
    println("---Compositions---")
    println("testCompose", Compositions.testCompose((a:Int)=> a*3)((b:Int)=>b*2)((c:Int)=>Math.pow(c,2)/100)(5))
    println("testMapFlatMap", Compositions.testMapFlatMap((a:Int)=> Some(a.toString))((b:String)=> Some(b.isBlank))((c:Boolean)=> c.toString)(Some(5)))
    println("testForComprehension", Compositions.testForComprehension((a:Int)=> Some(a.toString))((b:String)=> Some(!b.isBlank))((c:Boolean)=> c.toString)(Some(5)))
    println("---RecursiveData---")
    println ("testReverse", RecursiveFunctions.testReverse(Cons(1,Cons(2,Cons(3, Nil())))))
    println("testMap", RecursiveFunctions.testMap(Cons(1,Cons(2,Cons(3, Nil()))),(a:Int)=>a*2))
    println("testFlatMap", RecursiveFunctions.testFlatMap(Cons(1,Cons(2,Cons(3, Nil()))),(a:Int)=>Cons(a*2,Nil())))
    println("---RecursiveFunc---")
    println("testListIntEmpty", RecursiveData.testListIntEmpty(Cons(1,Nil())))
    println("testListIntHead", RecursiveData.testListIntHead(Cons(1,Nil())))
  }
}
