fun main() {
    val item: Int = 25000

    val item2: Int = 15000
    val itemPertama = item * 3
    val itemKedua= item2 * 2
    val subTotal = itemPertama + itemKedua
    val Diskon = subTotal - 10000
    val totalBelanja = Diskon / 100
    val diskonBelanja = totalBelanja + Diskon




    println("Setelah Item B -> Total Belanja: Rp"+ subTotal)
    println("Diskon -> Total Belanja: Rp"+ Diskon)
    println("Ditambah Biaya Layanan (Rp$totalBelanja) -> Total Belanja: Rp"+ diskonBelanja)
}

