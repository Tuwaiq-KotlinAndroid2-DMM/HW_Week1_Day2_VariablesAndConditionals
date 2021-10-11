fun main(){

    println("Enter the first number : ")
    var num1 = Integer.valueOf(readLine())

    println("Enter the second number : ")
    var num2 = Integer.valueOf(readLine())

    println("Enter the third number : ")
    var num3 = Integer.valueOf(readLine())

    if (num1 >= num2 && num1 >= num3){
        println("The greatest : " + num1)
    }
    else if (num2 >= num1 && num2 >= num3) {

        println("The greatest : " + num2)

    }

    else{
        println("The greatest : " + num3)
    }

}