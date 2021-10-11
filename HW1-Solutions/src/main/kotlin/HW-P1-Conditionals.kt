fun main() {

    print("Input the 1st number:")
    var num1 = Integer.valueOf(readLine())

    print("Input the 2nd number:")
    var num2 = Integer.valueOf(readLine())

    print("Input the 3rd number:")
    var num3 = Integer.valueOf(readLine())

    if (num1>num2 && num1>num3){

        println("The greatest:" + num1)

    }
    else if (num2>num3 && num2>num1){

        println("The greatest:" + num2)

    }
    else {

        println("The greatest:" +" "+num3)
    }

}