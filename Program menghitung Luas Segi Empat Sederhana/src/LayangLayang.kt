package Data
class LayangLayang: LuasSegiEmpat() {
    var p1:Int=0
    var p2:Int=0
    override fun luas(): Float {
        return ((p1*p2)/2).toFloat()
    }
}