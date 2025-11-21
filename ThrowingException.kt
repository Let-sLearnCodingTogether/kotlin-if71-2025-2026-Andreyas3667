package nextOOP

fun validasiUmur (umur : Int){
    if (umur < 0) {
        throw IllegalArgumentException("Umur")

    }
    println("Umur Valid ${umur}")
}

fun main() {
    println("Start")
    validasiUmur(10)
    validasiUmur(3)
    println("Finish")
}