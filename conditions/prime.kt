fun main(){
    var x:Int = 6
     when(x){
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10")
        in 1..10 -> print("x is not a prime number")
        else -> println("x is not a prime number between 1 and 10")
     }
     println()
     checkType(x + 2.26f)
}

fun checkType(x: Any){
    when(x){
        is Int -> println("x is an Int")
        is Double -> println("x is a double")
        is Float -> println("x is a float")
        is String -> println("x is a string")
        else -> println("x has no assigned data type")
    }
}