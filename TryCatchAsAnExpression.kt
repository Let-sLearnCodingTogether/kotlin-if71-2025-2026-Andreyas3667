package nextOOP

fun parseStringToInt(input : String): Int{
    val hasil = try {
    input.toInt()
    } catch (error : NumberFormatException){
        0
    }
    return hasil
}

fun main() {
    parseStringToInt("1")
    parseStringToInt("Test")
}