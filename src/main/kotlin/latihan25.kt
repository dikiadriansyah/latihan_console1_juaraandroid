// groupBy()
/*
Fungsi groupBy() dapat digunakan untuk mengubah list menjadi map, berdasarkan fungsi. Setiap nilai unik yang
ditampilkan dari fungsi tersebut akan menjadi key di map yang dihasilkan. value untuk setiap key adalah semua item
dalam koleksi yang menghasilkan nilai unik yang ditampilkan tersebut.

 Fungsi groupBy() dipanggil dengan ekspresi lambda berikut: { it % 2 }.
 */
class KueDuplikatEmpat(val nama: String,val diHias: Boolean, val diPanggang: Boolean, val harga: Double)

val kueDuplikatEmpat = listOf(
    KueDuplikatEmpat(
        nama = "Bolen Pisang Coklat",
        diHias = true,
        diPanggang = true,
        harga = 2.03
    ),
    KueDuplikatEmpat(
        nama = "Kue Terang Bulan",
        diHias = true,
        diPanggang = true,
        harga = 1.89
    ),
    KueDuplikatEmpat(
        nama = "Bolu Panggang Jadul",
        diHias = false,
        diPanggang = true,
        harga = 3.23
    ),
    KueDuplikatEmpat(
        nama = "Lapis Pandan",
        diHias = true,
        diPanggang = false,
        harga = 2.37
    ),
    KueDuplikatEmpat(
        nama = "Clorot Gula Merah",
        diHias = true,
        diPanggang = false,
        harga = 1.42
    ),
    KueDuplikatEmpat(
        nama = "Kue Amparan Tatak",
        diHias = true,
        diPanggang = false,
        harga = 2.75
    )
)
fun main(){
    val grupMenu = kueDuplikatEmpat.groupBy{
        it.diPanggang
    }
    val grupDipanggang = grupMenu[true] ?: listOf()
    val grupDikukus = grupMenu[false] ?: listOf()

//    Catatan: listOf() atau emptyList() akan membuat daftar kosong dan mungkin akan lebih mudah dibaca.

    println("Kue Di Panggang: ")
    grupDipanggang.forEach{
        println("${it.nama} - $${it.harga}")
    }
/*
output:
Kue Di Panggang:
Bolen Pisang Coklat - $2.03
Kue Terang Bulan - $1.89
Bolu Panggang Jadul - $3.23

 */
    println("Kue Dikukus: ")
    grupDikukus.forEach{
        println("${it.nama} - $${it.harga}")
    }
    /*
    output:
   Kue Dikukus:
Lapis Pandan - $2.37
Clorot Gula Merah - $1.42
Kue Amparan Tatak - $2.75
     */

//    Catatan: Jika Anda hanya perlu memisahkan daftar menjadi dua, alternatifnya adalah fungsi partition().
}