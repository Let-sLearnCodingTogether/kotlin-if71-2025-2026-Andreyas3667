package nextOOP

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    print("Aplikasi Dimulai")

    val job: Job = launch { updateVesrsion1() }
    println("Apakah Job ini selesai? ${job.isCompleted}")
    println("Apakah Job ini aktif? ${job.isActive}")
    println("Apakah Job ini Dibatalkan? ${job.isCancelled}")

    println("Aplikasi Sedang digunakan")
}

suspend fun updateVesrsion1(){
    delay(5_000)
    println("Update Selesai.")
}