fun main() {
 /*   Part I - Conditionals.
Take three numbers from the user and print the greatest number.*/
    println("Input the 1st number:")
    var num1 =Integer.valueOf(readLine())

    println("Input the 2st number:")
    var num2 =Integer.valueOf(readLine())

    println("Input the 3st number:")
    var num3 =Integer.valueOf(readLine())

 if (num1>=num2 && num1 >= num3){
     println("The greatest: $num1")
 }else  if (num2>=num1 && num2 >= num3){
     println("The greatest: $num2")
 }else{
     println("The greatest: $num3")
 }
/*Part II - Variables.
Write a Kotlin program to print the sum of two numbers.*/
    println("Input the 1st number:")
    var n1 =Integer.valueOf(readLine())

    println("Input the 1st number:")
    var n2 =Integer.valueOf(readLine())

//    var sum = n1 +n2

    println(n1+n2)
}