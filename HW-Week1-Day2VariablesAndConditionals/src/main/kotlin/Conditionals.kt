fun main() {
    println("Enter three number")
    var x = Integer.valueOf(readLine())
    var y = Integer.valueOf(readLine())
    var z = Integer.valueOf(readLine())
    if (x >= y && x >= z)
        println(" the largest: " + x)
    else if (y >= x && y >= z)
        println("the largest : " + y)
    else
        println("the largest : " + z)
}