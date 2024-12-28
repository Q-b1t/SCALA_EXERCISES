class Practice {
  //example_1
  def example_1(f:() => Unit ) : Unit = {
    f
  }

  //example_2
  def example_2(num:Int,  f:(Int)=>Int ): Int = {
    f(num)
  }
  //Ejemplo3

}
object Principal {
  def main(args: Array[String]): Unit = {
    //example_1
    var pr1 = new Practice()


    //example_2
    def multi(num:Int)={
         num*5
    }
    println(pr1.example_2(10,multi) )

    //Ejemplo3
    println(pr1.example_2(10,(x:Int)=>x*20 ))
  }
}