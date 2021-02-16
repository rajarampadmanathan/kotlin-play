fun main() {
    val employee1 = Employee(1)
    val employee2 = Employee(1)

    println(employee1 == employee2)

    val testMLString = """Hello herllo
        |hello
        |hello
        |hello
    """.trimMargin()
    println(testMLString)
}

class Employee(val id:Int){
    override fun equals(other: Any?): Boolean {
        if (other is Employee){
            println("${other.id}")
            return id == other.id
            println("${other.id}")
        }
        return false
    }
}