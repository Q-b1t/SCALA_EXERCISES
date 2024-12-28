class Student(var name: String,var last_name : String, var t :String){
    override def toString : String = "Name: " + name + " " + last_name + " " + t
}

object Student {
    val TYPE_VIP = "VIP"
    val TYPE_NORMAL = "NORMAL"
    def static = {
        println("This is a static method")
    }
}

object Principal {
    def main(args:Array[String]): Unit = {
        var student = new Student("Albert","Morrigan",Student.TYPE_VIP)
        Student.static
        println(student)
    }
}