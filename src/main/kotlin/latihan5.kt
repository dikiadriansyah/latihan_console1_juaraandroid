import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//----------------------
// menentukan delegasi properti
open class Motor protected constructor(val nama: String, val jenisBahanBakar: String) {
    var statusMesin = "Hidup"
        protected set

    open val sumberEnergi = "Tidak Diketahui"

    open fun nyala(){
        statusMesin = "Hidup"
    }
    open fun mati(){
        statusMesin = "mati"
    }



}


class MotorBensin(jenisNama: String, jenisBensin: String):
    Motor(nama = jenisNama, jenisBahanBakar = jenisBensin){
    var spedometer = 5
    private var roda = 1
//    private var knalpot=2

    override val sumberEnergi = "Pertalite"

    private var knalpot by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 100)
    private var jumlahRoda by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)
    private var kursi = 1


    override fun nyala(){
        super.nyala()
        println("nama kendaraan: $nama, dengan kecepatan: $spedometer")
    }
    override fun mati(){
        super.mati()
        println("nama kendaraan: $nama, mesin mati")
    }

    fun jumlahRoda(){
        roda++
        println("$nama memiliki roda berjumlah: $roda")
    }

    fun jumlahKnalpot(){
        knalpot++
        println("$nama memiliki knalpot berjumlah: $knalpot")
    }





    protected fun kecepatan(){
        spedometer++
    }

}

class MotorListrik(jenisNama: String, jenisBensin: String):
    Motor(nama = jenisNama, jenisBahanBakar = jenisBensin){

    private var tingkatBaterai by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    private var knalpot=0

    override val sumberEnergi = "Listrik"


    override fun nyala(){
        super.nyala()
        tingkatBaterai = 3
        println("nama kendaraan: $nama, dengan tingkat baterai $tingkatBaterai ")
    }
    override fun mati(){
        super.mati()
        tingkatBaterai = 0
        println("nama kendaraan: $nama, mesin mati")
    }

    fun statusBaterai(){
        tingkatBaterai++
        println("$nama memiliki jumlah baterai $tingkatBaterai")
    }
}

class MotorPintar(
    val motorBensin: MotorBensin,
    val motorListrik: MotorListrik
){
    var jumlahMesinHidup = 0
    private set

    fun motorBensinMenyala(){
        jumlahMesinHidup++
        motorBensin.nyala()
    }
    fun motorBensinMematikan(){
        jumlahMesinHidup--
        motorBensin.mati()
    }

    fun motorListrikMenyala(){
        jumlahMesinHidup++
        motorListrik.nyala()
    }

    fun motorListrikMematikan(){
        jumlahMesinHidup--
        motorListrik.mati()
    }

    fun hitungRoda(){
        motorBensin.jumlahRoda()
    }

    fun hitungKnalpot(){
        motorBensin.jumlahKnalpot()
    }

    fun indikatorBaterai(){
        motorListrik.statusBaterai()
    }

    fun semuaMotorMati(){
        motorBensinMematikan()
        motorListrikMematikan()
    }

}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    private var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
    return fieldData
    }
/*
Catatan: KProperty adalah antarmuka yang mewakili properti yang dideklarasikan dan memungkinkan Anda mengakses metadata
pada properti yang didelegasikan. Ada baiknya memiliki informasi tingkat tinggi tentang pengertian KProperty.
 */

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
    if(value in minValue..maxValue){
        fieldData = value
    }
    }
}

fun main(){
    var hasil1 = MotorPintar(
        MotorBensin(jenisNama = "Vario 125 CBS", jenisBensin = "Pertalite"),
        MotorListrik(jenisNama = "Gesit 111", jenisBensin = "Listrik")
    )

    hasil1.motorBensinMenyala()
    hasil1.motorListrikMenyala()
    println("Total Kendaraan menyala sekarang: ${hasil1.jumlahMesinHidup}")
    println()

/*
output:
nama kendaraan: Vario 125 CBS, dengan kecepatan: 5
nama kendaraan: Gesit 111, dengan tingkat baterai 3
Total Kendaraan menyala sekarang: 2
 */

    hasil1.hitungRoda()
    hasil1.hitungKnalpot()
    hasil1.indikatorBaterai()
    println()
    /*
    Vario 125 CBS memiliki roda berjumlah: 2
Vario 125 CBS memiliki knalpot berjumlah: 2
Gesit 111 memiliki jumlah baterai 4
     */

    hasil1.semuaMotorMati()
    println("Total Kendaraan menyala sekarang: ${hasil1.jumlahMesinHidup}")
/*
nama kendaraan: Vario 125 CBS, mesin mati
nama kendaraan: Gesit 111, mesin mati
Total Kendaraan menyala sekarang: 0

 */
}