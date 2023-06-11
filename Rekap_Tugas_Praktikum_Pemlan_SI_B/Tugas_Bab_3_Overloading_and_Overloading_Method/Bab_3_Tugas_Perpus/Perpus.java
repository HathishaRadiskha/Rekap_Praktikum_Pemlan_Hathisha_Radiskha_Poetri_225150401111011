package modulpraktikum.tugasperpus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Perpus {
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbit;
    private String edisi;
    private String sinopsis;
    private int halaman;
    private int jumlahkata;
    private int hargabuku;
    private int royalti;
    private int presentaseroyalti;
    private int penjualan;
    private double plagiarisme;
    private String[] jumlahpenulis;

    public Perpus() {

    }

    public Perpus(String kategori, String penulis, String judul, String bahasa, String penerbit, String edisi, String halaman, String sinopsis) {

    }

    public String[] getJumlahPenulis() {
        return jumlahpenulis;
    }

    public void setJumlahPenulis(String[] jumlahPenulis) {
        this.jumlahpenulis = jumlahPenulis;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
        hitungKata();
    }

    public void setHargaBUku(int hargabuku) {
        this.hargabuku = hargabuku;
    }

    public void setRoyalti(int royalti) {
        this.royalti = royalti;
    }

    public void setPresentaseRoyalti(int presentaseroyalti) {
        this.presentaseroyalti = presentaseroyalti;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void hitungKata() {
        String jumlah = sinopsis;
        int sum = 0;

        for(int j = 0; j < jumlah.length(); j++) {
            if(jumlah.charAt(j) == ' ') {
                sum++;
            }
        }

        if(sum > 0) {
            sum += 1;
        }
        jumlahkata = sum;
    }

    public double cekPlagiarisme(Perpus p1) {
        int same = 0;
        if(this.kategori.equals(p1.kategori)) {
            same++;
        }

        if(this.penulis.equals(p1.penulis)) {
            same++;
        }

        if(this.judul.equals(p1.judul)) {
            same++;
        }

        if(this.bahasa.equals(p1.bahasa)) {
            same++;
        }

        if(this.penerbit.equals(p1.penerbit)) {
            same++;
        }

        plagiarisme = same * 20;
        displayPlagiarisme(p1);
        return plagiarisme;
    }

    public int hitungRoyalti(int biaya){
        this.hargabuku = biaya;
        royalti = (penjualan * hargabuku * 10 / 100);
        return royalti;
    }

    public int hitungRoyalti(int hargabuku, int presentaseroyalti){
        this.hargabuku = hargabuku;
        this.presentaseroyalti = presentaseroyalti;
        royalti = (penjualan * this.hargabuku * this.presentaseroyalti) / 100;
        return royalti;
    }
       
    public void bacaFile(String pathFile) {
        try {
            File file = new File(pathFile);
            Scanner input = new Scanner(file);
            String isi = input.nextLine();
            String[]isiFile = isi.split("; ");
            this.judul = isiFile[0];
            this.penulis = isiFile[1];
            input.close();
        } 

        catch (FileNotFoundException exception) {
            System.out.println("File not found: " + exception.getMessage());
        }
    }

    public void simpanFile(String namaFile) {
        try {
            BufferedWriter tulis = new BufferedWriter(new FileWriter(namaFile));
            tulis.write(judul + "; " + penulis);
            tulis.close();
        } 

        catch (IOException exception) {
            System.out.println("Error : " + exception.getMessage());
        }
    }

    private void displayPlagiarisme(Perpus p1) {
        System.out.println("Tingkat kesamaan kata : " + plagiarisme);
    }

    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);

        if (this.jumlahpenulis == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(jumlahpenulis).replace("[", "").replace("]",""));
        }

        System.out.println("Penerbitan : " + penerbit);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        if (jumlahkata >= 10) {
            System.out.println("Sinopsis buku :" + sinopsis);
        }
        System.out.println("Jumlah penjualan buku bulan ini : " + penjualan);
        System.out.println("Penulis menerima Royalti : " + royalti);
    }
}