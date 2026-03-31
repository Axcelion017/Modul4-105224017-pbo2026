import java.util.Scanner;
public class DuitKuMain {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nama, noHp;
        int dana, tagihan;

        System.out.print("Masukkan Nama Lengkap: ");
        nama = input.nextLine();
        System.out.print("Masukkan No HP: ");
        noHp = input.nextLine();

        DuitKuClass p1 = new DuitKuClass(nama, noHp);

        p1.display();
        System.out.print("Masukkan Jumlah Dana: ");
        dana = input.nextInt();
        p1.isiDana(dana);
        System.out.print("Masukkan Jumlah Tagihan: ");
        tagihan = input.nextInt();
        p1.pelunasanTagihan(tagihan);
    }
}
