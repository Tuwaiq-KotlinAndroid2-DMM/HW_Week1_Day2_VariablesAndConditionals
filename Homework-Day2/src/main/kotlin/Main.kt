fun main() {

    var L = Integer.valueOf( readLine())
    var K = Integer.valueOf( readLine())
    var N = Integer.valueOf( readLine())

    if( L > K && L> N) {
        println("the greatest is $L")

    }
    else if( K> L && K> N)
    {
        println("the greatest is $K")
    }
    else
    {
        println("the greatest is $N")
    }
}