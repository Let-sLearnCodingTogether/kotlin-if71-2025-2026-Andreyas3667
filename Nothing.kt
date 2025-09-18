import javax.sound.midi.MetaMessage

fun fail(message: String): Nothing{
    throw IllegalArgumentException(message)
}

fun main() {
    fail("Terjadi Kesalahan Fatal!")
}