class Greeting {
    def greeting(){
        println("hellou")
    }

    def greeting(name: String){
        println(s"guten tag, ich heibe ${name}")
    }

    def greeting(name:String,country:String){
        println(s"buongiorno, mi chiamo ${name} e vengo da ${country}")
    }


}


object Principal {

    def main(args:Array[String]):Unit = {
        var greeting = new Greeting()

        greeting.greeting()

        greeting.greeting(name= "dario")

        greeting.greeting(name="dario",country="messico")
    }
}


