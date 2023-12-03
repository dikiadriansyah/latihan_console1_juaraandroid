//class Mobil{
////    membuat properti nama, jenis, dan statusKendaraan
//    val nama = "Mobil Hyundai"
//    val jenisBahanBakar = "Bahan Bakar Listrik"
//    val statusKendaraan = "Aktif"
//
////    membuat metode dalam class
//    fun maju(){
//        println("Mobil sedang bergerak maju")
//    }
//    fun mundur(){
//        println("Mobil sedang bergerak mundur")
//    }
//}

//-------
// menentukan constructor parameter
//class Mobil(val nama: String, val jenisBahanBakar: String){
//        val statusKendaraan = "Aktif"
//
//    //    membuat metode dalam class
//    fun maju(){
//        println("Mobil sedang bergerak maju")
//    }
//    fun mundur(){
//        println("Mobil sedang bergerak mundur")
//    }
//}
//-------
// menentukan constructor parameter kolaborasi statement when()
//class Mobil(val nama: String, val jenisBahanBakar: String){
//    var statusKendaraan = "Aktif"
//
//    constructor(nama: String, jenisBahanBakar: String, tahunPembuatan: Int): this(nama, jenisBahanBakar){
//        statusKendaraan = when(tahunPembuatan){
//            2005 -> "Kendaraan Tua"
//            2018 -> "Kendaraan Remaja"
//            2023 -> "Kendaraan Baru"
//            else -> "Kendaraan Tidak Diketahun"
//        }
//    }
//
//    fun maju(){
//        println("Mobil sedang bergerak maju")
//    }
//    fun mundur(){
//        println("Mobil sedang bergerak mundur")
//    }
//}
//-------
// membuat superclass atau parent
//open class Mobil(val nama: String, val jenisBahanBakar: String){
//    var statusKendaraan = "Aktif"
//}

//membuat subclass atau child
//class Toyota(jenisNama: String, jenisBensin: String):Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
//var roda = 4
//    set(value){
//        if(value in 0..10){
//            field = value
//        }
//    }
//
//    var kursi = 6
//    set(value){
//        if(value in 0..15){
//            field = value
//        }
//    }
//
//    fun nyala(){
//        println("Mesin menyala")
//    }
//    fun mati(){
//        println("Mesin mati")
//    }
//
//    fun jumlahRoda(){
//        roda++
//        println("$nama memiliki roda berjumlah: $roda")
//    }
//
//    fun jumlahKursi(){
//        kursi++
//        println("$nama memiliki kursi berjumlah: $kursi")
//    }
//
//}
//
//class Hyundai(jenisNama: String, jenisBensin: String):Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
//    var bateraiLevel = 0
//    set(value){
//        if(value in 0..100){
//            field = value
//        }
//    }
//
//    fun nyala(){
//        println("Mesin menyala")
//    }
//    fun mati(){
//        println("Mesin mati")
//    }
//
//    fun statusBaterai(){
//        bateraiLevel++
//        println("$nama memiliki jumlah baterai $bateraiLevel")
//    }
//
//}
//
//class MobilPintar(val hynd: Hyundai, val toyot: Toyota){
//    fun menyalakan(){
//        hynd.nyala()
//    }
//    fun mematikanHyundai(){
//        hynd.mati()
//    }
//
//    fun mematikanToyota(){
//        toyot.mati()
//    }
//
//    fun karakteristrikRoda(){
//        toyot.jumlahRoda()
//    }
//
//    fun matikanSemuaKendaraan(){
//        mematikanHyundai()
//        mematikanToyota()
//    }
//}
//---------------------
// mengganti metode superclass dari subclass
//open class Mobil{
//    var nama: String = ""
//    var jenisBahanBakar: String = ""
//        var statusKendaraan = "Aktif"
//
//    constructor(nama: String, jenisBahanBakar: String){
//        this.nama = nama
//        this.jenisBahanBakar=jenisBahanBakar
//    }
//
//    open fun nyala(){
//        statusKendaraan = "Aktf"
//    }
//    open fun mati(){
//        statusKendaraan = "mati"
//    }
//}
//
//class Toyota(jenisNama: String, jenisBensin: String):
//    Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
//    var spedometer = 5
//    var roda = 4
//    set(value){
//        if(value in 0..10){
//            field = value
//        }
//    }
//
//    var kursi = 6
//    set(value){
//        if(value in 0..15){
//            field = value
//        }
//    }
//
//    override fun nyala(){
//    statusKendaraan = "Aktf"
//    spedometer = 4
//    println("nama kendaraan: $nama, dengan kecepatan: $spedometer")
//}
//    override fun mati(){
//    statusKendaraan = "mati"
//    spedometer = 0
//    println("mesin mati")
//}
//
//    fun jumlahRoda(){
//        roda++
//        println("$nama memiliki roda berjumlah: $roda")
//    }
//
//    fun jumlahKursi(){
//        kursi++
//        println("$nama memiliki kursi berjumlah: $kursi")
//    }
//}
//
//class Hyundai(jenisNama: String, jenisBensin: String):Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
//    var bateraiLevel = 2
//    set(value){
//        if(value in 0..100){
//            field = value
//        }
//    }
//
//override fun nyala(){
//    statusKendaraan = "Aktf"
//    println("nama kendaraan: $nama, dengan tingkat baterai $bateraiLevel ")
//}
//    override fun mati(){
//        statusKendaraan = "mati"
//        println("mesin mati")
//    }
//
//    fun statusBaterai(){
//        bateraiLevel++
//        println("$nama memiliki jumlah baterai $bateraiLevel")
//    }
//}

