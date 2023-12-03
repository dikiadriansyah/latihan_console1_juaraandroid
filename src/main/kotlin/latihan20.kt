// Set
//Set adalah koleksi yang tidak memiliki urutan tertentu dan tidak mengizinkan nilai duplikat.
fun main(){
//val result = "Kotlin!".hashCode()
//    println(result) // 1131585312

//    menggunakan mutableSetOf()
    val buah = mutableSetOf("Apel","Ceri","Belimbing","Gandaria","Duku","Kecapi")
//    println(buah.size) // 6
//    --------------------
//    menambahkan elemen menggunakan properti .add("")
buah.add("Jeruk")
//    println(buah)
        /*
        output:
     [Apel, Ceri, Belimbing, Gandaria, Duku, Kecapi, Jeruk]
         */

//    println(buah.size) // 7

//    --------------------
//  menggunakan fungsi contains("") untuk memeriksa apkah elemen yang ditentukan terdapat dalam set
//println(buah.contains("Duku")) // true

// menggunakan operator in
//    println("Duku" in buah) // true
//    --------------------
//buah.add("Jeruk")
//    println(buah.size) // 7
    //    --------------------
//    mengambil 1 parameter dan menghapus elemen dengan fungsi remove dari set
buah.remove("Jeruk")
//    println(buah)
//    [Apel, Ceri, Belimbing, Gandaria, Duku, Kecapi]

    println(buah.size) // 6
    println(buah.contains("Jeruk")) // false
}