data class Student(val name: String, val age: Int, val company: String)

fun main() {
    // Immutable list
    val studentsImmutable = listOf(
        Student("Saurabh", 20, "Google"),
        Student("Aryan", 21, "Microsoft"),
        Student("Rahul", 22, "Amazon"),
        Student("Neha", 23, "Infosys"),
        Student("Priya", 24, "TCS")
    )

    println("Immutable list of students:")
    for (s in studentsImmutable) {
        println(s)
    }

    // studentsImmutable.add(Student("Rohit", 25, "Wipro"))
    // ❌ Error: listOf() creates an immutable list, so we cannot add new items.

    // Mutable list
    val studentsMutable = mutableListOf("Saurabh", "Aryan", "Rahul", "Neha", "Priya")

    studentsMutable.add("Rohit")
    studentsMutable.add("Sneha")
    studentsMutable[1] = "Arjun"
    studentsMutable.remove("Rahul")
    println("Name at index 2: ${studentsMutable[2]}")

    println("\nPrinting using for loop:")
    for (name in studentsMutable) {
        println(name)
    }

    println("\nPrinting using iterator:")
    val iterator = studentsMutable.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
