fun main() {
    println("Input the 1st number:")
    var a = Integer.valueOf(readLine())
    println("Input the 2nd number:")
    var b = Integer.valueOf(readLine())
    var max1 = maxValue(a,b)
    println("Input the 3rd number:")
    var c = Integer.valueOf(readLine())
    var max2 = maxValue(max1,c)

    println("The greatest: $max2")
}

fun maxValue(x: Int, y: Int): Int = if (x>=y) x else y