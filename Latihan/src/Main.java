public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhsBaru = new Mahasiswa("Mike", 19, "CS");

        mhsBaru.display();
        mhsBaru.belajar();

        mhsBaru.gantiProdi("Informatika");
        mhsBaru.display();
    }
}
