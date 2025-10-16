package OOP

data class Barang (val id: Int, var name: String, val value: Int, var rarity: String)

fun main() {
    val GameItem: MutableList<Any> = mutableListOf(1,2,3)

    GameItem[1] = Barang (1,"Pedang Besi", 100,"Common")
    GameItem[1] = Barang (1,"Pedang Besi", 100,"Common")
    GameItem[1] = Barang (1,"Pedang Besi", 100,"Epic")
}