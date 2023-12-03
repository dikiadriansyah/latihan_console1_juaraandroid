//menggunakan class data
data class KalimatPertanyaan<T>(val kalimatPertanyaan: String, val jawaban: T, val perbedaan: Perbedaan)
/*
Catatan: Class data harus memiliki setidaknya satu parameter di konstruktornya, dan semua parameter konstruktor harus
ditandai dengan val atau var. Class data juga tidak boleh berupa abstract, open, sealed, atau inner.
 */

fun main(){
    val kalimatPertanyaan1 = KalimatPertanyaan<String>("Siapa Presiden pertama indonesia ___","Soekarno",Perbedaan.MEDIUM)
    val kalimatPertanyaan2 = KalimatPertanyaan<Boolean>("Apa benar warna bendera indonesia adalah merah dan putih",true, Perbedaan.EASY)
    val kalimatPertanyaan3 = KalimatPertanyaan<Int>("kapan hari sumpah pemuda",28,Perbedaan.HARD)
    println(kalimatPertanyaan1.toString())
/*
output:
KalimatPertanyaan(kalimatPertanyaan=Siapa Presiden pertama indonesia ___, jawaban=Soekarno, perbedaan=MEDIUM)
 */

/*
data class dapat diterapkan dengan metode:
equals()
hasCode() : Anda akan melihat metode ini saat menangani jenis koleksi tertentu
toString()
componentN()
copy()
 */
}