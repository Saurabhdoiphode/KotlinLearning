class Person(val name: String, val age: Int) {

    init {
        println("Welcome, $name!")
    }

    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val person1 = Person("Saurabh", 20)
    person1.displayInfo()

    val person2 = Person("Aryan", 19)
    person2.displayInfo()
}
