import quickcheck.BinomialHeap
import quickcheck.QuickCheckHeap

object coursera {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(126); 
  println("Welcome to the Scala worksheet");$skip(50); 
  
  val h = new QuickCheckHeap with BinomialHeap
 
 	import h._;System.out.println("""h  : quickcheck.QuickCheckHeap with quickcheck.BinomialHeap = """ + $show(h ));$skip(64); 
 	val x = insert(3, insert(5, insert(1, empty)));System.out.println("""x  : coursera.h.H = """ + $show(x ));$skip(32); 
 	println(for (i <- x) yield i)}
}
