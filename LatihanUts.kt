fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55,
    )

    val barangMinStok = stokBarang.minByOrNull { it.value }

    if (barangMinStok != null) {
        println("Stok Sedikit: ${barangMinStok.key} (${barangMinStok.value} buah)")
    } else {
        println("Tidak ada data stok.")
    }
}
