fun main(args: Array<String>) {
    //Asking the user to enter the numbers
    print("Enter the 1st number: ")
    var num1 = Integer.valueOf(readLine())
    print("Enter the 2nd number: ")
    var num2 = Integer.valueOf(readLine())
    print("Enter the 3rd number: ")
    var num3 = Integer.valueOf(readLine())

    //Declration of Max
    var max: Int

    //Conditions to determine the max value
    if (num1 > num2 && num1 > num3){
        max = num1
    }
    else if (num2 > num1 && num2 > num3){
        max = num2
    }
    else{
        max = num3
    }

    //Printing the result for the user
    println("The greatest:" + max)

}