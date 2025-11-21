package nextOOP

fun validasiUmur1 (umur : Int){
    if (umur < 0) {
        throw IllegalArgumentException("Umur")

    }
    println("Umur Valid ${umur}")
}

fun main() {
    println("Start")
    try {
        validasiUmur1(10)
        validasiUmur1(-3)
    } catch (error: IllegalArgumentException){
    println("Error dengan message ${error.message}")
}
    println("Finish")
}
