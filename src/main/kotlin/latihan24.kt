// filter()
/*
Fungsi filter() memungkinkan Anda membuat subset koleksi. Misalnya, jika memiliki daftar angka, Anda dapat menggunakan
 filter() untuk membuat daftar baru yang hanya berisi angka yang habis dibagi 2.
 */

class KueDuplikatTiga(val nama: String,val diHias: Boolean, val diPanggang: Boolean, val harga: Double)

val kueDuplikatTiga = listOf(
    KueDuplikatTiga(
        nama = "Bolen Pisang Coklat",
        diHias = true,
        diPanggang = true,
        harga = 2.03
    ),
    KueDuplikatTiga(
        nama = "Kue Terang Bulan",
        diHias = true,
        diPanggang = true,
        harga = 1.89
    ),
    KueDuplikatTiga(
        nama = "Bolu Panggang Jadul",
        diHias = false,
        diPanggang = true,
        harga = 3.23
    ),
    KueDuplikatTiga(
        nama = "Lapis Pandan",
        diHias = true,
        diPanggang = false,
        harga = 2.37
    ),
    KueDuplikatTiga(
        nama = "Clorot Gula Merah",
        diHias = true,
        diPanggang = false,
        harga = 1.42
    ),
    KueDuplikatTiga(
        nama = "Kue Amparan Tatak",
        diHias = true,
        diPanggang = false,
        harga = 2.75
    )
)

fun main(){
    /*
    Seperti map() dan forEach(), filter() menggunakan ekspresi lambda tunggal sebagai parameter. Lambda memiliki
    parameter tunggal yang merepresentasikan setiap item dalam koleksi dan menampilkan nilai Boolean.
     Untuk setiap item dalam koleksi:
     1. Jika hasil ekspresi lambda adalah true, item tersebut akan disertakan dalam koleksi baru.
     2. Jika hasilnya adalah false, item tidak disertakan dalam koleksi baru.
     */
val menuKuePanggang = kueDuplikatTiga.filter{
    it.diPanggang
}
    println("Kue Panggang: ")
    menuKuePanggang.forEach{
        println("${it.nama} - $${it.harga}")
    }
    /*
    output:
    Kue Panggang:
Bolen Pisang Coklat - $2.03
Kue Terang Bulan - $1.89
Bolu Panggang Jadul - $3.23
     */
}