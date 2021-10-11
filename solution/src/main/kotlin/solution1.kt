fun main() {

    println("please enter the first number: ")
   var x = Integer.valueOf(readLine())
    println("please enter the second number: ")
   var y = Integer.valueOf(readLine())
    println("please enter the third number: ")
   var z = Integer.valueOf(readLine())
var max:Int

if(y>x && y>z){

    max=y
} else if(z>x && z>x){

    max=z
} else{

    max=x
}


println("the maximum number is: "+ max)




}
