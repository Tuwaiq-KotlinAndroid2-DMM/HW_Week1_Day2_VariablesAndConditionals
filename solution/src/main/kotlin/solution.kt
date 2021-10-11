fun main() {
    println("Please enter first number :")
    var num1 = Integer.valueOf(readLine())
    println("Please enter second number :")
    var num2 = Integer.valueOf(readLine())
    println("Please enter third number :")
    var num3 = Integer.valueOf(readLine())

    if (num1 > num2 && num1 > num3){
        println("the graetest number is :" + num1)
    }else if (num2 > num1 && num2 > num3 ){
        println("the graetest number is :" + num2)

    }else {
       println("the graetest number is : " + num3)
    }

}