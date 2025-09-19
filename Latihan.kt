fun main() {
    val  days : Array<String> = arrayOf("Senin", "Selasa","Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    println("Jumlah Hari : ${days.size }")
    println("Hari Pertama : ${days[0]}")
    println("Hari Pertama : ${days[6]}")
    days[4] = "Jum'at Barokah"
    println(days[4])
}