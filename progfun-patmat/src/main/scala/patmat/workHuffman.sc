package patmat

import patmat.Huffman._

object workHuffman {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
                                                  //> t1  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
  encode(t1)("ab".toList)                         //> res0: List[patmat.Huffman.Bit] = List(0, 1)
  decode(t1, encode(t1)("ab".toList))             //> res1: List[Char] = List(a, b)
  convert(Fork(Fork(Leaf('a', 3), Leaf('b', 2), List('a', 'b'), 5),Leaf('d',1),List('a','b','d'), 6))
                                                  //> res2: patmat.Huffman.CodeTable = List((a,List(0, 0)), (b,List(0, 1)), (d,Lis
                                                  //| t(1)))
  
  
}