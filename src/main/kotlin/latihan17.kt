// fungsi cakupan untuk mengakses properti dan class method

data class KalimatPertanyaanDuplikatDua<T>(val kalimatPertanyaan: String, val jawaban: T, val perbedaan: Perbedaan)

class KuisDuplikatTiga{
    val pertanyaan1 = KalimatPertanyaanDuplikatDua<String>("Siapa Presiden pertama indonesia ___","Soekarno",Perbedaan.MEDIUM)
    val pertanyaan2 = KalimatPertanyaanDuplikatDua<Boolean>("Apa benar warna bendera indonesia adalah merah dan putih",true, Perbedaan.EASY)
    val pertanyaan3 = KalimatPertanyaanDuplikatDua<Int>("kapan hari sumpah pemuda",28,Perbedaan.HARD)

    companion object KemajuanMurid{
        var total: Int = 10
        var dijawab: Int = 3
    }
    fun cetakKuis(){
        pertanyaan1.let{
//            Fungsi let() memungkinkan Anda merujuk ke objek dalam ekspresi lambda menggunakan ID it, bukan nama objek yang sebenarnya.
            println(it.kalimatPertanyaan)
            println(it.jawaban)
            println(it.perbedaan)
        }

        println()
        pertanyaan2.let{
            println(pertanyaan2.kalimatPertanyaan)
            println(pertanyaan2.jawaban)
            println(pertanyaan2.perbedaan)
        }
        println()

        pertanyaan3.let {
            println(pertanyaan3.kalimatPertanyaan)
            println(pertanyaan3.jawaban)
            println(pertanyaan3.perbedaan)
        }
    }
}

fun main(){
//    val kuis = KuisDuplikatTiga()
//    kuis.cetakKuis()
    /*
    output:
    Siapa Presiden pertama indonesia ___
Soekarno
MEDIUM

Apa benar warna bendera indonesia adalah merah dan putih
true
EASY

kapan hari sumpah pemuda
28
HARD
     */
//    ------------------------
//    Memanggil metode objek tanpa variabel menggunakan apply()
    KuisDuplikatTiga().apply{
        cetakKuis()
    }
    /*
   output:
   Siapa Presiden pertama indonesia ___
Soekarno
MEDIUM

Apa benar warna bendera indonesia adalah merah dan putih
true
EASY

kapan hari sumpah pemuda
28
HARD
    */
}