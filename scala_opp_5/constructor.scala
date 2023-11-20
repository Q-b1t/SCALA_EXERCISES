class Product(var code: Int, var name: String){
    println("This is the constructor")

    var pvp : Int = _
    def this(code: Int,name:String,pvp:Int) =  {
        this(code,name)
        this.pvp = pvp
    }

    def print_stuff(): Unit = {
        println(s"CODE: $code | NAME: $name")
    }

    println("I am still in the constructor")
}


object Principal{
    def main(args:Array[String]): Unit = {
        var product_1 = Product(code = 2,name = "lol",pvp = 3)
        product_1.print_stuff()
        println(product_1.pvp)
    }
}