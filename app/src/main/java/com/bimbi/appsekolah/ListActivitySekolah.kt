package com.bimbi.appsekolah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bimbi.appsekolah.adapter.AdapterSekolah
import com.bimbi.appsekolah.model.ModelSekolah

class ListActivitySekolah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_sekolah)

        //data list sekolah

        val listSekolah = listOf(
            ModelSekolah("SMA N 1 padang",R.drawable.sma1,"081122334455","SMA Negeri 1 Padang adalah salah satu sekolah menengah atas (SMA) berstatus negeri yang terletak di Kelurahan Lolong Belanti, Kecamatan Padang Utara, Kota Padang, Sumatera Barat. Sekolah ini beralamat di Jalan Belanti Raya No. 11, beberapa puluh meter ke arah barat dari Jalan Khatib Sulaiman, Padang. Sebelumnya, sekolah ini beralamat di Jalan Sudirman No. 1, tetapi kemudian direlokasi ke lokasi sekarang karena bangunan sekolah yang lama rusak berat akibat gempa bumi pada tahun 2009. Gedung sekolah yang baru dibangun di atas lahan seluas 1,6 hektare pada 10 November 2009 dan selesai pada 7 Agustus 2010.\n" +
                    "\n" +
                    "SMA Negeri 1 Padang menduduki posisi ke-137 nasional dan ke-3 di Provinsi Sumatera Barat dalam daftar 1000 besar sekolah dengan nilai rata-rata TPS Ujian Tulis Berbasis Komputer Seleksi Bersama Masuk Perguruan Tinggi Negeri (UTBK-SBMPTN) menurut Lembaga Tes Masuk Perguruan Tinggi tahun 2020.[2]",
                -0.919451623520938, 100.3536804794759),
            ModelSekolah("SMA N 10 padang", R.drawable.sma10,"089988776655","Public Senior High School 10 Padang (Indonesian: SMA Negeri 10 Padang), also known as SMANTEN, is one of many public senior high school in Padang, West Sumatra, Indonesia. It is an unnumbered building that is located at Situjuh Street, several meters to the east of Sudirman Street, Padang. Together with SMA Negeri 1 Padang and SMA Negeri 3 Padang, this school had once been proclaimed as an international school.\n" +
                    "\n" +
                    "Similar to all high schools in Indonesia, the school education in SMA Negeri 10 Padang consists of three years, ranging from 10th Grade to 12th Grade. Facilities include fully airconditioned classrooms, computer lab, library, mosque, and canteen. The school building was severely damaged after earthquakes in 2009.",
                -0.935936297597165, 100.36379315064029),
            ModelSekolah("SMA N 14 padang", R.drawable.sma14,"087766441155","SMA Negeri 14 Padang merupakan salah satu SMA Negeri yang ada di Padang, yang beralamat di Jl. Batu Gadang Kec. Lubuk Kilangan Padang, Sumatera Barat. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 14 Padang ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.\n" +
                    "\n" +
                    "Sekolah Ini memiliki luas +- 2 Hektare yang menjadikannya sebagai Sekolah dengan Bidang Tanah terluas di Kota Padang . Sekolah ini juga memiliki Hutan Sekolah Terbesar di kota padang .\n" +
                    "\n" +
                    "Pada Tahun 2017, SMAN 14 Padang Mendapatkan Gelar Sebagai Sekolah Adiwiyata Nasional 2017 dari Kementrian Lingkungan Hidup Dan Kehutanan Republik Indonesia.",
                -0.9589091796937982, 100.46701253714758),
            ModelSekolah("SMA N 15 padang",R.drawable.sma15,"082334541234","Berdasarkan hasil pengamatan pendeta Bundingh, pemerintahan Belanda dapat mengetahui bahwa la kepandaian gur, tahun 1855 Pemerintah Belanda merencanakan untuk mendirikan Sekolah Raja (bahasa Belanda: Kweekschool) untuk mendidik anak negeri melalui Surat keputusan pendirian Sekolah Raja untuk mendidik anak negeri yang dikeluarkan pada tanggal 1 April 1856.",
                -0.9288276328120382, 100.44770853714738),
            ModelSekolah("SMA N 3 padang",R.drawable.sma3,"08348932197","Cikal bakal berdirinya SMA Negeri 3 Bukittinggi berasal dari nama Sekolah Guru (Kweek School) yaitu pada tahun 1873. Pada tanggal 1 Maret 1873 sekolah guru diubah nama menjadi KWEEK SCHOOL. Guru kepala D. Gerth diubah menjadi Van Wijk. Guru Belanda yang menjadi guru kedua yaitu Weide. Murid-muridnya diasramakan dekat sekolah. Murid-muridnya ini diawasi oleh guru Melayu yang bernama Raja Medan.",
                -0.919377469607345, 100.36462428132593),
            ModelSekolah("SMA N 4 padang", R.drawable.sma4,"083421546723","Pada kesempatan ini Kepala SMAN 4 Bukittinggi, Dra. Eli Noverma, M.Si melantik wakil kepala sekolah terpilih untuk 3 tahun kedepan yaitu Nur Islam, S.Pd, M.Si sebagai Wakil Kepala Sekolah Bidang Kurikulum, Erik Hadi Putra, S.Pd, Gr sebagai Wakil Kepala Sekolah Bidang Kesiswaan, Benny Fitraza Chaidir, S.Pd sebagai Wakil Kepala Sekolah Bidang Sarana dan Prasarana dan Paulina Virgianti, S.Pd terpilih kembali sebagai Wakil Kepala Sekolah Bidang Humas.",
                -0.9594471617184889, 100.40140830831186),
            ModelSekolah("SMA N 5 padang",R.drawable.sma5,"093421678934"," Palang Merah Indonesia (PMI) Bukittinggi mengadakan sosialisasi mengenai peran dan kontribusi PMI di SMA Negeri 5 Bukittinggi yang diikuti oleh para siswa dan guru,Jumat, (25/10)Acara ini bertujuan untuk meningkatkan kesadaran sosial di kalangan pelajar dan memperkenalkan peran PMI di masyarakat.Pada kesempatan itu, Ketua PMI Bukittinggi, Chairunas, menjelaskan, bahwa dalam sosialisasi ini, PMI mengenalkan dua unit layanan utamanya.Kedua unit tersebut ialah, Unit Donor Darah (UDD) yang bertugas menyediakan pasokan darah bagi masyarakat, dan Unit Markas, yang bergerak dalam penanggulangan bencana serta menyediakan layanan ambulans dan mobil jenazah gratis untuk keperluan darurat masyarakat.",
                -0.9045554327200657, 100.39993679109392),
            ModelSekolah("SMA N 6 Padang",R.drawable.sma6,"082321897645","SMA Negeri 1 Padang adalah salah satu sekolah menengah atas (SMA) berstatus negeri yang terletak di Kelurahan Lolong Belanti, Kecamatan Padang Utara, Kota Padang, Sumatera Barat. Sekolah ini beralamat di Jalan Belanti Raya No. 11, beberapa puluh meter ke arah barat dari Jalan Khatib Sulaiman, Padang. Sebelumnya, sekolah ini beralamat di Jalan Sudirman No. 1, tetapi kemudian direlokasi ke lokasi sekarang karena bangunan sekolah yang lama rusak berat akibat gempa bumi pada tahun 2009. Gedung sekolah yang baru dibangun di atas lahan seluas 1,6 hektare pada 10 November 2009 dan selesai pada 7 Agustus 2010.",
                -0.9768121807904555, 100.37584897947623),
            ModelSekolah("SMA adabiah padang",R.drawable.smaadabiah,"085623894567","Semenjak bulan Mei 1958, Kota Padang telah menjadi ibu kota Provinsi Sumatera Barat, sedangkan sebelumnya, ibu kota Provinsi Sumatra Tengah adalah kota Bukittinggi. Sehubungan dengan itu, untuk mengantisipasi bertambahnya penduduk usia sekolah, sedangkan kota Padang pada waktu itu hanya memiliki satu SMA negeri saja, yaitu yang terletak di Jalan Jenderal Sudirman (di gedung lama SMA Negeri 1 Padang sekarang ini.",
                -0.9329363507813523, 100.36835791016169),
            ModelSekolah("SMA semen padang",R.drawable.smasemen,"084567438921","Pada akhir Tahun Ajaran 1976, hanya ada 2 buah SMA berstatus negeri yang menampung seluruh tamatan peserta didik SMP Negeri dan Swasta di Kota Padang. Kuota yang disediakan oleh kedua sekolah tersebut sangat sedikit dibandingkan dengan jumlah seluruh peserta didik tamatan SMP negeri dan swasta di Kota Padang pada masa itu. Dengan demikian, setiap tahun timbul rasa kecemasan dan kegelisahan dari para orang tua yang berkeinginan melanjutkan pendidikan putra dan putri mereka ke SMA negeri yang tersedia. Pemerintah melalui Proyek Pelita Nasional Tahun 1976/1977, mencanangkan berdirinya SMA ketiga di Kota Padang dengan tujuan untuk mencukupi kuota lulusan peserta didik agar dapat tertampung.",
                -0.9543195067728364, 100.46746588132613)
        )

        val adapterSekolah = AdapterSekolah(listSekolah)
        //recycle view
        val rvSekolah : RecyclerView = findViewById(R.id.rvSekolah)
        rvSekolah.adapter = adapterSekolah
        //set layout
        rvSekolah.apply {
            layoutManager = LinearLayoutManager(this@ListActivitySekolah)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}