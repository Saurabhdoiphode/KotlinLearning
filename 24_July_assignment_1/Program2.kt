fun main() {
    print("Enter first number: ")
    val num1 = readLine()!!.toInt()

    print("Enter second number: ")
    val num2 = readLine()!!.toInt()

    val sum = num1 + num2
    println("The sum is: $sum")

    if (sum > 0) {
        println("The sum is positive.")
    } else if (sum < 0) {
        println("The sum is negative.")
    } else {
        println("The sum is zero.")
    }
}