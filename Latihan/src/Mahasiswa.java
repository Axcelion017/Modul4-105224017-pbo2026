public class Mahasiswa {
    String nama, jurusan, jurusanStudi;
    int umur;

    Mahasiswa(String nama, int umur, String jurusan){
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }
    
    public void belajar(){
        System.out.println(nama + " sedang belajar.");
    }

    public void gantiProdi(String jurusanStudi){
        this.jurusan = jurusanStudi;
    }

    public void display(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan);
    }

}
