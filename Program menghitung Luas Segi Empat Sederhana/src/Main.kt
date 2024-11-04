import Data.LayangLayang
import Data.Persegi
import Data.PersegiPanjang
import Data.Trapesium
import Data.JajarGenjang
import Data.BelahKetupat

fun main() {
    val persegiPanjang = PersegiPanjang()
    val persegi = Persegi()
    val trapesium = Trapesium()
    val layang = LayangLayang()
    val jajar = JajarGenjang()
    val ketupat= BelahKetupat()

    println("\n---------------------Menghitung Luas Segi Empat-----------------")
    println("[1] persergi Panjang")
    println("[2] persegi ")
    println("[3] Trapesium")
    println("[4] Layang-layang")
    println("[5] Jajar Genjang")
    println("[6] Belah Ketupat")
    print("Pilih Bangun[1-6]: ")
    val pilih1: String? = readLine()
    when (pilih1) {
        "1" -> {
            println("\n-------------Menghitung Luas Persegi Panjang--------------")
            print("panjang  :")
            persegiPanjang.panjang = readLine()!!.toInt()
            print("Lebar    : ")
            persegiPanjang.lebar = readLine()!!.toInt()
            println("Luas persegi panjang adalah ${persegiPanjang.luas()}")
            readLine()
        }
        "2" -> {
            println("\n-------------Menghitung Luas Persegi-----------------------")
            print("panjang sisi :")
            persegi.sisi = readLine()!!.toInt()
            println("Luas Persegi: ${persegi.luas()}")
        }
        "3" ->{
            println("\n-------------Menghitung Luas Trapesium---------------------")
            print("Panjang sisi Pararel Pertama:")
            trapesium.pararel1 = readLine()!!.toInt()
            print("Panjang sisi Pararel Kedua:")
            trapesium.pararel2 = readLine()!!.toInt()
            print("Tinggi:")
            trapesium.tinggi = readLine()!!.toInt()
            println("Luas Trapesium: ${trapesium.luas()}")
        }
        "4" ->{
            println("\n------------Menghitung Luas Layang-Layang------------------")
            print("panjang Diagonal Pertama: ")
            layang.p1= readLine()!!.toInt()
            print("Panjang Diagonal Kedua: ")
            layang.p2= readLine()!!.toInt()
            println("Luas Layang-Layang: ${layang.luas()}")
        }
        "5" ->{
            println("\n------------Menghitung Luas Jajar Genjang------------------")
            print("Panjang Alas: ")
            jajar.pa= readLine()!!.toInt()
            print("Tinggi: ")
            jajar.Ti= readLine()!!.toInt()
            println("Luas Jajar genjang: ${jajar.luas()}")
        }
        "6" ->{
            println("\n------------Menghitung Luas Belah Ketupat-------------------")
            print("Panjang Diagonal Pertama: ")
            ketupat.dia1= readLine()!!.toInt()
            print("Panjang Diagonal Kedua: ")
            ketupat.dia2= readLine()!!.toInt()
            println("Luas Belah Ketupat: ${ketupat.luas()} ")

        }
    }
}