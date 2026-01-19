fun main() {
    val NAMA_PETUALANG = "Andreyas"
    val KAPASITAS_TAS = 20.0
    var totalBeratBawaan = 0.0

    println("Kalkulator Logistik untuk Ekspedisi $NAMA_PETUALANG dimulai...")

    
    for (i in 1..3) {
        println("--- Memasukkan Barang #$i ---")


        print("Masukkan nama barang: ")
        val namaBarang = readln()

  
        print("Masukkan berat untuk '$namaBarang' (kg): ")
        val beratBarang = readln().toDoubleOrNull() ?: 0.0


        totalBeratBawaan += beratBarang

        println("'$namaBarang' dengan berat $beratBarang kg telah ditambahkan.")


        when {
            totalBeratBawaan > KAPASITAS_TAS -> {
                println("Bahaya, Kelebihan Muatan! Berat saat ini: $totalBeratBawaan kg. Kapasitas hanya $KAPASITAS_TAS kg.")
            }
            totalBeratBawaan == KAPASITAS_TAS -> {
                println("Optimal! Tas milik $NAMA_PETUALANG sekarang penuh dengan sempurna.")
            }
            else -> {
                val sisaKapasitas = KAPASITAS_TAS - totalBeratBawaan
                println("Barang berhasil dimasukkan. Sisa kapasitas tas: $sisaKapasitas kg.")
            }
        }
    }

    println("Proses kalkulasi logistik selesai.")
}
