class Person(val name: String, val age: Int) {

    constructor(name: String) : this(name, 18)

    init {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val person1 = Person("Saurabh", 20)
    val person2 = Person("Aryan")
}
