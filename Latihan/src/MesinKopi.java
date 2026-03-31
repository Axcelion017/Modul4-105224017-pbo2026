class MesinKopi {
    int bijiKopi, air, susu; // Soal 1

    public void isiUlangBahan(int bijiKopiBaru, int airBaru, int susuBaru){
        this.bijiKopi += bijiKopiBaru;
        this.air += airBaru;
        this.susu += susuBaru;
        System.out.println("Bahan baku berhasil diisi ulang.");
    } //Soal 2

    public boolean cekKetersediaanCappuccino(){
        if(bijiKopi >= 15 && air >= 50 && susu >= 100){
            return true;
        } else {
            return false;
        }
    }//Soal 3

    MesinKopi(){
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }//Soal 4

    public void display(){
        System.out.println("Biji Kopi: " + bijiKopi + " gram");
        System.out.println("Air: " + air + " ml");
        System.out.println("Susu: " + susu + " ml");
    } //Buat cek isi setiap variabel doang bang
}
