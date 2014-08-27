package week4

trait Expr {
  
  def isSum: Boolean
  def isNum: Boolean
  def numValue : Int
  def lefOpr : Expr
  def rigOpr : Expr

}

class Num (val numValue:Int ) extends Expr {
  def isNum = true
  def isSum = false
  def lefOpr = throw new Error("number.lefOpr")
  def rigOpr = throw new Error("number.rigOpr")
}

class Sum(e1: Expr, e2:Expr ) extends Expr {
  def isNum = false
  def isSum = true
  def numValue = throw new Error("expr.numValue")
  def lefOpr = e1
  def rigOpr = e2
}