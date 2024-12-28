object Principal {

    def main(args:Array[String]):Unit = {

        try {
            val array_1 = Array(1,2,4,5)

            array_1(20) // reference an index that does not exists to throw an exepctions
        }
        catch {
            case ex : Throwable => println(s"[-] the following exception has raised: ${ex}")
        }


    }
}