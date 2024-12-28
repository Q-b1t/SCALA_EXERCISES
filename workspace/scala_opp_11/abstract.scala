abstract class Person(name:String,last_name:String){
    def upper_case:Unit = {
        println(name.toUpperCase)
    }
    def completeName:String
}

class Student (name:String,last_name:String) extends Person (name,last_name){
    override def completeName : String = name + " " + last_name
}

object Principal {
    def main(args:Array[String]):Unit = {
        var student_1 = new Student(name="James",last_name="Moriarty")
        println(student_1.completeName)
        println(student_1.upper_case)
    }
}