import java.io._ // there are not built in scala methods so we use the java ones

object Principal {

    def main(args:Array[String]):Unit = {
 
        
        // option 1: PrintWriter

        val file_name_1 = "./temp/out.txt"

        val file = new PrintWriter(
                (
                    new File(file_name_1)
                )
            )
        file.write("ca c'est une preuve")
        file.close()

        // option 2: fileWriter

        val file_name_2 = "./temp/out2.txt"

        var file_2 = new File(file_name_2)

        val buffer_writer = new BufferedWriter(
            new FileWriter(file_2)
        )

        buffer_writer.write("questa e la prima prova")

        buffer_writer.close()
        

    }
}