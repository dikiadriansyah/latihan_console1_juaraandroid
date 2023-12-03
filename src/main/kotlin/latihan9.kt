fun main(){
val hasil = Song("Pesawat Tempur","Iwan fals",2005, 90)
hasil.deskripsilagu()
    println(hasil.cekPopular)
    /*
    output:
    Pesawat Tempur, dibawakan oleh Iwan fals, dirilis pada tahun 2005
false
     */
}

class Song(
val judul: String,
    val artis: String,
    val tahunPublikasi: Int,
    val jmlPemutaran: Int
){
    val cekPopular: Boolean
    get()=jmlPemutaran >= 1000

 fun deskripsilagu(){
     println("$judul, dibawakan oleh $artis, dirilis pada tahun $tahunPublikasi")
 }
}