//-------
// menggunakan kembali kode superclass di subclass dengan keyword super
//open class Mobil{
//    var nama: String = ""
//    var jenisBahanBakar: String = ""
//        var statusKendaraan = "Aktif"
//
//    constructor(nama: String, jenisBahanBakar: String){
//        this.nama = nama
//        this.jenisBahanBakar=jenisBahanBakar
//    }
//
//    open fun nyala(){
//        statusKendaraan = "Aktf"
//    }
//    open fun mati(){
//        statusKendaraan = "mati"
//    }
//}
//
//class Toyota(jenisNama: String, jenisBensin: String):
//    Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
//    var spedometer = 5
//    var roda = 4
//    set(value){
//        if(value in 0..10){
//            field = value
//        }
//    }
//
//    var kursi = 6
//    set(value){
//        if(value in 0..15){
//            field = value
//        }
//    }
//
//    override fun nyala(){
//   super.nyala()
//    println("nama kendaraan: $nama, dengan kecepatan: $spedometer")
//}
//    override fun mati(){
//    super.mati()
//    println("mesin mati")
//}
//
//    fun jumlahRoda(){
//        roda++
//        println("$nama memiliki roda berjumlah: $roda")
//    }
//
//    fun jumlahKursi(){
//        kursi++
//        println("$nama memiliki kursi berjumlah: $kursi")
//    }
//}
//
//class Hyundai(jenisNama: String, jenisBensin: String):Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
//    var bateraiLevel = 2
//    set(value){
//        if(value in 0..100){
//            field = value
//        }
//    }
//
//    override fun nyala(){
//        super.nyala()
//    statusKendaraan = "Aktf"
//    println("nama kendaraan: $nama, dengan tingkat baterai $bateraiLevel ")
//}
//    override fun mati(){
//        super.mati()
//        statusKendaraan = "mati"
//        println("mesin mati")
//    }
//
//    fun statusBaterai(){
//        bateraiLevel++
//        println("$nama memiliki jumlah baterai $bateraiLevel")
//    }
//}
//    --------------
// mengganti properti superclass dari subclass
open class Mobil{
    var nama: String = ""
    var jenisBahanBakar: String = ""
    var statusKendaraan = "Aktif"
    open val tipeKendaraan = "Kendaraan Tidak Diketahui"

    constructor(nama: String, jenisBahanBakar: String){
        this.nama = nama
        this.jenisBahanBakar=jenisBahanBakar
    }

    open fun nyala(){
        statusKendaraan = "Aktf"
    }
    open fun mati(){
        statusKendaraan = "mati"
    }
}

