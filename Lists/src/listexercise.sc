import math.Ordering
object listexercise {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def init[T](xs : List[T]) : List[T] = xs match {
  	case List() => throw new Error("Init on empty list\n")
  	case List(x) => List()
  	case y :: ys => y :: init(ys)
  }                                               //> init: [T](xs: List[T])List[T]
  
  def concat[T](xs : List[T], ys : List[T]) : List[T]= xs match {
  	case List() => ys
  	case a :: ab => a :: concat ( ab, ys )
  }                                               //> concat: [T](xs: List[T], ys: List[T])List[T]
  
  def removeAt[T]( xs : List[T], i : Int) : List[T] = {
  
  	if ( i >= xs.length ) xs
  	else i match {
  		case 0 => xs.tail
  		case x => xs.head :: removeAt[T]( xs.tail, i - 1)
  	}
  }                                               //> removeAt: [T](xs: List[T], i: Int)List[T]
  
  removeAt[Char](List('a', 'b', 'c', 'd'), 5)     //> res0: List[Char] = List(a, b, c, d)
  
  def msort[T](xs: List[T])(implicit ord : Ordering[T]): List[T] = {
  	val n = xs.length / 2
  	if (n == 0) xs
  	else {
  		def merge(xs:List[T], ys:List[T]):List[T] = {
  			(xs, ys) match {
  				case (xs, Nil) => xs
  				case (Nil, ys) => ys
  				case (x :: xs1, y :: ys1) => if (ord.lt(x, y)) x :: merge(xs1, ys)
  																		 else y :: merge(xs, ys1)
  			}
  		}
  		val (fst, snd) = xs splitAt n
  		merge(msort(fst), msort(snd))
  	}
  }                                               //> msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]
  
  val num = List(1, -4, 6, 4, 9, 11, 10, 11, 5)   //> num  : List[Int] = List(1, -4, 6, 4, 9, 11, 10, 11, 5)
  msort(num)                                      //> res1: List[Int] = List(-4, 1, 4, 5, 6, 9, 10, 11, 11)
  val s = List("apple","peaches", "orange", "banana",  "pineapple")
                                                  //> s  : List[String] = List(apple, peaches, orange, banana, pineapple)
  msort(s)                                        //> res2: List[String] = List(apple, banana, orange, peaches, pineapple)
  
  
  num map (x => x * x)                            //> res3: List[Int] = List(1, 16, 36, 16, 81, 121, 100, 121, 25)
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())((x, y) => f(x) :: y) //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
    
  mapFun[Int, Int](num, (x => x * x))             //> res4: List[Int] = List(1, 16, 36, 16, 81, 121, 100, 121, 25)
  
  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)((x, y) => 1 + y)             //> lengthFun: [T](xs: List[T])Int

	lengthFun[Int](num)                       //> res5: Int = 9
}