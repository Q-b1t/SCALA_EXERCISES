object Principal{
    def main(args:Array[String]) : Unit = {
        var list = List.range(1,10)

        // anonnymous function
        var pairs = list.filter( (i:Int) => i % 2 == 0 )
        println(s"$pairs")

        var pairs_2 = list.filter( i => i % 2 == 0 )
        println(s"$pairs_2")

        var pairs_3 = list.filter( _ % 2 == 0 )
        println(s"$pairs_3")

    }
}