package OOP

data class GameItem (val id: Int, var name: String, val value: Int, var rarity: String)

fun main() {
    val game: MutableList<GameItem> = mutableListOf(
        GameItem (1,"Pedang Besi", 100,"Common"),
        GameItem (2,"Ramuan Kesehatan", 50,"Common"),
        GameItem (3,"Baju Bayangan", 500,"Epic"),
    )

    val cursedSword = game[0].copy(name = "Pedang Besi Terkutuk", value = 250)


    println("List objek Gameltem:")
    game.forEach { println(it) }


    println("Objek cursedSword:")
    println(cursedSword)
}