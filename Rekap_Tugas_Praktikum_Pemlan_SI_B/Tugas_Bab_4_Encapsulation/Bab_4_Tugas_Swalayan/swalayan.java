package modulpraktikum.tugasmodul4.tugasswalayan;

class swalayan {
    private double validasi = 0;
    private double saldo;
    private double cashback;
    private double pembelian;
    private String nomor;
    private String ranknomor;
    private String nomorID;
    private String nama;
    private String rank;
    private String pin;

    public swalayan() {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public void setNomorID() {
        nomorID = ranknomor + nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getRank() {
        return rank;
    }

    public String getPin() {
        return pin;
    }

    public String getNomorID() {
        return nomorID;
    }

    public void setSaldo(double topup) {
        saldo = saldo + topup;
    }

    public void setNomorRank() {
        if (rank.equalsIgnoreCase("silver")) {
            ranknomor = "38";
        } else if (rank.equalsIgnoreCase("gold")) {
            ranknomor = "56";
        } else if (rank.equalsIgnoreCase("platinum")) {
            ranknomor = "74";
        } 
    }

    public void setTopUp(double topup) {
        cekValidasi();
        saldo = saldo + topup;
        System.out.println("TOP UP BERHASIL!");
        System.out.println("SALDO ANDA: " + saldo);
    }
    
    public void setPembelian(double pembelian) {
        cekValidasi();
        this.pembelian = pembelian;
        if (saldo < 10000) {
            System.out.println("MOHON MAAF SALDO ANDA KURANG, TRANSAKSI GAGAL");
            System.out.print("SALDO ANDA: " + saldo);
        } else {
            double sisa = saldo - this.pembelian;
            saldo = sisa;
            setCashback(this.pembelian);
        }
    }

    public void setCashback(double pembelian) {
        switch (ranknomor) {
            case "38":
            cashback = pembelian * 0.05;
            System.out.println("Cashback Anda: " + cashback);
            System.out.println("Saldo Anda: " + saldo);   
            break;
            
            case "56":
            if (pembelian > 1000000) {
                cashback = pembelian * 0.07;
                System.out.println("Cashback Anda: " + cashback);
                System.out.println("Saldo Anda: " + saldo);   
            } else {
                cashback = pembelian * 0.02;
                System.out.println("Cashback Anda: " + cashback);
                System.out.println("Saldo Anda: " + saldo);   
            }
            break;

            case "74":
            if (pembelian > 1000000) {
                cashback = pembelian * 0.10;
                System.out.println("Cashback Anda: " + cashback);
                System.out.println("Saldo Anda: " + saldo);   
            } else {
                cashback = pembelian * 0.05;
                System.out.println("Cashback Anda: " + cashback);
                System.out.println("Saldo Anda: " + saldo);   
            }
            break;
        }
    }

    public void cekAutentifikasi(String x, String y) {
        if (x.equalsIgnoreCase(y)) {

        } else {
            validasi++;
        }
    }

    public void cekValidasi() {
        if (validasi >= 3) {
            System.out.println("DATA YANG ANDA MASUKKAN SALAH, AKUN ANDA TERBLOKIR");
            System.exit(0);
        }
    }

    public void informasiAkun() {
        System.out.println("Nama  : " + getNama());
        System.out.println("Rank  : " + getRank());
        System.out.println("Nomor : " + getNomorID());
    }
}
