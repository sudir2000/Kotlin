package Data

class PersegiPanjang: LuasSegiEmpat() {
    var panjang: Int= 0
    var lebar: Int=0


    override fun luas(): Float {
        return (panjang*lebar).toFloat()
    }


}