fun main(){
    println("please enter the numbers")
    var num1 = Integer.valueOf(readLine())
    var num2 = Integer.valueOf(readLine())
    var num3 = Integer.valueOf(readLine())
 if (num1>num2 && num1>num3){
     println("the greatest: " + num1)
 }else if (num2>num1 && num2>num3){
     println("the greatest: " + num2)
 }else {
     println("the greatest: " + num3)




}}