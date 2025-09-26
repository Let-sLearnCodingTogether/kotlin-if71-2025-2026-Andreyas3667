fun main() {
    // Null
    var student : String = "Budi"
    println(student)

//    student = null

    var prodiIF : String? = "IF"
    println(prodiIF?.length)

    var prodiSi : String? = null
    println(prodiSi ?: "Tanpa Prodi")

    var token : String? = null
    println(token!!.length)

    val email : String? = "email"
    if(email != null) {
        print(email.length)
    }
}