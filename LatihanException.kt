package nextOOP

class StokHabisException(msg : String) : Exception(msg)

class Barang (var nama: String, var stok : Int)

fun beliBarang (barang: Barang, jumlahBeli: Int){
    if (jumlahBeli > barang.stok){
        throw StokHabisException("Gagal beli ${barang.stok}")
    }else {
        barang.stok -= jumlahBeli
        println("Berhasil membeli $jumlahBeli")
        }
    }