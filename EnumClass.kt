enum class DayofTheWeek{
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayofTheWeek.values()

    days.forEach {
        println("${it.ordinal}. ${it.name}")
    }

    val today = DayofTheWeek.valueOf("Senin")

    when (today) {
        DayofTheWeek.Senin-> println("Yah, Senin lagi")
        DayofTheWeek.Selasa-> println("Selasa") //return of exception
        DayofTheWeek.Sabtu, DayofTheWeek.Minggu->println("Hari Libur")
        else -> println("Hari Lain")
        }
    }