fun main() {
    println("enter numbers to add:")
    var a = Integer.valueOf(readLine())
    println("+")
    var b = Integer.valueOf(readLine())
    println(add(a,b))
}

fun add(x: Int, y: Int): Int = x+y