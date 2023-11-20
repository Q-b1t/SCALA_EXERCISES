object Principal {

    def main(args:Array[String]):Unit = {

        def sum(x:Int,y:Int) : Int = x+y
        def sum1(x:Int):Int => Int = (y:Int) => x+y
        def sum2(x:Int)(y:Int) : Int = x+y

        println(sum(10,20))
        println(sum1(10)(40))
        val v1 = sum(50)

        println(v1(100))
        println(sum2(80)(40))

        val v2 = sum2(90)_ 
        println(v2(90))
    }
}