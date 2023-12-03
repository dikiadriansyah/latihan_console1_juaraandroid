// Map
/*
Map adalah koleksi yang terdiri dari kunci dan nilai. Disebut peta karena kunci unik dipetakan ke nilai lain. Kunci dan
nilai yang menyertainya sering disebut key-value pair.
 */
fun main(){
// menggunakan metode mutableMapOf()
    val buah = mutableMapOf(
        "Apel" to 0,
        "Ceri" to 0,
        "Belimbing" to 1,
        "Flamboyan" to 2,
        "Duku" to 79,
        "Jagung" to 82,
        "Labu" to 27,
        "Gandum" to 14
    )
    println(buah)
//    {Apel=0, Ceri=0, Belimbing=1, Flamboyan=2, Duku=79, Jagung=82, Labu=27, Gandum=14}
//--------------

//    mengecek ukuran peta buah
//    println(buah.size) // 8
//--------------

    buah["Jambu biji"] = 5
//    println(buah.size) // 9
//--------------

//    println(buah["Jambu biji"]) // 5
//--------------
//    mengakses nilai dengan metode get()
//    println(buah.get("Mangga")) // null
    //--------------
// menghapus key dengan metode remove()
    buah.remove("Jambu biji")
    println(buah.size) // 8
    //--------------
buah["Mangga"] = 78
    println(buah["Mangga"]) // 78
}