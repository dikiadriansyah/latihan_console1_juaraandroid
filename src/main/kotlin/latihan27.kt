// sortedBy()
/*
koleksi Kotlin menyediakan fungsi sortedBy(). sortedBy() memungkinkan Anda menentukan lambda yang menampilkan properti
yang ingin Anda urutkan. Misalnya, jika Anda ingin mengurutkan berdasarkan price, lambda akan menampilkan it.price.
Selama jenis data nilai memiliki tata urutan alami—string diurutkan menurut abjad, nilai numerik diurutkan dalam urutan
menaik—string akan diurutkan seperti koleksi jenis tersebut.
 */
class KueDuplikatEnam(val nama: String,val diHias: Boolean, val diPanggang: Boolean, val harga: Double)

val kueDuplikatEnam = listOf(
    KueDuplikatEnam(
        nama = "Bolen Pisang Coklat",
        diHias = true,
        diPanggang = true,
        harga = 2.03
    ),
    KueDuplikatEnam(
        nama = "Kue Terang Bulan",
        diHias = true,
        diPanggang = true,
        harga = 1.89
    ),
    KueDuplikatEnam(
        nama = "Bolu Panggang Jadul",
        diHias = false,
        diPanggang = true,
        harga = 3.23
    ),
    KueDuplikatEnam(
        nama = "Lapis Pandan",
        diHias = true,
        diPanggang = false,
        harga = 2.37
    ),
    KueDuplikatEnam(
        nama = "Clorot Gula Merah",
        diHias = true,
        diPanggang = false,
        harga = 1.42
    ),
    KueDuplikatEnam(
        nama = "Kue Amparan Tatak",
        diHias = true,
        diPanggang = false,
        harga = 2.75
    )
)
fun main(){
    val urutkanMenu = kueDuplikatEnam.sortedBy{
       /*
       Dalam ekspresi lambda, tampilkan it.name. Daftar yang dihasilkan akan tetap berjenis List<Cookie>, tetapi
       diurutkan berdasarkan nama.
        */
        it.nama
    }

    println("Urutkan Menu: ")
    urutkanMenu.forEach{
        println(it.nama)
     /*
        output:
        Urutkan Menu:
Bolen Pisang Coklat
Bolu Panggang Jadul
Clorot Gula Merah
Kue Amparan Tatak
Kue Terang Bulan
Lapis Pandan
         */
    }
    /*
    Catatan: Koleksi Kotlin juga memiliki fungsi sort() jika jenis data memiliki tata urutan alami.
     */
}