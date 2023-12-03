fun main() {
//    val morningNotification = 51
//    val eveningNotification = 135
//
//    printNotificationSummary(morningNotification)
//    printNotificationSummary(eveningNotification)
//    -----------------------
//    val child = 5
//    val adult = 28
//    val senior = 87
//    val isMonday = true
//    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
//    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
//    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    //    -----------------------
cetakTempraturAkhir(27.0, "Celsius","Farenheit"){9.0/5.0 * it + 32}
cetakTempraturAkhir(350.0,"Kelvin","Celsius"){it - 273.15}
    cetakTempraturAkhir(10.0,"Farenheit","Kelvin"){5.0/9.0 *(it - 32) + 273.15}
}
/*
output:
27.0 derajat Celsius adalah 80.60 derajat Farenheit
350.0 derajat Kelvin adalah 76.85 derajat Celsius
10.0 derajat Farenheit adalah 260.93 derajat Kelvin
 */
//    -----------------------

//fun printNotificationSummary(numberOfMessages: Int) {
//    if(numberOfMessages < 100){
//       println("You have $numberOfMessages notifications")
//    }else{
//       println("Your phone is blowing up! You have 99+ notifications")
//
//    }
//}
//    -----------------------
//fun ticketPrice(age: Int, isMonday: Boolean): Int {
//    // Fill in the code.
//  return when(age){
//      in 0..12-> 15
//       in 13..60->25
//       in 61..100 ->20
//       else -> -1
//   }
//}
//    -----------------------
fun cetakTempraturAkhir(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double)->Double
){
    val finalMeasurement = String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement derajat $initialUnit adalah $finalMeasurement derajat $finalUnit")
}
//    -----------------------
