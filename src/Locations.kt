import java.io.File

typealias  LocationMap = HashMap<Int, Location>
fun readLocation(): LocationMap {
    val locations = LocationMap()
    File("locations_big.txt").reader().forEachLine {
        val tokens = it.split(",")
        val location = Location(tokens[0].toInt(), tokens[1])
        locations[location.id] = location
    }

    File("directions_big.txt").reader().forEachLine {
        val tokens = it.split(",")
        locations[tokens[0].toInt()]?.addExit(tokens[1],tokens[2].toInt())
    }
    return locations
}