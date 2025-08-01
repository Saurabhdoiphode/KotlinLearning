class Car(val make: String, val model: String, val year: Int, var mileage: Double) {

    fun details() {
        println("Car Details:")
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
        println("Mileage: $mileage km")
    }

    fun drive(miles: Double) {
        mileage += miles
        println("$miles km driven.")
    }
}

fun main() {
    val myCar = Car("Toyota", "Corolla", 2020, 25000.0)

    myCar.details()

    myCar.drive(150.0)

    println("\nAfter driving:")
    myCar.details()
}