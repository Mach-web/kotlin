fun main(){
    var x: Int = 6
     when(x){
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10")
        in 1..10 -> print("x is not a prime number")
        else -> println("x is not a prime number between 1 and 10")
     }
}