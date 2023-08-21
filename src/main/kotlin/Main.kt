//Class untuk menyimpan data menu
class Menu(
    var nama: List<String>,
    var harga: Array<Int>,){
}

fun main() {
    //menambahkan data ke class
    val menu = Menu(
        nama = listOf("Ayam Bakar", "Ayam Goreng", "Ayam Geprek", "Kulit Ayam Crsipy", "Sate Usus Ayam"),
        harga = arrayOf(50000,40000,40000,15000,5000)
    )
    //menampilkan data
    for (a in 0..4){
        println("${a+1}. ${menu.nama[a]} = Rp.${menu.harga[a]}/porsi")
    }
    //memanggil function pilih
    val choiceAngka = pilih()
    when(choiceAngka){
        1 -> {
            println("Nama Menu :  ${menu.nama[choiceAngka - 1]}")
            println("Harga :  ${menu.harga[choiceAngka - 1]}")
        }
        2 -> {
            println("Nama Menu : ${menu.nama[choiceAngka - 1]}")
            println("Harga : ${menu.harga[choiceAngka - 1]}")
        }
        3 -> {
            println("Nama Menu : ${menu.nama[choiceAngka - 1]}")
            println("Harga : ${menu.harga[choiceAngka - 1]}")
        }
        4 -> {
            println("Nama Menu : ${menu.nama[choiceAngka - 1]}")
            println("Harga : ${menu.harga[choiceAngka - 1]}")
        }
        5 -> {
            println("Nama Menu : ${menu.nama[choiceAngka - 1]}")
            println("Harga : ${menu.harga[choiceAngka - 1]}")
        }
        else -> println("Pilihan Tidak Tertera")
    }
    //bagian pembayaran
    do {
        print("Masukkan Pembayaran : ")
        val bayar = readlnOrNull()
        val bayarInt = bayar?.toIntOrNull()
    }while (bayar(menu.harga[choiceAngka!! - 1], bayarInt) == false)
    //bagian pengiriman
    do {
        println("1. Take Away")
        println("2. Delivery")
        print("Metode Pengiriman Makanan : ")
        val choice = readlnOrNull()
        val choiceKirim = choice?.toIntOrNull()
    }while (metode(choiceKirim) == false)
}
//function pilih untuk memilih menu makanan
fun pilih(): Int? {
    var choiceAngka: Int?
   do {
       print("Pilih Menu Makanan : ")
       var choice = readlnOrNull()
       choiceAngka = choice?.toIntOrNull()
   }while (choiceAngka!! > 5)
    return choiceAngka
}
//fungsi pembayaran
fun bayar(hargaMenu: Int, bayarInt: Int?): Boolean?{
    if (bayarInt!! < hargaMenu){
        println("Maaf pembayaran Anda gagal!")
        return false
    }
    else if(bayarInt > hargaMenu){
        println("""Terima kasih Anda berhasil memesan makanan
            |Kembalian Anda ${bayarInt - hargaMenu}
        """.trimMargin())
        return true
    }else{
        println("Terima kasih Anda berhasil memesan makanan")
        return true
    }
}
//function metode pengiriman
fun metode(pilih: Int?): Boolean{
    if (pilih == 1){
        print("Makananmu sedang dimasak (5 detik)")
        for (a in 1..5) {
            print(".")
            Thread.sleep(1000)
        }
        println("")
        print("Makananmu sudah siap! Silakan ambil di resto ya! (5 detik)")
        for (a in 1..5) {
            print(".")
            Thread.sleep(1000)
        }
        println("")
        print("Pesanan selesai! (3 detik)")
        for (a in 1..3) {
            print(".")
            Thread.sleep(1000)
        }
        return true

    }else if(pilih == 2){
        print("Makananmu sedang dimasak (5 detik)")
        for (a in 1..5) {
            print(".")
            Thread.sleep(1000)
        }
        println("")
        print("Makananmu sudah siap! Driver segera menuju tempatmu! (5 detik)")
        for (a in 1..5) {
            print(".")
            Thread.sleep(1000)
        }
        println("")
        print("Driver sampai! Pesanan selesai! (3 detik)")
        for (a in 1..3) {
            print(".")
            Thread.sleep(1000)
        }
        return true

    }else{
        println("Pilihan Tidak Tertera")
        return false
    }
}
