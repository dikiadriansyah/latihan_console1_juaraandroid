fun main(){
//    var aktorFavorit : String? = "Joe taslim"
//    aktorFavorit = null
//    println(aktorFavorit)
  /*
  output:
  null

  penjelasan:
  dari value string menjadi nullable karena tipe data diberi tanda ?,
  selain tipe data string bisa juga berupa integer
   */
//--------------------------
//var aktorFavorit : String = "Boy William"
//    println(aktorFavorit.length)
    // output: 11
    //--------------------------
// operator Safe Call (?.)
//    var aktorFavorit : String? = "Deva Mahendra"
//    println(aktorFavorit?.length)
    // output: 13

//    var pemainBolaFavorit: String? = null
//    println(pemainBolaFavorit?.length)
//    output: null

//    penjelasan:
//    program tidak mengalami error meskipun ada upaya untuk mengakses properti length dari variabel null. Ekspresi
//    Safe call akan menampilkan null.
//    -----------------------
//    not null (!!)
    /*
     penggunaan operator pernyataan not-null !! dapat mengakibatkan error NullPointerException ditampilkan jika
     variabel nullable memang null.
     */
//    println(aktorFavorit!!.length)
    // output: 13

//    jika variabel bernilai null
//    println(pemainBolaFavorit!!.length)
// output: NullPointerException
    /*
    Error Kotlin ini menunjukkan bahwa program Anda mengalami error selama eksekusi. Dengan demikian, sebaiknya jangan
    gunakan operator pernyataan not-null !!, kecuali jika Anda yakin bahwa variabelnya bukan null
     */
    //    -----------------------
// statement if/else
//    var aktorFavorit: String? = "Deva Mahendra"
//    if(aktorFavorit != null){
//        println("Banyaknya karakter pada nama aktor favorit anda adalah ${aktorFavorit.length}")
//    }
    /*
    output:
    Banyaknya karakter pada nama aktor favorit anda adalah 13
     */


//    var aktorFavorit: String? = null
//    if(aktorFavorit != null){
//        println("Banyaknya karakter pada nama aktor favorit anda adalah ${aktorFavorit.length}")
//    }else{
//    println("anda tidak memasukkan nama")
//    }
    /*
    output:
    anda tidak memasukkan nama
     */
    //    -----------------------
//    pemeriksaan null dengan ekspresi if/else untuk mengonversi variabel nullable menjadi variabel non-nullable.
//val panjangNama = if(aktorFavorit != null){
//    println("Banyaknya karakter pada nama aktor favorit anda adalah ${aktorFavorit.length}")
//}else{
//    println("anda tidak memasukkan nama")
//}

//    val panjangNama = if(aktorFavorit != null){
//        aktorFavorit.length
//    }else{
//        0
//    }
//    println("Banyaknya karakter pada nama aktor favorit anda adalah ${panjangNama}")
    // output: Banyaknya karakter pada nama aktor favorit anda adalah 13

/*
Catatan: Anda juga dapat menggunakan operator perbandingan == untuk pemeriksaan null, bukan operator !=. Saat
melakukannya, perhatikan bahwa dua isi terbalik. Isi cabang if mengasumsikan bahwa variabelnya null dan isi cabang else
mengasumsikan bahwa variabelnya non-nullable.
 */
//-----------------------------------------
//    operator Elvis ?:
    var aktorFavorit: String? = "Deva Mahendra"
//    val panjangNama = aktorFavorit?.length ?: 0
//    println("Banyaknya karakter pada nama aktor favorit anda adalah ${panjangNama}")
    // output: Banyaknya karakter pada nama aktor favorit anda adalah 13


    val result = aktorFavorit ?: 0
    println("hasil adalah ${result}")

}