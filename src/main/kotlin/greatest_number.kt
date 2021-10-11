 fun main() {
     println("The 1st number: ")
     var x = Integer.valueOf(readLine())
     println("The  2nd number: ")
     var r = Integer.valueOf(readLine())
     println("The 3rd number:")
     var n = Integer.valueOf(readLine())
     if (x>r && x>n){
         println("The greatest : $x")
     }else if  (r>x && r>n){
         println("The greatest : $r")
     }else{
         println("The greatest : $n")
     }





 }