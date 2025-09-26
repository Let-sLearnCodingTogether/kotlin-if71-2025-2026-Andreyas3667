fun hitungPanjangNama(nama : String? = null) : Int {
    if(nama != null) {
        return nama.length
    }
    return 0
}

fun main() {


    println(hitungPanjangNama())
    println(hitungPanjangNama("budi"))
}