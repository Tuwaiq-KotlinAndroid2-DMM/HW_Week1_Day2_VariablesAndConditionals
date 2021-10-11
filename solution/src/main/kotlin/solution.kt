fun main(){

    println("enter three numbers")

    var n1 = Integer.valueOf(readLine())
    var n2= Integer.valueOf(readLine())
    var n3 = Integer.valueOf(readLine())
   if ( n1 > n2 && n1 >n3) {
        println("The greatest: " + n1)

    }else if (n2 > n1 && n2 >n3) {
       println("The greatest: " + n2)
   }else {
       println("The greatest: " + n3)    }
}