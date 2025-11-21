class karyawan (val nama : String, val id : String, val gajiPokok : Double){
    fun tampilkanProfil(){
        println("Nama : $nama, ID: $id")
    }

    fun hitungGajiBulanan (jumlahHariMasuk : Int): Double{
        val gajiBulanan = (jumlahHariMasuk.toDouble()/22)* gajiPokok
        return gajiBulanan
    }
}

fun main() {
    val KaryawanA = karyawan("Fernando", "K001", 2000000.0)
    val KaryawanB = karyawan("Briliant", "K002", 7000000.0)

    KaryawanA.tampilkanProfil()
    KaryawanB.tampilkanProfil()

    println("Gaji Bulanan : ${KaryawanA.hitungGajiBulanan(20)}")
    println("Gaji Bulanan : ${KaryawanB.hitungGajiBulanan(22)}")
}