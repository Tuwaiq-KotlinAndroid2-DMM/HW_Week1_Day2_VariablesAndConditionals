fun main(){

    println("Please enter the First Number")

    var num1 = Integer.valueOf(readLine())

    println("Please enter the Second Number")

    var num2 = Integer.valueOf(readLine())

    println("Please enter the Third Number")

    var num3 = Integer.valueOf(readLine())

    if (num1>num2 && num1>num3)
    {
        println( "the greatest number is: "+num1)
    }

    else if (num2>num1 && num2>num3){

        println("the greatest number is: "+num2)
    }

    else if (num3>num1 && num3>num2){
        println("the greatest number is: "+num3)
    }

}