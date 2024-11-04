package Data
class Trapesium: LuasSegiEmpat() {
    var pararel1:Int=0
    var pararel2:Int=0
    var tinggi:Int=0

    override fun luas(): Float {
        return((pararel1+pararel2)/2*tinggi).toFloat()
    }
}