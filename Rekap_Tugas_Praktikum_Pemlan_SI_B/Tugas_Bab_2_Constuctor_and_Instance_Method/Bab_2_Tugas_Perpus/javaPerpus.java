package modulpraktikum.tugasperpus;

public class javaPerpus {
    public static void main(String[] args) {
        Perpus b1 = new Perpus();
        Perpus b2 = new Perpus();
        Perpus b3 = new Perpus();
        Perpus b4 = new Perpus();
        Perpus b5 = new Perpus();
        Perpus b6 = new Perpus();
        Perpus b7 = new Perpus();
        Perpus b8 = new Perpus();
        Perpus b9 = new Perpus();
        Perpus b11 = new Perpus();
        Perpus b13 = new Perpus();
        Perpus b14 = new Perpus();

        b1.setJudul("A History of science technology and philosophy in the eighteenth century");
        b1.setKategori("Teknologi");
        b1.setPenulis("McKie, D.");
        b1.setPenerbit("LondonGeorge Allen & Unwin Ltd 1952");
        b1.setBahasa("Inggris");
        b1.setEdisi("Kedua");
        b1.setHalaman(814);
        b1.setSinopsis("Buku ini dimulai dengan membahas perubahan sosial, politik, dan intelektual yang terjadi pada abad ke-18. Kemudian, penulis membahas tentang perkembangan ilmu pengetahuan pada masa tersebut.");
        b1.cekPlagiarisme(b2);
        b1.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b2.setJudul("Information and Communication Technology,dan Literasi Media Digital");
        b2.setKategori("Teknologi");
        b2.setJumlahPenulis(new String[]{"Dewi Kartika Sari", "Nurul Hasfi", "Hedi Pudjo Santosa", "Triyono Lukmantoro", "Narayana Mahendra Prastya", "Santi Isnaini", "Said Romadlan", "Sa’diyah El Adawiyah", "Suwarto", "Aminah Swarnawati", "AgungPrabowo", "Kurnia Arofah", "Sri Budi Lestari", "Edi antoso","M as’Amah"});
        b2.setPenerbit("ASPIKOM 2015");
        b2.setBahasa("Indonesia");
        b2.setEdisi("Pertama");
        b2.setHalaman(178);
        b2.setSinopsis("Buku ini membahas tentang bagaimana teknologi informasi dan komunikasi berpengaruh pada kehidupan sehari-hari, dan bagaimana literasi media digital dapat membantu seseorang dalam memahami, menggunakan, dan memanfaatkan teknologi informasi dan komunikasi dengan bijak.");
        b2.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b3.setJudul("Dunia Sophie");
        b3.setKategori("Filsafat");
        b3.setPenulis("Jostein Gaarder");
        b3.setPenerbit("Mizan Pustaka 2014");
        b3.setBahasa("Indonesia");
        b3.setEdisi("-");
        b3.setHalaman(800);
        b3.setSinopsis("Novel ini mengisahkan tentang kehidupan seorang gadis remaja yang menerima surat misterius.");
        b3.displayMessage();

        System.out.println("=====================================");
        System.out.println();
        b4.setJudul("Filsafat Kata");
        b4.setKategori("Filsafat");
        b4.setPenulis("Reza Alexander Antonius Wattimena");
        b4.setPenerbit("Evolitera 2011");
        b4.setBahasa("Indonesia");
        b4.setEdisi("-");
        b4.setHalaman(396);
        b4.setSinopsis("Buku ini membahas tentang konsep-konsep penting dalam filsafat bahasa, seperti makna, tanda, dan referensi, serta membahas bagaimana bahasa dapat digunakan untuk menciptakan realitas yang berbeda-beda.");
        b4.cekPlagiarisme(b3);
        b4.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b5.setJudul("Dinamika Pendidikan Islam: Perspektif Historis");
        b5.setKategori("Sejarah");
        b5.setPenulis("Dr. Siswanto, M.Pd.I");
        b5.setPenerbit("Pena Salsabila 2013");
        b5.setBahasa("Indonesia");
        b5.setEdisi("-");
        b5.setHalaman(190);
        b5.setSinopsis("Buku ini membahas tentang sejarah dan perkembangan pendidikan Islam di berbagai belahan dunia dari masa ke masa.");
        b5.displayMessage();

        System.out.println("=====================================");
        System.out.println();
        b6.setJudul("Penulisan dan Penghimpunan Hadis: Kajian Historis");
        b6.setKategori("Sejarah");
        b6.setPenulis("Rasul Ja'fariyan");
        b6.setPenerbit("Lentera 1992");
        b6.setBahasa("Indonesia");
        b6.setEdisi("Pertama");
        b6.setHalaman(100);
        b6.setSinopsis("Buku ini membahas tentang sejarah dan perkembangan hadis dalam Islam, termasuk metode penulisan dan pengumpulan hadis, serta kriteria yang digunakan untuk menilai keaslian hadis.");
        b6.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b7.setJudul("Berkata Baik atau Diam: 294 Adab Kebiasaan Rasulullah SAW.");
        b7.setKategori("Agama");
        b7.setPenulis("Ninik Handrini");
        b7.setPenerbit("PT. Gramedia Pustaka Utama 2016");
        b7.setBahasa("Indonesia");
        b7.setEdisi("Pertama");
        b7.setHalaman(240);

        b7.setSinopsis("Buku ini memuat 294 adab yang diambil dari kisah-kisah dalam kehidupan Rasulullah SAW, sehingga dapat membantu pembaca untuk lebih memahami ajaran Islam secara holistik.");
        b7.displayMessage();

        System.out.println("=====================================");
        System.out.println();
        b8.setJudul("Ya Allah, Aku Jatuh Cinta");
        b8.setKategori("Agama");
        b8.setPenulis("Qowi Alta Az Zahra");
        b8.setPenerbit("PT. Elex Media Komputindo 2014");
        b8.setBahasa("Indonesia");
        b8.setEdisi("Pertama");
        b8.setHalaman(116);
        b8.setSinopsis("Novel ini mengisahkan tentang kisah cinta seorang gadis bernama Zalfa, yang jatuh cinta pada seorang pemuda bernama Dhani.");
        b8.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b9.setJudul("Akhir Bahagia");
        b9.setKategori("Psikologi");
        b9.setPenulis("Sandy Oogway");
        b9.setPenerbit("PT. Karpindo 2018");
        b9.setBahasa("Indonesia");
        b9.setEdisi("Pertama");
        b9.setHalaman(121);
        b9.setSinopsis("Buku ini mengajarkan kita konsep berpikir cinta secara logika. Sebab cinta bukanlah sekedar perasaan dan sayang2an saja.");
        b9.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        Perpus b10 = new Perpus();
        b10.setJudul("Modul Pembelajaran dan Praktikum Tes Psikologi");
        b10.setKategori("Psikologi");
        b10.setPenulis("Zainul Anwar");
        b10.setPenerbit("Psychology Forum 2021");
        b10.setBahasa("Indonesia");
        b10.setEdisi("-");
        b10.setHalaman(60);
        b10.setSinopsis("Buku ini dibagi menjadi beberapa bagian, yaitu teori dasar tes psikologi, jenis-jenis tes psikologi, teknik pengujian, teknik interpretasi, dan teknik pelaporan hasil tes.");
        b10.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b11.setJudul("Nasionalisme Indonesia Kini dan di Masa Depan");
        b11.setKategori("Politik");
        b11.setPenulis("Benedict Anderson");
        b11.setPenerbit("Anjing Galak Penerbitan 2010");
        b11.setBahasa("Indonesia");
        b11.setEdisi("-");
        b11.setHalaman(42);
        b11.setSinopsis("Buku ini ditulis untuk memberikan pemahaman lebih dalam tentang arti penting nasionalisme dalam membentuk identitas bangsa dan mendorong kemajuan bangsa Indonesia.");
        b11.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        Perpus b12 = new Perpus();
        b12.setJudul("Nyanyi sunyi seorang bisu: Catatan-catatan dari P. Buru");
        b12.setKategori("Politik");
        b12.setPenulis("Pramoedya Ananta Toer");
        b12.setPenerbit("Lentera 1995");
        b12.setBahasa("Indonesia");
        b12.setEdisi("Pertama");
        b12.setHalaman(316);
        b12.setSinopsis("Buku ini berisi catatan-catatan yang ditulis oleh seorang tahanan politik selama ia dipenjara di Pulau Buru pada era Orde Baru di Indonesia.");
        b12.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b13.setJudul("Laut Bercerita");
        b13.setKategori("Fiksi");
        b13.setPenulis("Leila S. Chudori");
        b13.setPenerbit("Gramedia Pustaka Utama 2017");
        b13.setBahasa("Indonesia");
        b13.setEdisi("-");
        b13.setHalaman(390);
        b13.setSinopsis("Novel ini mengisahkan tentang sebuah keluarga yang terkena dampak dari peristiwa Gerakan 30 September (G30S) dan kemudian mengungsi ke Prancis.");
        b13.displayMessage();

        System.out.println("=====================================");
        System.out.println();

        b14.setJudul("Seperti Dendam, Rindu Harus Dibayar Tuntas");
        b14.setKategori("Fiksi");
        b14.setPenulis("Eka Kurniawan");
        b14.setPenerbit("Gramedia Pustaka Utama 2019");
        b14.setBahasa("Indonesia");
        b14.setEdisi("-");
        b14.setHalaman(257);
        b14.setSinopsis("Novel ini bercerita tentang dua tokoh utama, yakni seorang wanita bernama Kancil dan seorang pria bernama Dewi Ayu.");
        b14.displayMessage();

        System.out.println("=====================================");
        System.out.println();
    }

}