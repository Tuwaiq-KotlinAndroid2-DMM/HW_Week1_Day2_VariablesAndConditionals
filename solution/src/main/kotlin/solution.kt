fun main(){

    println("enter first number")
    var n1 = Integer.valueOf(readLine())
    println("enter seconed number")
    var n2= Integer.valueOf(readLine())
    println("enter third number")
    var n3 = Integer.valueOf(readLine())
   if ( n1 > n2 && n1 >n3) {
        println("The greatest: " + n1)

    }else if (n2 > n1 && n2 >n3) {
       println("The greatest: " + n2)
   }else {
       println("The greatest: " + n3)    }
}
