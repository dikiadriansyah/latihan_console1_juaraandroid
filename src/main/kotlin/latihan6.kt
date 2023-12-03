//     menyimpan fungsi dalam variabel

fun main(){
//    val fungsiTrik = ::kejutan
//    operator referensi function(::)
//    -----------------------
//    val fungsiTrik = kejutan
//    kejutan()
//    fungsiTrik()
    /*
    output:
    Tidak ada Kejutan
    Tidak ada Kejutan
     */

//    trik()
    /*
    output:
    Tidak ada hadiah
     */
//--------------------------------
//    val koin: (Int) -> String = {
//        kuantitas-> "$kuantitas perempat"
//    }
//    val kueCup: (Int) -> String = {
//        "Memiliki sebuah kue cup"
//    }
//val fungsiKejutan = trikAtauKejutan(false, koin)
//val fungsiTrik = trikAtauKejutan(true, kueCup)
//    fungsiKejutan()
//    fungsiTrik()
    /*
    5 perempat
    Tidak ada Kejutan
    Tidak ada hadiah
     */
//--------------
//    val koin: (Int) -> String = {
//        kuantitas-> "$kuantitas perempat"
//    }
//    val fungsiKejutan = trikAtauKejutan(false, koin)
//    val fungsiTrik = trikAtauKejutan(true, null)
//    fungsiKejutan()
//    fungsiTrik()
    //--------------
//    menulis ekspresi lambda dengan sintaks singkat
//    val koin: (Int) -> String = {
//           "$it perempat"
//    }
    /*
 Anda dapat menghilangkan nama parameter sepenuhnya. Jika suatu fungsi memiliki satu parameter dan Anda tidak memberikan
  nama, Kotlin akan menetapkan nama it secara implisit.
 */

//    val fungsiKejutan = trikAtauKejutan(false, koin)
//    val fungsiTrik = trikAtauKejutan(true, null)
//    fungsiKejutan()
//    fungsiTrik()
//    ----------------------------
// Meneruskan ekspresi lambda langsung ke suatu fungsi
//    val fungsiKejutan = trikAtauKejutan(false, {"$it perempat"})
//    val fungsiTrik = trikAtauKejutan(true, null)
//    fungsiKejutan()
//    fungsiTrik()
    //--------------
//Menggunakan sintaksis lambda akhir
/*
jika jenis fungsi adalah parameter terakhir suatu fungsi. Jika demikian, Anda dapat menempatkan ekspresi lambda setelah
tanda kurung tutup untuk memanggil fungsi
 */
    val fungsiKejutan = trikAtauKejutan(false){"$it perempat"}
    val fungsiTrik = trikAtauKejutan(true, null)
    fungsiKejutan()
    fungsiTrik()
}

//--------------
//fun trikAtauKejutan(isTrik: Boolean, extraKejutan: (Int)->String): () -> Unit{
//    Menggunakan suatu fungsi sebagai jenis nilai yang ditampilkan

//    if(isTrik){
////        jika isTrik adlaah true dan tampilkan fungsi trik
//        return trik
//    }else{
//        println(extraKejutan(5))
//        return kejutan
//    }
//
//}

//--------------------------------
// Jenis fungsi yang nullable
//fun trikAtauKejutan(isTrik: Boolean, extraKejutan: ((Int)->String)?): () -> Unit {
//    extraKejutan:(()->String)? adalah parameter extraKejutan menjadi nullable agar tidak perlu menyediakan
//    fungsi extraKejutan()

//    if(isTrik){
////        jika isTrik adlaah true dan tampilkan fungsi trik
//        return trik
//    }else{
//
//        if(extraKejutan != null){
//            println(extraKejutan(5))
//        }
//
//        return kejutan
//    }
//}
//--------------------------------
//fun kejutan(){
//    println("Tidak ada kejutan")
//}

//------------------
// Menentukan ulang fungsi dengan ekspresi lambda
//val kejutan = {
//    println("Tidak ada Kejutan")
//}
//----------
//menggunakan fungsi sebagai jenis data
//val trik :()-> Unit = {
//    println("Tidak ada hadiah")
//}