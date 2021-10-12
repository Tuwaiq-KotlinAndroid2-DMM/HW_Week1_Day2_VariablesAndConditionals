
fun main() {
    println("Enter the first value")
    var X= Integer.valueOf(readLine())
    println("Enter the second value")
    var Y= Integer.valueOf(readLine())

    println("Enter the third value")
    var Z= Integer.valueOf(readLine())
    if (X>Y && X>Z){
        println("The Largest: " + X)
    }
    else if (Y>X && Y>Z){
        println("The Largest:" + Y)
    }
    else{
        println("The largest: " + Z)
    }

}
