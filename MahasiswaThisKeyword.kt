package OOP

class MahasiswaThisKeyword (val nama : String){
    fun sayGoodbye(nama: String){
        println("$nama : ${this.nama}")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaThisKeyword(
        nama = "Mahasiswa Pertama"
    )
    mahasiswaPertama.sayGoodbye(nama = "Mahasiswa 1")
}