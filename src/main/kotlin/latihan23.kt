// map()
/*
Fungsi map() memungkinkan Anda mengubah koleksi menjadi koleksi baru dengan jumlah elemen yang sama
 */
class KueDuplikatDua(val nama: String,val diHias: Boolean, val diPanggang: Boolean, val harga: Double)

val kueDuplikatDua = listOf(
    KueDuplikatDua(
        nama = "Bolen Pisang Coklat",
        diHias = true,
        diPanggang = true,
        harga = 2.03
    ),
    KueDuplikatDua(
        nama = "Kue Terang Bulan",
        diHias = true,
        diPanggang = true,
        harga = 1.89
    ),
    KueDuplikatDua(
        nama = "Bolu Panggang Jadul",
        diHias = false,
        diPanggang = true,
        harga = 3.23
    ),
    KueDuplikatDua(
        nama = "Lapis Pandan",
        diHias = true,
        diPanggang = true,
        harga = 2.37
    ),
    KueDuplikatDua(
        nama = "Clorot Gula Merah",
        diHias = true,
        diPanggang = true,
        harga = 1.42
    ),
    KueDuplikatDua(
        nama = "Kue Amparan Tatak",
        diHias = true,
        diPanggang = true,
        harga = 2.75
    )
)
fun main(){
    val semuaMenu = kueDuplikatDua.map{
        "${it.nama} - $${it.harga}"
//        tanda $ sebelum ekspresi adalah sebagai tanda dolar($) karena tidak diikuti oleh nama variabel atau ekspresi lambda.
    }
//println(semuaMenu)
//    //    [Bolen Pisang Coklat - $2.03, Kue Terang Bulan - $1.89, Bolu Panggang Jadul - $3.23, Lapis Pandan - $2.37, Clorot Gula Merah - $1.42, Kue Amparan Tatak - $2.75]

    println("Semua Menu: ")
    semuaMenu.forEach{
        println(it)
    }
    /*
    Semua Menu:
Bolen Pisang Coklat - $2.03
Kue Terang Bulan - $1.89
Bolu Panggang Jadul - $3.23
Lapis Pandan - $2.37
Clorot Gula Merah - $1.42
Kue Amparan Tatak - $2.75

     */

}