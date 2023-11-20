class Student(name:String,last_name:String){
    var age:Int =_ 
    def vizualize():Unit = {
        println(name);
        println(last_name);
        println(age)
    }
}


object Principal{
    def main(args:Array[String]):Unit = {
        var age = 10
        var student_1 = new Student(name = "luis",last_name = "dario")
        student_1.age = age
        println(student_1.age)
        student_1.vizualize()
    }
}