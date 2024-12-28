class Vehicle{
    var hp : Int  = _ 
    var cf : Int = _ 
    def visualize_data() : Unit = {
        println(s"The vehicle has $hp horsepower units and $cf car frame")
    }
}

class Car extends Vehicle{
    var wheels: Int = _ 
    def visualize_data_car() : Unit = {
        println(s"The car has $wheels")
    }
}


object Principal{
    def main(args:Array[String]):Unit = {
        var car = new Car()
        car.hp = 3
        car.cf = 23
        car.wheels = 4
        car.visualize_data()
        car.visualize_data_car()
    }
}