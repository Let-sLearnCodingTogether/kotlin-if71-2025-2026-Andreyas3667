package OOP

import java.util.logging.Level

class Player (val name: String, var health: Int, var level: Int){
    fun takeDamage(damage : Int): Int {
        health -=damage
        return health
        if (health < 0){
            health = 0
        }
    }

    fun levelUp() {
        level = 1
        health = 100
    }

    fun showStatus(){
        println("Nama $name",)
        println("Level $level")
        println("Health $health")
    }
}

fun main() {
    val Player = Player("Andreyas", 100, 1)
    Player.showStatus()
    Player.takeDamage(30)
    Player.showStatus()
    Player.levelUp()
    Player.showStatus()

}
