package Data
class Persegi: LuasSegiEmpat(){
    var sisi:Int =0

    override fun luas(): Float {
        return (sisi*sisi).toFloat()
    }
}