class Toyota(jenisNama: String, jenisBensin: String):
    Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
    var spedometer = 5
    var roda = 4
        set(value){
            if(value in 0..10){
                field = value
            }
        }

    var kursi = 6
        set(value){
            if(value in 0..15){
                field = value
            }
        }

    override val tipeKendaraan = "Toyota Avanza"
    override fun nyala(){
        super.nyala()
        println("nama kendaraan: $nama, dengan kecepatan: $spedometer")
    }
    override fun mati(){
        super.mati()
        println("mesin mati")
    }

    fun jumlahRoda(){
        roda++
        println("$nama memiliki roda berjumlah: $roda")
    }

    fun jumlahKursi(){
        kursi++
        println("$nama memiliki kursi berjumlah: $kursi")
    }
}

class Hyundai(jenisNama: String, jenisBensin: String):Mobil(nama = jenisNama, jenisBahanBakar = jenisBensin){
    var bateraiLevel = 2
        set(value){
            if(value in 0..100){
                field = value
            }
        }

    override val tipeKendaraan = "Hyundai Ioniq"

    override fun nyala(){
        super.nyala()
        statusKendaraan = "Aktf"
        println("nama kendaraan: $nama, dengan tingkat baterai $bateraiLevel ")
    }
    override fun mati(){
        super.mati()
        statusKendaraan = "mati"
        println("mesin mati")
    }

    fun statusBaterai(){
        bateraiLevel++
        println("$nama memiliki jumlah baterai $bateraiLevel")
    }
}
//    --------------

fun main(){
//    4 konsep OOP:
    /*
    1. Enkapsulasi
    2. Abstraksi
    3. Pewarisan
    4. Polimorfisme
     */
//val mobil = Mobil()
//    println("Nama Kendaraan: ${mobil.nama}")
//    output: Nama Kendaraan: Mobil Hyundai

    // memanggil metode pada objek
//    mobil.maju()
//    output: Mobil sedang berjalan
//------------------
//    val hasil = Mobil(nama = "Mobil Hyundai", jenisBahanBakar = "Listrik")
//    println("Nama Kendaraan: ${hasil.nama}")
//    hasil.maju()
    //------------------
//    val hasil = Mobil(nama = "Mobil Hyundai", jenisBahanBakar = "Listrik")
//    println("Nama Kendaraan: ${hasil.nama}, dengan jenis bahan bakar: ${hasil.jenisBahanBakar}, dan status kendaraan: ${hasil.statusKendaraan}")
//----------------
//    val hasil = Toyota("Avanza Veloz", "Solar")
//println("Nama Kendaraan: ${hasil.nama}, dengan jenis bahan bakar: ${hasil.jenisBahanBakar}")
//    hasil.jumlahRoda()
//    hasil.jumlahKursi()
    /*
    output:
    Nama Kendaraan: Avanza Veloz, dengan jenis bahan bakar: Solar
Avanza Veloz memiliki roda berjumlah: 5
Avanza Veloz memiliki kursi berjumlah: 7
     */

//    val hasil2 = Hyundai("IONIQ5","Listrik")
//    println("Nama Kendaraan: ${hasil2.nama}, dengan jenis bahan bakar: ${hasil2.jenisBahanBakar}")
//    hasil2.statusBaterai()
/*
Nama Kendaraan: IONIQ5, dengan jenis bahan bakar: Listrik
IONIQ5 memiliki jumlah baterai 1
 */
//    --------------
//var mobil:Mobil = Toyota("Avanza Veloz","Solar")
//    mobil.nyala()
//
//    mobil = Hyundai("IONIQ 5", "Listrik")
//    mobil.nyala()

    /*
    nama kendaraan: Avanza Veloz, dengan kecepatan: 4
nama kendaraan: IONIQ 5, dengan tingkat baterai 2

penjelasan:
kode diatas adalah polimorfisme. kode memanggil metode nyala() pada variabel jenis mobil dan bergantung pada nilai
sebenarnya dan variabel itu, implementasi metode nyala() yg berbeda dapat dieksekusi
     */
}