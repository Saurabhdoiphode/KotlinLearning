fun main() {
    val numbers = mutableSetOf(1, 2, 3, 3, 4, 5, 5)  // duplicates ignored
    println("Initial set: $numbers")

    val added = numbers.add(2)
    println("Attempt to add duplicate 2: $added") // false, already exists

    numbers.add(6)
    numbers.add(7)
    println("After adding 6 and 7: $numbers")

    numbers.remove(4)
    numbers.add(40)
    println("After updating 4 to 40: $numbers")

    numbers.remove(1)
    println("After removing 1: $numbers")

    println("\nPrinting using for loop:")
    for (num in numbers) {
        println(num)
    }

    println("\nPrinting using iterator:")
    val iterator = numbers.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
