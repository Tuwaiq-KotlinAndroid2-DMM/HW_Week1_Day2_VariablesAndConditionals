fun main(args: Array<String>) {
    println("Enter the first number")
   val n1= Integer.valueOf(readLine())

    println("Enter the second number")
    val n2= Integer.valueOf(readLine())

    println("Enter the thrid number")
    val n3=Integer.valueOf(readLine())
     var greatest=n1
    if (n1>n2 && n1>n3){
        greatest=n1
    }
    else if (n2>n1 && n2>n3){
        greatest=n2
    }
    else
        greatest=n3
    println("greatest= $greatest")
}