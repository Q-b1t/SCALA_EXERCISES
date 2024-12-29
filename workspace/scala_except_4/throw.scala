object Principal {

    def age(age:Int)={
        if (age > 18){
            println("[+] access granted")
        }
        else{
            throw new Exception ("[-] underage")
        }
    }

    def main(args:Array[String]):Unit = {
        println(age(9))
    }
}