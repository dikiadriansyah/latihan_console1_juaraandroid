fun main(){
//    val buah = arrayOf<String>("Apel","Ceri","Belimbing","Gandaria","Duku","Kecapi","Jeruk")

//    karena kotlin menggunakan inferensi jenis sehingga kode dapat ditulis seperti dibawah ini:
    val buah = arrayOf("Apel","Ceri","Belimbing","Gandaria","Duku","Kecapi","Jeruk")
    val angka = arrayOf("1","2","3","4","5","6","7")

//    println(angka+buah) // [Ljava.lang.String;@30dae81
//    println(buah[0])
//    println(buah[1])
//    println(buah[2])
//    println(buah[3])
//    println(buah[4])
//    println(buah[5])
//    println(buah[6])
    /*
    output:
    Apel
Ceri
Belimbing
Gandaria
Duku
Kecapi
Jeruk
     */
//-------------
//    buah[5] = "kiwi"
//    println(buah[5])//kiwi
//-------------
//    buah[7] = "Labu"
//    println(buah[7])
    // output:
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
//----------------------------
    // membuat variabel baru untuk menambah indeks array
    val buahBaru = arrayOf("Apel","Ceri","Belimbing","Gandaria","Duku","Kecapi","Jeruk","Labu")
    println(buahBaru[7])

}