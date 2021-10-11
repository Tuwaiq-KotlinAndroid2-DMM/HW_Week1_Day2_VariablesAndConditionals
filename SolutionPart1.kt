//Take three numbers from the user and print the greatest number.
fun main() {
    print("Input the first number: ")
    var n1 = Integer.valueOf(readLine())
    print("Input the second number: ")
    var n2 = Integer.valueOf(readLine())
    print("Input the third number: ")
    var n3 = Integer.valueOf(readLine())


    if (n1 > n2 && n1 > n3) {

            print("The gratest: $n1")
    }

    else if (n2 > n1 && n2 > n3){

            print("The gratest: $n2")
    }

    else{
            print("The gratest: $n3")
        }

}