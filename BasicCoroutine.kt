package nextOOP

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi Dimulai")
    login()
    println("Pindah halaman dari login, Ke home")
}

suspend fun login() {
    println(" Melakukan Validasi email & password")
    delay(2_000)
    println("Validasi Sukses")
}