fun main( ) {
    println("Please enter 1st number: ")
    var x = Integer.valueOf(readLine())
    println("Please enter 2nd number: ")
    var y = Integer.valueOf(readLine())
    println("Please enter 3rd number: ")
    var z = Integer.valueOf(readLine())
    if (x > y && x > z){
        println("The greatest:"+x)
    }else if(y > x && y > z){
        println("The greatest:"+y)
    }else {
        println("The greatest:"+z)
    }
}