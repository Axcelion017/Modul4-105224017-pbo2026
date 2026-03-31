class ClassMahasiswa{
    String nama, jurusan;
    int umur;

    ClassMahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    void display(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan);
    }
}
