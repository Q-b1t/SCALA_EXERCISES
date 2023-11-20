class Student {
    var name : String = _
}

object Student {
    def apply(name:String): Student = {
        var student = new Student
        student.name = name
        student
    }
}

object Principal {
    def main(args : Array[String]) : Unit = {
        var student = Student("Luis")
        println(student.name)
    }
}