package nextOOP

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
launch(Dispatchers.IO){
    println("Dispatcher.IO")
}
    launch(Dispatchers.Default){
        println("Dispatchers.Default")
    }
    delay(1000)
}