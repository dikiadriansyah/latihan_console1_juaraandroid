fun main() {
//    Menggunakan fungsi repeat()
    val fungsiKejutan = trikAtauKejutan(false){"$it perempat"}
    val fungsiTrik = trikAtauKejutan(true, null)
    repeat(4){
        fungsiKejutan()
    }
//     Anda dapat memanggilnya beberapa kali dengan fungsi repeat().
//    4 untuk parameter times dan gunakan sintaksis lambda akhir untuk fungsi action
    fungsiTrik()

}

fun trikAtauKejutan(isTrik: Boolean, extraKejutan: ((Int) -> String)?): () -> Unit {
//    extraKejutan:(()->String)? adalah parameter extraKejutan menjadi nullable agar tidak perlu menyediakan
//    fungsi extraKejutan()

    if (isTrik) {
//        jika isTrik adlaah true dan tampilkan fungsi trik
        return trik
    } else {

        if (extraKejutan != null) {
            println(extraKejutan(5))
        }

        return kejutan
    }
}

val kejutan = {
    println("Tidak ada Kejutan")
}
//----------
//menggunakan fungsi sebagai jenis data
val trik :()-> Unit = {
    println("Tidak ada hadiah")
}