enum class DayofTheWeek3(val isWeekend : Boolean = false){
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(isWeekend = true),
    Minggu(isWeekend = true);


    fun daysUntil(targetHari : DayofTheWeek3): Int{
        return if (this.ordinal < targetHari.ordinal){
            targetHari.ordinal - this.ordinal
        } else{
            targetHari.ordinal - (this.ordinal + DayofTheWeek3.values().count())
        }
    }
    companion object {
        fun today (): DayofTheWeek3{
            val today = 0
            return DayofTheWeek3.values().first(){it.ordinal == today}
        }
    }
}

fun main() {
    val today = DayofTheWeek3.Senin
    val targetHari = DayofTheWeek3.Jumat

    val sisaHari = today.daysUntil(targetHari)
    println(sisaHari)

    println(DayofTheWeek3.today())
}