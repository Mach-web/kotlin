// kotlinc start.kt -include-runtime -d start.jar
// java -jar start.jar
fun main() {
    val trafficLightColor = "MAroon"

    // if (trafficLightColor == "Red") {
    //     println("Stop")
    // } else if (trafficLightColor == "Yellow"){
    //     println("Slow")
    // } else if (trafficLightColor == "Green"){
    //     println("Go")
    // } else {
    //     println("Invalid Color")
    // }
    when(trafficLightColor){
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid Color")
    }
}
