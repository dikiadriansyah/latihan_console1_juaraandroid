//menggunakan objek singleton
data class KalimatPertanyaanDuplikatSatu<T>(val kalimatPertanyaan: String, val jawaban: T, val perbedaan: Perbedaan)


enum class PerbedaanDuplikat{
    EASY, MEDIUM, HARD
}
class Kuis{
    val kalimatPertanyaan1 = KalimatPertanyaanDuplikatSatu<String>("Siapa Presiden pertama indonesia ___","Soekarno",Perbedaan.MEDIUM)
    val kalimatPertanyaan2 = KalimatPertanyaanDuplikatSatu<Boolean>("Apa benar warna bendera indonesia adalah merah dan putih",true, Perbedaan.EASY)
    val kalimatPertanyaan3 = KalimatPertanyaanDuplikatSatu<Int>("kapan hari sumpah pemuda",28,Perbedaan.HARD)

   companion object KemajuanMurid{
        var total: Int = 10
        var dijawab: Int = 3
    }
}
//------------
// menambahkan properti ekstensi
val Kuis.KemajuanMurid.progressText: String
get() = "${dijawab} pada ${total} dijawab"

//----------------
//Menambahkan fungsi ekstensi
fun Kuis.KemajuanMurid.printProgressBar(){
//Fungsi ini tidak boleh menggunakan parameter dan tidak memiliki nilai return.

    repeat(Kuis.dijawab){
        print("▓")
    }
//    Bagian yang diarsir terang merepresentasikan pertanyaan yang tersisa di panel proses.

    repeat(Kuis.total - Kuis.dijawab){
        print("▒")
    }
    println()
    println(Kuis.progressText)
}

fun main(){

//    mengakses objek singleton
//    println("${KemajuanMurid.dijawab} pada ${KemajuanMurid.total} dijawab")
/*
output:
3 pada 10 dijawab
 */
//    ------------------
//println("${Kuis.dijawab} pada ${Kuis.total} dijawab")
   /* output:
    3 pada 10 dijawab
    */
    //    ------------------
//println(Kuis.progressText)
    /*
output:
3 pada 10 dijawab
 */
    //    ------------------
Kuis.printProgressBar()
}