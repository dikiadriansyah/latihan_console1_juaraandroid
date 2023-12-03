// fold()
/*
Fungsi fold() digunakan untuk menghasilkan nilai tunggal dari koleksi. Fungsi ini paling sering digunakan untuk hal-hal
seperti menghitung total harga, atau menjumlahkan semua elemen dalam daftar untuk menemukan rata-rata.

Fungsi fold() mengambil dua parameter:
1. Nilai awal. Jenis data disimpulkan saat memanggil fungsi (yaitu nilai awal 0 disimpulkan sebagai Int).
2. Ekspresi lambda yang menampilkan nilai berjenis sama dengan nilai awal.

Ekspresi lambda juga memiliki dua parameter:
1. dikenal sebagai akumulator. Akumulator memiliki jenis data yang sama dengan nilai awal. Anggap saja ini sebagai total
 run. Setiap kali ekspresi lambda dipanggil, akumulator sama dengan nilai yang ditampilkan dari waktu sebelumnya lambda dipanggil.
2. jenis yang sama dengan setiap elemen dalam koleksi.
 */

class KueDuplikatLima(val nama: String,val diHias: Boolean, val diPanggang: Boolean, val harga: Double)

val kueDuplikatLima = listOf(
    KueDuplikatLima(
        nama = "Bolen Pisang Coklat",
        diHias = true,
        diPanggang = true,
        harga = 2.03
    ),
    KueDuplikatLima(
        nama = "Kue Terang Bulan",
        diHias = true,
        diPanggang = true,
        harga = 1.89
    ),
    KueDuplikatLima(
        nama = "Bolu Panggang Jadul",
        diHias = false,
        diPanggang = true,
        harga = 3.23
    ),
    KueDuplikatLima(
        nama = "Lapis Pandan",
        diHias = true,
        diPanggang = false,
        harga = 2.37
    ),
    KueDuplikatLima(
        nama = "Clorot Gula Merah",
        diHias = true,
        diPanggang = false,
        harga = 1.42
    ),
    KueDuplikatLima(
        nama = "Kue Amparan Tatak",
        diHias = true,
        diPanggang = false,
        harga = 2.75
    )
)
fun main(){
    val totalHarga = kueDuplikatLima.fold(0.0){
        total, kue -> total + kue.harga
// total untuk akumulator dan kue untuk elemen koleksi
    }
    println("Total Harga: $${totalHarga}")
/*
output:
    Total Harga: $13.69
 */

    /*
    Catatan:
    fold() terkadang disebut reduce(). Fungsi fold() di Kotlin berfungsi sama dengan fungsi reduce() yang ditemukan di
    JavaScript, Swift, Python, dll. Perhatikan bahwa Kotlin juga memiliki fungsinya sendiri yang disebut reduce(),
    dengan akumulator dimulai dengan elemen pertama dalam koleksi, bukan nilai awal yang diteruskan sebagai argumen.
     */
}