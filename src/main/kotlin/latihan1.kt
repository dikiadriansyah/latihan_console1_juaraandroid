fun main(args: Array<String>) {
//    println("Hello World!")
//-------------
// operator perbandingan
//println(1 == 1)
//println(1 < 1)
//-------------
//val warnaLampuLaluLintas = "Red"
//    if(warnaLampuLaluLintas == "Red"){
// if memiliki boolean expression dan body println()
//        println("Stop")
//    }

//    val warnaLampuLaluLintas = "Hijau"
//
//    if(warnaLampuLaluLintas == "Merah"){
//        println("Berhenti")
//    }else{
//        println("Jalan")
//    }
//    ------------
//    menambah cabang else if
//    val warnaLampuLaluLintas = "Kuning"
//    if(warnaLampuLaluLintas == "Merah"){
//        println("Berhenti")
//    }else if(warnaLampuLaluLintas == "Kuning"){
//        println("Pelan")
//    }else{
//        println("Jalan")
//    }


//   jika kondisi tidak terpenuhi semua
//    val warnaLampuLaluLintas = "Hitam"
//    if(warnaLampuLaluLintas == "Merah"){
//        println("Berhenti")
//    }else if(warnaLampuLaluLintas == "Kuning"){
//        println("Pelan")
//    }else if(warnaLampuLaluLintas == "Hijau"){
//        println("Jalan")
//    }else{
//        println("Tidak tersedia warna")
//    }
//-----------------------------------
//    Latihan Pernyataan When
//    Pernyataan when lebih disarankan jika ada lebih dari dua cabang untuk dipertimbangkan.
//val warnalampuLaluLintas = "Hitam"
//    when(warnalampuLaluLintas){
//        "Merah" ->println("Berhenti")
//        "Kuning" ->println("Pelan")
//        "Hijau" -> println("Jalan")
//        else -> println("Tidak tersedia warna")
//    }

//    gunakan koma(,) untuk beberapa kondisi
//    val bilPrima = 3
//    when(bilPrima){
//        2,3,5,7 -> println("bilPrima adalah angka prima antara 1 dan 10")
//        else -> println("x bukan angka prima antara 1 dan 10")
//    }

//    gunakan in untuk beberapa kondisi
//    val bilPrima = 6

//    when(bilPrima){
//        2,3,5,7 -> println("bilPrima adalah angka prima antara 1 dan 10")
//        in 1..10 -> println("bilPrima adalah angka prima 1 dan 10, tapi bukan angka prima")
//        else -> println("bilPrima bukan angka prima antara 1 dan 10")
//    }
//------------------
//    gunakan is untuk memeriksa jenis data
//    val bilPrima: Any = 13
//
//    when(bilPrima){
//    2,3,5,7->println("bilPrima adalah angka prima antara 1 dan 10")
//        in 1..10->println("bilPrima adalah angka prima 1 dan 10, tapi bukan angka prima")
//        is Int -> println("bilPrima adalah angka Integer, tapi bukan antara 1 dan 10")
//        else -> println("bilPrima bukan angka integer")
//}
//    -----------
//    kode coba
//    val warnaLampuLaluLintas = "Amb"
//    when(warnaLampuLaluLintas){
//        "Merah"->println("Berhenti")
//        "Kuning","Amb"->println("Pelan")
//        "Hijau"->println("Jalan Cepat")
//        else->println("Tidak tersedia warna lampu")
//    }
//    ---------------------
//    gunakan if/else dan when sebagai ekspresi

    val warnaLampuLaluLintas = "merah"

//    val pesan = if(warnaLampuLaluLintas == "merah"){
//println("berhenti")
//    }else if(warnaLampuLaluLintas == "kuning"){
//        println("pelan")
//    }else if(warnaLampuLaluLintas == "hijau"){
//        println("jalan cepata")
//    }else{
//        println("tidak tersedia warna lampu")
//    }

//    mempersingkat kode
//    val pesan =
//        if(warnaLampuLaluLintas == "merah") "berhenti"
//    else if(warnaLampuLaluLintas == "kuning")"pelan"
//    else if(warnaLampuLaluLintas == "hijau")"jalan cepat"
//    else "tidak tersedia warna"
//    println(pesan)


//    konversi program lampu lalu lintas menggunakan statement when
//when(warnaLampuLaluLintas){
//    "merah"->println("Berhenti")
//    "kuning","amb"->println("Pelan")
//    "hijau"->println("jalan cepat")
//    else -> println("warna tidak tersedia")
//}

// konversi dari statment ke expression when tanpa mengulangi statement println()
   val hasil = when(warnaLampuLaluLintas){
       "merah"->"Berhenti"
       "kuning","amb"->"Pelan"
       "hijau"->"jalan cepat"
       else -> "warna tidak tersedia"
   }

    println(hasil)

    /*
    Catatan: Pernyataan when tidak memerlukan cabang else untuk ditentukan. Namun, dalam sebagian besar kasus, ekspresi
     when memerlukan cabang else karena ekspresi when perlu menampilkan nilai.
     */

}
