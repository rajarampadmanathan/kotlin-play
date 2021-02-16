data class Location(val id: Int, val description: String) {
    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit(direction: String, location: Int) {
        exits[direction] = location
    }
}