// forEach dan template string dengan lambda
class Kue(val nama: String,val diHias: Boolean, val diPanggang: Boolean, val harga: Double)

val kue = listOf(
    Kue(
        nama = "Bolen Pisang Coklat",
        diHias = true,
        diPanggang = true,
        harga = 2.03
    ),
    Kue(
        nama = "Kue Terang Bulan",
        diHias = true,
        diPanggang = true,
        harga = 1.89
    ),
    Kue(
        nama = "Bolu Panggang Jadul",
        diHias = false,
        diPanggang = true,
        harga = 3.23
    ),
    Kue(
        nama = "Lapis Pandan",
        diHias = true,
        diPanggang = true,
        harga = 2.37
    ),
    Kue(
        nama = "Clorot Gula Merah",
        diHias = true,
        diPanggang = true,
        harga = 1.42
    ),
    Kue(
        nama = "Kue Amparan Tatak",
        diHias = true,
        diPanggang = true,
        harga = 2.75
    )
)
fun main(){
    kue.forEach{
//        println("Menu Kue: $it")
        //    output yg dicetak adalah nama jenis(Cookie), dan ID unik untuk objek, tapi bukan konten objek
        /*
        output:
    Menu Kue: Kue@6193b845
    Menu Kue: Kue@2e817b38
    Menu Kue: Kue@c4437c4
    Menu Kue: Kue@433c675d
    Menu Kue: Kue@3f91beef
         */
//-----------------
//    println("Menu Kue: $it.nama")
/*
output menyisipkan nama class, Cookie, dan ID unik untuk objek yg diikuti dengan .name. nilai properti name tidak diakses

output:
Menu Kue: Kue@4d405ef7.nama
Menu Kue: Kue@6193b845.nama
Menu Kue: Kue@2e817b38.nama
Menu Kue: Kue@c4437c4.nama
Menu Kue: Kue@433c675d.nama
Menu Kue: Kue@3f91beef.nama
 */
//------------------------
//  it.nama menjadi expression lambda
    println("Menu Kue: ${it.nama}")
/*
output:
Menu Kue: Bolen Pisang Coklat
Menu Kue: Kue Terang Bulan
Menu Kue: Bolu Panggang Jadul
Menu Kue: Lapis Pandan
Menu Kue: Clorot Gula Merah
Menu Kue: Kue Amparan Tatak
 */

    }

}