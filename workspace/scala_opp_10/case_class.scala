case class Student(name:String,age:Int)

object Principal{
    def main(args : Array[String]):Unit = {
        var student_1 = Student("albert",25)
        println(student_1.hashCode())
        var student_2 = student_1.copy(name="Raul",age = 40)
        println( student_1 == student_2)
        println(student_1)
        println(student_1.equals(student_2))
    }
}