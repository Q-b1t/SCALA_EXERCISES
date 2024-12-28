object Principal {

    def main(args:Array[String]):Unit = {

        // create options
        val option_1:Option[Int]=None 
        
        val option_2:Option[Int]=Some(10) 

        println(option_1.getOrElse(1)) // otherwise, it will throw and error due to not finding a value
        println(option_2.get)
    

    }
}