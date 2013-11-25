import quickcheck.BinomialHeap
import quickcheck.QuickCheckHeap

object coursera {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val h = new QuickCheckHeap with BinomialHeap    //> h  : quickcheck.QuickCheckHeap with quickcheck.BinomialHeap = Prop
 
 	import h._
 	val x = insert(3, insert(5, insert(1, empty)))
                                                  //> x  : coursera.h.H = List(Node(3,0,List()), Node(1,1,List(Node(5,0,List()))))
                                                  //| 
 	println(for (i <- x) yield i)             //> List(Node(3,0,List()), Node(1,1,List(Node(5,0,List()))))
}