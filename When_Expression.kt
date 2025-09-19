fun main() {
    val finalExam = 'A'
    val nilaiLulus = arrayOf('A','B')

    when (finalExam) {
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> {
            println("Tidak lulus")
        }
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya Bisa Lulus")
        else -> println("Tidak Lulus")
    }

    var status1 = false

    when(finalExam) {
        'A','B' -> status1 = true
        else -> false
    }

    val status = when(finalExam){
        'A','B' ->  true
        else -> false
    }

    println(status)

    when (finalExam){
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak Lulus")
    }

    when(finalExam) {
        is Char -> println("ya, ini char")
        is String -> println("Ini String")
        !is Char -> print("Bukan Char")
    }
}