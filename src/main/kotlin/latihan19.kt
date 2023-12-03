// List
/*
List adalah koleksi yang diurutkan dan dapat diubah ukurannya, biasanya diterapkan sebagai array yang dapat diubah
ukurannya. Saat array diisi sesuai kapasitas dan Anda mencoba menyisipkan elemen baru, array tersebut akan disalin ke
array baru yang lebih besar.
 */
fun main(){
//    fun listOf()
//    val buah = listOf("Apel","Ceri","Belimbing","Gandaria","Duku","Kecapi","Jeruk","Labu")
//     gunakan properti size pada list
//    println(buah.size) // 8

//    akses elemen dari list
//    println(buah[2]) // belimbing

//    akses menggunakan metode get()
//println(buah.get(3)) // Gandaria


//    akses indeks menggunakan metode indexOf()
    /*
    Metode indexOf() menelusuri daftar untuk elemen tertentu (diteruskan sebagai argumen), dan menampilkan indeks
    kejadian pertama dari elemen tersebut. Jika tidak muncul dalam daftar, elemen akan menampilkan -1.
     */
//    println(buah.indexOf("Duku")) // 4
//    println(buah.indexOf("Pepaya")) // -1


//    lakukan iterasi pada elemen list menggunakan loop for
//    for(buahIndividu in buah){
//        println(buahIndividu)
/*
output:
Apel
Ceri
Belimbing
Gandaria
Duku
Kecapi
Jeruk
Labu
 */
//    }
//    -------------------------------------------
//    menggunakan mutableListOf()
    val buah = mutableListOf("Apel","Ceri","Belimbing","Gandaria","Duku","Kecapi","Jeruk","Labu")
    buah.add("Mangga")
    buah.add(4,"Markisa")
println(buah)
    //[Apel, Ceri, Belimbing, Gandaria, Markisa, Duku, Kecapi, Jeruk, Labu, Mangga]


//    mengupdate elemen pada indeks tertentu
    buah[5] = "Delima"
//    println(buah[5]) // Delima
//    println(buah[7]) // Jeruk


//    Menghapus elemen dari list menggunakan removeAt()
    buah.removeAt(8)
println(buah)
//    [Apel, Ceri, Belimbing, Gandaria, Markisa, Delima, Kecapi, Jeruk, Mangga]

//    menggunakan remove("")
    buah.remove("Ceri")
    println(buah)
//    [Apel, Belimbing, Gandaria, Markisa, Delima, Kecapi, Jeruk, Mangga]

//    cek Ceri pada list buah menggunakan metode contains()
//    println(buah.contains("Ceri")) // false

//    atau penulisan kode bisa diringkas seperti dibawah ini:
    println("Ceri" in buah) // false


}