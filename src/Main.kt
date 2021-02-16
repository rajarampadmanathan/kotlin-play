
fun main(args: Array<String>) {
    println("Starting game... Loading directions")
    val locations = readLocation()
    var locationId = 15

    while (true) {
        val location = locations[locationId] ?: Location(0, "Something went wrong")
        println(location.description)
        if (location.id == 0)
            break
        print("Available exits:\$a")
        location.exits.keys.forEach { print("$it, ") }
        println()
        val direction = readLine()?.toUpperCase()
        if (location.exits.containsKey(direction)) {
            locationId = location.exits[direction]!!
        }else {
            println("Wrong direction")
        }
    }
}