package nextOOP


//Pure

fun addPureFunction(a : Int, b : Int) : Int = a + b

//Impure
var count = 0 //anggap global variable
fun addImpureFunction(a : Int) : Int{
    count += 1
    return a + count
}


fun main() {
    println(addPureFunction(1, 2))
    println(addPureFunction(1, 2))
    println(addPureFunction(1, 2))

    println(addImpureFunction(1))
    println(addImpureFunction(1))

}