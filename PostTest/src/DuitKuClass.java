class DuitKuClass {
    String namaLengkap, nomorPonsel;
    int saldo;


    DuitKuClass(String namaLengkap, String nomorPonsel){
        this.namaLengkap = namaLengkap;
        this.nomorPonsel = nomorPonsel;
        this.saldo = 0;
    }

    public void isiDana(int jumlah){
        if (jumlah >= 10000){
            this.saldo += jumlah;
            System.out.println("Pengisian dana berhasil. Saldo saat ini: Rp" + saldo);
        }else{
            System.out.println("Pengisian dana dibatalkan. Jumlah isi dana minimal adalah Rp 10.000");
        }
    }

    public void pelunasanTagihan(int tagihan){
        if (tagihan <= saldo){
            this.saldo -= tagihan;
            System.out.println("Pelunasan tagihan sebesar Rp " + tagihan + " berhasil. Sisa saldo: Rp " + saldo);
        }else{
            System.out.println("Pelunasan tagihan gagal. Saldo tidak mencukupi. Saldo saat ini: Rp " + saldo);
        }
    }

    public void display(){
        System.out.println("Nama Lengkap: " + this.namaLengkap);
        System.out.println("Nomor Ponsel: " + this.nomorPonsel);
        System.out.println("Saldo: " + this.saldo);
    }



}
