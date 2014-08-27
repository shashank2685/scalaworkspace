object collections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def isPrime(n : Int) : Boolean = if(n==2) true else 2 until n forall(x => n % x != 0)
                                                  //> isPrime: (n: Int)Boolean
  isPrime(4)                                      //> res0: Boolean = false
	isPrime(5)                                //> res1: Boolean = true
	isPrime(21)                               //> res2: Boolean = false
	isPrime(2)                                //> res3: Boolean = true
	
	val n = 7                                 //> n  : Int = 7
	
	((1 until n) flatMap ( i => 1 until i map (j => (i, j)))) filter { case (x,y) => isPrime(x + y) }
                                                  //> res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
                                                  
  def scalarProduct(xs: List[Double], ys: List[Double]) : Double = (for ((x,y) <- xs zip ys) yield x * y).sum
                                                  //> scalarProduct: (xs: List[Double], ys: List[Double])Double
}