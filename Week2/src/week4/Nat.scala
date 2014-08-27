package week4

abstract class Nat {
  
  def isZero : Boolean
  def + (that : Nat) : Nat
  def - (that : Nat) : Nat
  def suc = new Succ(this)
  def pred : Nat

}

object Zero extends Nat {
  def isZero = true
  def + (that : Nat) : Nat = that
  def - (that : Nat) : Nat = if (that.isZero) this else throw new Error("0.subtract")
  def pred = throw new Error("0.predessor")
  
  
}

class Succ (n:Nat ) extends Nat {
  def isZero = false
  def pred = n
  def + (that : Nat) : Nat = new Succ (n + that)
  def - (that : Nat) : Nat = if (that.isZero) this else n - that.pred
  
}


