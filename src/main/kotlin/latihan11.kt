open class Phone(var isScreenLightOn: Boolean = false){
  open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var jenisLayar: Boolean = true): Phone(){
    override fun switchOn(){
        if(!jenisLayar){
            isScreenLightOn = true
        }
    }

    fun fold(){
            jenisLayar = true
        }

        fun notFold(){
            jenisLayar = false
        }

}
fun main(){
var result = FoldablePhone()
result.switchOn()
    result.checkPhoneScreenLight()
    result.notFold()
    result.switchOn()
    result.checkPhoneScreenLight()
    /*
    output:
    The phone screen's light is off.
The phone screen's light is on.
     */
}

