package OOP

class MahasiswaConstructorDefaultValue(
    val npm: String,
    val nama: String,
    var ipk: Float = 0.0f
){
    init {
        println("Ini Block Init")
    }
}



fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        npm = "2226250025",
        nama = "Mahasiswa Pertama"
    )

    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        npm = "2226250052",
        nama = "Dodo"
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)
}