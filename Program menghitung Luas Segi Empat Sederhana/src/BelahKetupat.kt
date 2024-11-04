package Data
class BelahKetupat : LuasSegiEmpat(){
    var dia1:Int=0
    var dia2:Int=0

    override fun luas(): Float {
        return ((dia1*dia2)/2).toFloat()
    }

}