class Person(val name: String, val age: Int) {

    init {
        println("Welcome, $name!")
    }

    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

class Employee(val name: String, val employeeId: Int) {

    constructor(name: String) : this(name, 0)

    fun showDetails() {
        println("Employee Name: $name, Employee ID: $employeeId")
    }
}

class Car(val model: String) {
    var year: Int? = null

    constructor(model: String, year: Int) : this(model) {
        this.year = year
    }

    init {
        println("Car object for model $model created!")
    }

    fun showCarDetails() {
        if (year != null) {
            println("Car Model: $model, Year: $year")
        } else {
            println("Car Model: $model, Year: Not specified")
        }
    }
}

fun main() {
    val person = Person("Saurabh", 20)
    person.displayInfo()

    val employee1 = Employee("Aryan", 101)
    val employee2 = Employee("Rahul")
    employee1.showDetails()
    employee2.showDetails()

    val car1 = Car("Tesla")
    val car2 = Car("BMW", 2022)
    car1.showCarDetails()
    car2.showCarDetails()
}
