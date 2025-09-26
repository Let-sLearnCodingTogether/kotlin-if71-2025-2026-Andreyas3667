fun sayHello1 (firstName : String, lastName : String = "") {
    println("Hello, $firstName $lastName")
}

fun main() {
    sayHello("Budi" , "123")
    sayHello1("Ani")
}