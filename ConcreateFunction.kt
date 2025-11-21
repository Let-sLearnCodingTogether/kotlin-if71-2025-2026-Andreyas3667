package nextOOP

interface SpaceVehicle{
    fun accelerate()

    fun stop(){
        println("Stop")
    }
}

class LightSpace : SpaceVehicle{
    override fun accelerate() {
        println("Accelerate")
    }

//    override fun stop() {
//        println("Stop Overide")
//    }
}

fun main() {
    val lightSpace = LightSpace()

    lightSpace.accelerate()
    lightSpace.stop()
}