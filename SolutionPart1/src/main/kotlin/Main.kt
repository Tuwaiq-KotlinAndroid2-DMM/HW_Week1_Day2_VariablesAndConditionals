fun main() {

    // User Enter the numbers
    println("Please enter the first number: ")
    var a = Integer.valueOf(readLine())
    println("Please enter the second number: ")
    var b = Integer.valueOf(readLine())
    println("Please enter the third number: ")
    var c = Integer.valueOf(readLine())

    if (a>b && a>c){
        println("The greatest: " + a)
    }
    else if(b>a && b>c){
        println("The greatest: " + b)
    }
    else{
        println("The greatest:" + c)
    }

    /* //chosen variables
    var a = 25
    var b = 78
    var c = 87

    if (a>b && a>c){
        println("The greatest: " + a)
    }
    else if(b>a && b>c){
        println("The greatest: " + b)
    }
    else{
        println("The greatest:" + c)
    }

    */
}