package nextOOP

class NilaiTidakValidException(msg : String) : Exception(msg)

fun validasiNilai (nilai : Int){
    if (nilai < 0 || nilai > 100){
        throw NilaiTidakValidException("Nilai Harus antara 0 hingga 100")
    }
    println("Nilai Berhasil diinput $nilai")
}

fun main() {
    try {
        validasiNilai(-1)
    }catch (error: NilaiTidakValidException){
        println("${error.message}")
    }
}