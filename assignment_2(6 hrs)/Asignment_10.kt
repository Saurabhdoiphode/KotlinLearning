fun main() {
    val immutableMap = mapOf(
        "India" to "New Delhi",
        "USA" to "Washington D.C.",
        "Japan" to "Tokyo"
    )

    println("Immutable map: $immutableMap")

    val mutableMap = mutableMapOf(
        "India" to "New Delhi",
        "USA" to "Washington D.C.",
        "Japan" to "Tokyo"
    )

    mutableMap["France"] = "Paris"
    mutableMap["Germany"] = "Berlin"
    mutableMap["India"] = "Delhi"
    mutableMap.remove("Japan")

    println("Capital of USA: ${mutableMap["USA"]}")

    println("\nPrinting using for loop:")
    for ((country, capital) in mutableMap) {
        println("$country -> $capital")
    }

    println("\nPrinting using iterator:")
    val iterator = mutableMap.entries.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        println("${entry.key} -> ${entry.value}")
    }
}
