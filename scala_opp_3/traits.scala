trait Trait1 {
    var age : Int = _ 
    def print_info(name:String) : Unit
    def print_info_2(): Unit =  {
        println("This method is written inside the trait")
    }
}

trait Trait2 {
    def print_trait_2() : Unit
}

class Person extends Trait1 with Trait2 {
    def print_info(name:String):Unit = {
        println(name.toUpperCase())
    }
    override def print_info_2(): Unit = {
        println("This method has been overriden inside the function")
    }

    def print_trait_2() : Unit = {
        println("This method is written in trait 2")
    }
}

object Principal{
    def main(args:Array[String]):Unit = {
        var person_1 = Person()
        person_1.print_info("Kent")
        person_1.age = 20
        println(person_1.age)
        person_1.print_info_2()
        person_1.print_trait_2()
    }
}