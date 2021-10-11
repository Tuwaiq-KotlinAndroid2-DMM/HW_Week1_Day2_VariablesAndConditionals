fun main(){
    // The greatest number
    println("Please add the first number: ")
    var f= Integer.valueOf(readLine())
    println("Please add the second number: ")
    var s= Integer.valueOf(readLine())
    println("Please add the third number: ")
    var t= Integer.valueOf(readLine())

    if (f>s && f>t){
        println("The greatest number is: " + f)
    }else if (s>t){
        println("The greatest number is: " + s)
    }else{
        println("The greatest number is: " + t)
    }

}