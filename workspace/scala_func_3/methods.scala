object Principal {
    def main(main:Array[String]) : Unit = {
        def method1 = {
            (x:Int) => x*2
        }
        val v1 = method1
        println(v1(100))
    }
}

