object Class {
    def passed = {println("aproved")}
    def suspended = {println("suspended")}
}

object Principal {
    def main(args : Array[String]): Unit = {
        Class.passed
        Class.suspended
    }
}