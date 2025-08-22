fun main() {
    print("Enter exam score: ")
    val score = readLine()!!.toInt()

    if (score > 90) {
        println("Excellent")
    } else if (score in 75..90) {
        println("Good")
    } else if (score in 50..74) {
        println("Pass")
    } else {
        println("Fail")
    }

    val result = if (score > 90) {
        "Excellent"
    } else if (score in 75..90) {
        "Good"
    } else if (score in 50..74) {
        "Pass"
    } else {
        "Fail"
    }

    println("Result using if-expression: $result")
}
