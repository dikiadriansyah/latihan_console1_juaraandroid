//
////open class Motor(val nama: String, val jenisBahanBakar: String){
//////    Menentukan pengubah visibilitas untuk properti
////     var statusMesin = "Hidup"
////    protected set(value){
////        field = value
////    }
////    open fun nyala(){
////        statusMesin = "Hidup"
////    }
////    open fun mati(){
////        statusMesin = "mati"
////    }
////
////}
////----------------------
////pengubah visibilitas untuk constructor
//open class Motor protected constructor(val nama: String, val jenisBahanBakar: String) {
//    var statusMesin = "Hidup"
//    protected set(value){
//        field = value
//    }
//    open fun nyala(){
//        statusMesin = "Hidup"
//    }
//    open fun mati(){
//        statusMesin = "mati"
//    }
//}
////----------------------
//// pengubah visibilitas untuk class
////internal open class Motor(val nama: String, val jenisBahanBakar: String){
////    var statusMesin = "Hidup"
////    protected set(value){
////        field = value
////    }
////    open fun nyala(){
////        statusMesin = "Hidup"
////    }
////    open fun mati(){
////        statusMesin = "mati"
////    }
////}
//// kode internal class diatas untuk melindungi sehingga kode dibawah menjadi error
////----------------------
//
//class MotorBensin(jenisNama: String, jenisBensin: String):
//Motor(nama = jenisNama, jenisBahanBakar = jenisBensin){
//     var spedometer = 5
//    private var roda = 2
//    set(value){
//        if(value in 0..10){
//            field = value
//        }
//    }
//
//    private var kursi = 1
//    set(value){
//        if(value in 0..15){
//            field = value
//        }
//    }
//
//    override fun nyala(){
//        statusMesin = "Hidup"
//    spedometer = 4
//    println("nama kendaraan: $nama, dengan kecepatan: $spedometer")
//}
//    override fun mati(){
//        statusMesin = "mati"
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
//
//    protected fun kecepatan(){
//        spedometer++
//    }
//
//}
//
//class MotorListrik(jenisNama: String, jenisBensin: String):
//Motor(nama = jenisNama, jenisBahanBakar = jenisBensin){
//   private var bateraiLevel = 2
//    set(value){
//        if(value in 0..100){
//            field = value
//        }
//    }
//
//    override fun nyala(){
//        super.nyala()
//        statusMesin = "Hidup"
//    println("nama kendaraan: $nama, dengan tingkat baterai $bateraiLevel ")
//}
//    override fun mati(){
//        super.mati()
//        statusMesin = "mati"
//        println("mesin mati")
//    }
//
//    fun statusBaterai(){
//        bateraiLevel++
//        println("$nama memiliki jumlah baterai $bateraiLevel")
//    }
//
//
//
//}
//
//class MotorPintar(
//    val motorBensin: MotorBensin,
//    val motorListrik: MotorListrik
//){
//var jumlahMesinHidup = 0
//
//    fun motorBensinMenyala(){
//        jumlahMesinHidup++
//        motorBensin.nyala()
//    }
//    fun motorBensinMematikan(){
//        jumlahMesinHidup--
//        motorListrik.mati()
//    }
//
//    fun motorListrikMenyala(){
//        jumlahMesinHidup++
//        motorListrik.nyala()
//    }
//
//    fun motorListrikMematikan(){
//        jumlahMesinHidup--
//        motorListrik.mati()
//    }
//}
//
//fun main(){
//var hasil = MotorBensin("Vario 125 PGM","Pertalite")
//    println("dijual motor: ${hasil.nama}, dengan bahan bakar: ${hasil.jenisBahanBakar}")
//
//}