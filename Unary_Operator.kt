fun main() {
    val a = 5
    val b = -a//hasil: -g
    val c = +a//hasil: 5 (tidak mengubah nilai, hanya menegaskan positif)

    var x = 10
    println(x++)//Post-Increment -> cetak dulu 10, lalu x jadi 11
    println(++x)//Pre-Increment -> jadi 12 dulu, lalu cetak 12
    println(x--)//Post-Decrement -> cetak dulu 12, lalu x jadi 11
    println(--x)//Pre-Decrement -> jadi 10 dulu, lalu cetak 10

    val isTrue = false
    val result = !isTrue// hasil : true
}