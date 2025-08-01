fun main() {
    val nonNullString: String? = "Kotlin Programming"
    val nullString: String? = null

    println("Testing with non-null string:")
    printLength(nonNullString)

    println("\nTesting with null string:")
    printLength(nullString)
}