import scala.io.Source

object Principal {

    def main(args:Array[String]):Unit = {
        var file = "./temp/pg46036.txt"

        println("[~] method 1")

        // option 1
        for (line<- Source.fromFile(file).getLines()){
            println(line)
        }

        // option 2
        println("[~] method 2")
        val lines_ = Source.fromFile(file).getLines().toList
        lines_.foreach(x=>println(x))        

        println("[~] method 3")
        
        // option 3
        var lines = Source.fromFile(file)
        for (line<-lines.getLines()){
            println(line)
        }
        lines.close() // close the file


    }
}


