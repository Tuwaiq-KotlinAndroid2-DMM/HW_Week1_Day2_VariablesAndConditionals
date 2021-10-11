fun main() {

    //compare three numbers
    println("enter three numbers to compare which is greatest")
    var numOne = Integer.valueOf(readLine())
    var numTwo = Integer.valueOf(readLine())
    var numThree = Integer.valueOf(readLine())

    if (numOne > numTwo && numOne > numThree) {
        println("$numOne is the greatest among the three numbers")
    } else if (numTwo > numOne && numTwo > numThree) {
        println("$numTwo is the greatest among the three numbers")
    } else {
        println("$numThree is the greatest among the three numbers")
    }


    // two numbers addition
    println("enter two numbers to get result of their addition")
    var first = Integer.valueOf(readLine())
    var second = Integer.valueOf(readLine())

    println(first + second)


}