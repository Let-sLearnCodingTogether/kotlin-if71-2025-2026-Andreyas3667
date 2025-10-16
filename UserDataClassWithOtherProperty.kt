package OOP

data class Product(val name: String, val price : Double) {
    val isAvailable: Boolean = true

    fun getFormatPrice(): String {
        return "Rp $price"
    }
}

fun main() {
    val product1 = Product(name = "Laptop 1", price = 5000_00.0)
    println(product1)
    println(product1.isAvailable)
    println(product1.getFormatPrice())
}