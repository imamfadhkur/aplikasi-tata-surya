package com.example.tata_surya

object dataPlanet {
    private val namaPlanet = arrayOf(
        "Merkurius",
        "Venus",
        "Bumi",
        "Mars",
        "Jupiter",
        "Saturnus",
        "Uranus",
        "Neptunus"
    )
    private val detilPlanet = arrayOf(
        "Merkurius merupakan planet yang terdekat dengan matahari dan merupakan planet paling kecil di tata surya. Tidak ada atmosfer yang melindungi merkurius dari radiasi matahari sehingga suhu siang hari di Merkurius mencapai 430 derajat celsius dan 180 derajat celsius pada malam hari.",
        "Nama Venus diambil dari nama nama Dewi Cinta Romawi. Planet kedua terdekat dengan matahari ini merupakan planet terpanas di tata surya.\n" +
                "\n" +
                "Atmosfer Venus berupa lapisan tebal yang sebagian besarnya adalah gas karbon dioksida yang memerangkap suhu panas sehingga suhu permukaan Venus mencapai 471 derajat celsius.\n",
        "Planet terdekat dengan matahari yang ketiga adalah Bumi. Bumi merupakan satu-stunya planet yang diketahui memiliki kehidupan di alam semesta. Bumi berada di jarak yang ideal dengan matahari. Jika Bumi terlalu dekat dengan matahari, air di Bumi akan menguap menjadi gas. Namun, jika terlalu jauh dari matahari, air di Bumi akan membeku.",
        "Setelah Bumi, ada Planet Mars yang namanya diambil dari nama Dewa Perang Romawi. Debu yang kaya zat besi menutupi permukaan Mars dan memberinya warna merah sehingga planet ini disebut sebagai Planet Merah. Planet Mars memiliki gunung berapi terbesar di tata surya, yakni Olympus Mons. Atmosfer tipis dan tidak memiliki pelindung yang tebal membuat Mars memiliki suhu rata-rata minus 60 derajat celsius.",
        "Planet kelima yang terdekat dengan matahari adalah Jupiter. Jupiter yang merupakan raksasa gas merupakan planet terbesar di tata surya. Ukuran Jupiter dua kali lebih besar dari gabungan semua planet lain di tata surya, tetapi memiliki hari yang paling pendek, yakni hanya 10 jam untuk memutar porosnya.",
        "Saturnus, planet keenam yang terdekat dengan matahari, adalah planet terbesar kedua di tata surya. Planet ini terkenal dengan cincinnya yang menonjol. Cincin Saturnus terdiri dari miliaran partikel es dan bebatuan. Cincin terbesar Uranus, Phoebe, membentang seluas hampir 7.000 kali luas Saturnus.",
        "Planet ketujuh yang terdekat dengan matahari, Uranus, merupakan raksasa es yang terdiri dari unsur-unsur air, metana, dan es amonia. Berbeda dari planet lainnya, Uranus mengorbit secara efektif dengan poros hampir mengarah ke matahari dan tampak “berguling” saat mengelilingi matahari.",
        "Neptunus merupakan planet yang terjauh dari matahari. Jaraknya yang sangat jauh membuat sinar matahari butuh waktu empat jam untuk mencapai Neptunus, sedangkan sinar matahari hanya butuh delapan menit untuk mencapai Bumi. Menurut NASA, ketika cahaya matahari mencapai Neptunus, cahaya tersebut 900 kali lebih redup daripada cahaya matahari di Bumi."
    )
    private val fotoPlanet = intArrayOf(
        R.drawable.merkurius,
        R.drawable.venus,
        R.drawable.bumi,
        R.drawable.mars,
        R.drawable.jupiter,
        R.drawable.saturnus,
        R.drawable.uranus,
        R.drawable.neptunus
    )

    val listData: ArrayList<dataClassPlanet>
    get() {
        val list = arrayListOf<dataClassPlanet>()
        for (position in namaPlanet.indices){
            val dataClass = dataClassPlanet()

            dataClass.name = namaPlanet[position]
            dataClass.detail = detilPlanet[position]
            dataClass.foto = fotoPlanet[position]

            list.add(dataClass)
        }
        return list
    }
}