object Principal {

    def main(args:Array[String]):Unit = {

        def calculate(n1:Int,n2:Int,n3:Int):Int = {
            n1 + n2 + n3
        }

        val x = calculate(1,1,_:Int) // will create a lambda function

        println(x(1))

    }
}