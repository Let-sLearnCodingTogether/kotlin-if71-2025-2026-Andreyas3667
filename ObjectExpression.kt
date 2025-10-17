package OOP

fun main() {
    val person = object {
        val name = "Nama"
        fun greet(): String {
            return " Hello $name"
        }
    }
    println(person.greet())

}