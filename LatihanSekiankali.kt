package nextOOP

interface Electronic{
    fun turnOn()
    fun turnOff()
    val brand : String
    fun cleanDrive(){
        println("Membersihkan debu dari perangkat $brand")
    }

}

class samsung : Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }
    override val brand: String="Cosmos"
}


class SmartLight : Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }

    override val brand: String="Cosmos"
}

fun main() {
    val samsung1 = SmartLight()
    samsung1.turnOn()
    samsung1.turnOff()
    samsung1.cleanDrive()
}