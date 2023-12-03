// menggunakan class dengan generik dan class enum

class Pertanyaan<T>(val kalimatPertanyaan: String, val jawaban: T, val perbedaan: Perbedaan)
// <T> diatas adalah jenis generik.
//jawaban harus berjenis T karena jenis datanya ditentukan saat membuat instance class Pertanyaan

enum class Perbedaan{
    EASY, MEDIUM, HARD
}

fun main(){
   val pertanyaan1= Pertanyaan<String>("Siapa Presiden pertama indonesia ___","Soekarno",Perbedaan.MEDIUM)
    val pertanyaan2=Pertanyaan<Boolean>("Apa benar warna bendera indonesia adalah merah dan putih",true, Perbedaan.EASY)
    val pertanyaan3=Pertanyaan<Int>("kapan hari sumpah pemuda",28,Perbedaan.HARD)
    println(pertanyaan1)
    /*
    output:
    Pertanyaan@7530d0a

// penjelasan:
// output diatas menampilkan nama class, dan ID unik untuk objek
     */
}