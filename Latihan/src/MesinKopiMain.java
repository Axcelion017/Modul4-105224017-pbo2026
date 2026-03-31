public class MesinKopiMain {
    public static void main (String[] args)throws Exception {
        MesinKopi mesinLobby = new MesinKopi(); //Soal 1
        MesinKopi mesinDapur = new MesinKopi(); //Tes buat mesin baru

        mesinLobby.display(); //Tes buat mastiin constructor itu beneran isinya nol semua ketika mesinnya baru dibuat
        mesinDapur.display(); //Sama seperti yang diatas cuman beda mesin aja
        mesinLobby.isiUlangBahan(50, 200,300); //Soal 2
        mesinLobby.display(); //Tes mastiin berhasil ditambah ke dalam mesinnya
        System.out.println("Cek Ketersediaan Bahan untuk Cappucino: " + mesinLobby.cekKetersediaanCappuccino()); //Soal 3

    }
}
