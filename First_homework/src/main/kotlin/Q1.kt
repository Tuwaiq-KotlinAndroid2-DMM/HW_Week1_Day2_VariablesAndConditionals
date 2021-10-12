fun main() {
    println("Please Enter 3 numbers")
    var x= Integer.valueOf(readLine())
    var y= Integer.valueOf(readLine())
    var z= Integer.valueOf(readLine())

    if (x>y && x>z){
            println(x)
        }
    else if (y>x && y>z) {
            println(y)
        }else {
            println(z)
        }}