// fungsi ekstensi menggunakan interface
interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}
class KuisDua : ProgressPrintable{

    companion object KemajuanMurid{
        var total: Int = 10
        var dijawab: Int = 3
    }

    override  val progressText: String
    get() = "${dijawab} pada ${total} dijawab"

    override fun printProgressBar(){

        repeat(KuisDua.dijawab){
            print("▓")
        }
//    Bagian yang diarsir terang merepresentasikan pertanyaan yang tersisa di panel proses.

        repeat(KuisDua.total - KuisDua.dijawab){
            print("▒")
        }


        println()
        println(progressText)
    }
}
//-------------------
//enum class PerbedaanDuplikatDua{
//    EASY, MEDIUM, HARD
//}
//class KuisDua{
//    val kalimatPertanyaan1 = KalimatPertanyaanDuplikatDua<String>("Siapa Presiden pertama indonesia ___","Soekarno",Perbedaan.MEDIUM)
//    val kalimatPertanyaan2 = KalimatPertanyaanDuplikatDua<Boolean>("Apa benar warna bendera indonesia adalah merah dan putih",true, Perbedaan.EASY)
//    val kalimatPertanyaan3 = KalimatPertanyaanDuplikatDua<Int>("kapan hari sumpah pemuda",28,Perbedaan.HARD)
//
//    companion object KemajuanMurid{
//        var total: Int = 10
//        var dijawab: Int = 3
//    }
//}



fun main(){

    KuisDua().printProgressBar()

}