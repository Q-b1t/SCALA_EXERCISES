class Employee {
    private var name:String = _
    private var address:String = _
    private var age: Int = _

    def print_info(): Unit = {
        println(s"$name lives at $address and is $age yeas old")
    }

    def this(name:String) = {
        this()
        this.name = name
    }

    
    def this(name:String,address:String) = {
        this(name)
        this.address = address
    }


    def this(name:String,address:String,age:Int) = {
        this(name,address)
        this.age = age
    }
}

object Principal{
    def main(args:Array[String]): Unit = {
        var emp_1 = new Employee("Hector","Mexicalzingo",23)
        emp_1.print_info()
    }
}