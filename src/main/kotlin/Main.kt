fun main() {
    print("Please enter first number: ")
    val firstNumber = Integer.valueOf(readLine())

    print("Please enter second number: ")
    val secondNumber = Integer.valueOf(readLine())

    print("Please enter third number: ")
    val thirdNumber = Integer.valueOf(readLine())

    var greatest = firstNumber

    if (secondNumber > greatest) {
        greatest = secondNumber
    }

    if (thirdNumber > greatest) {
        greatest = thirdNumber
    }

    println("The greatest number is: $greatest")
}