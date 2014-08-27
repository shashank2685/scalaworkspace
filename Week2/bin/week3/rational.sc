package week3

object rational {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  new Rational(1,2)                               //> java.lang.NoClassDefFoundError: week3/Rational (wrong name: week3/rational)
                                                  //| 	at java.lang.ClassLoader.defineClass1(Native Method)
                                                  //| 	at java.lang.ClassLoader.defineClass(Unknown Source)
                                                  //| 	at java.security.SecureClassLoader.defineClass(Unknown Source)
                                                  //| 	at java.net.URLClassLoader.defineClass(Unknown Source)
                                                  //| 	at java.net.URLClassLoader.access$100(Unknown Source)
                                                  //| 	at java.net.URLClassLoader$1.run(Unknown Source)
                                                  //| 	at java.net.URLClassLoader$1.run(Unknown Source)
                                                  //| 	at java.security.AccessController.doPrivileged(Native Method)
                                                  //| 	at java.net.URLClassLoader.findClass(Unknown Source)
                                                  //| 	at java.lang.ClassLoader.loadClass(Unknown Source)
                                                  //| 	at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
                                                  //| 	at java.lang.ClassLoader.loadClass(Unknown Source)
                                                  //| 	at week3.rational$$anonfun$main$1.apply$mcV$sp(week3.rational.scala:5)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
}

class Rational(x: Int, y:Int) {
def numer = x
def denom = y
}