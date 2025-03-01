// kotlinc start.kt -include-runtime -d start.jar
// java -jar start.jar
fun main() {
    val trafficLightColor = "Amber"

    // if (trafficLightColor == "Red") {
    //     println("Stop")
    // } else if (trafficLightColor == "Yellow"){
    //     println("Slow")
    // } else if (trafficLightColor == "Green"){
    //     println("Go")
    // } else {
    //     println("Invalid Color")
    // }
    var msg = when(trafficLightColor){
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid Color"
    }
    println(msg)
    var message = 
    if(trafficLightColor == "Red") "Stop"
    else if(trafficLightColor == "Yellow" || trafficLightColor == "Amber") "Slow"
    else if(trafficLightColor == "Green") "Go"
    else "Invalid Color"
    println(message)
}
