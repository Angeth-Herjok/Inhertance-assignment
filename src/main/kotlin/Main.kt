fun main() {
    var car=Car("Nissan","Altima","Black",5)
    car.carry(5)
    car.carry(8)
    car.identity()
 println(car.calculateParkingFees(5))

    var bus=Bus("Nissan","Altima","Black",6,)
   println( bus.maxTripFare(70.00))
    println(bus.calculateParkingFees(4))





}
 open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x=8-5
        var capacity=5
        if (people==capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $x people")
        }
    }
    fun identity() {
        println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours: Int):Int{
        var parkingFees=hours*20
        return parkingFees
    }


}
class Bus( make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity) {
    fun maxTripFare(fare: Double): Double {
        var maxTripFare = fare * capacity
        return maxTripFare
    }

    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var fees=capacity*hours
        return fees
    }
}






