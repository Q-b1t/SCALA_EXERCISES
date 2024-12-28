object Principal {

    def main(args:Array[String]):Unit = {

        def divide(n1:Int,n2:Int) : Float = {
            n1/n2
        }

        try {
            println(divide(1,0)) // will throw an exceptions
        }
        catch {
            case ex : ArithmeticException => println(s"[-] the following exception has raised: ${ex}")
        }


    }
}