object Principal {

    def main(args:Array[String]):Unit = {
        var list = List(1,2,3,4)

        // if the value does not exists, the option returns none
        println(list.find(_>8)) // return values greater than 8
        // if the value exiswts, it will return some with the element
        println(list.find(_>0)) // return values greater than 0

        // we can get the value using either get or getOrElse
        println(list.find(_>8).getOrElse(0)) // if it does not find the value it will return 0
        println(list.find(_>0).get) // it will fetch the value and throw and error if to does not 

    }
}