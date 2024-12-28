object Principal {

    def main(args:Array[String]):Unit = {
        var number = 10 // first declaration

        val sum = (x:Int) => {
            number = x * number
            number
        }

        number = 5
        println(sum(4))

    }
}