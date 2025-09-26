fun main() {
    print("PlayerName = ")
    val nama = readln()

    print("HealthBar = ")
    val kesehatanPemain = 100

    print("GoldKey =  ")
    var punyaKunciEmas = false

    print("Potion = ")
    var jumlahPotion = 2

    print("Permainan =  ")
    val sedangBermain = true

    var jalurPertama = 1
    val jalurKedua = 2
    val victory = "Griffin"
    val failed = arrayOf("Naga","Ular")

    while (sedangBermain == true) {
        println("Nama = $nama")
        println("HealthBar = $kesehatanPemain")
        println("Potion = $nama")

        println("Didepan kamu terdapat 2 buah jalur (1, 2)")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")

        if (jalurPertama == 1 || jalurKedua == 2) {
            println("Kamu berada disebuah ruangan dengan tiga patung : naga, griffin, dan ular")
            val victory = readln()

            when (victory) {
                "Griffin" -> println("Mendapatkan Kunci Emas")
                "Naga" -> println("HealthBar -35")
                "Ular" -> println("HealthBar -15")
                else -> {
                    println("Opsi Invalid")
                }
            }
        }else{
            println("Anda Menginjak Perangkap")
            println("Healthbar = $kesehatanPemain")

        }
    }
}