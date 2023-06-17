import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jadwal jd = new Jadwal();
        jd.sesiJam(); //instance method
        
        System.out.println("Selamat datang BioskopKece");
        System.out.println("");
        System.out.print("Silahkan masukkan nama anda: "); String nama = in.nextLine();
        System.out.println("Berikut film yang sedang tayang: ");
        System.out.println("1. Pengabdi Mixue");
        System.out.println("2. Ada Apa dengan Gacoan");
        System.out.println("3. Habibie Ainun");
        System.out.print("Film apa yang ingin anda pesan: "); int pilihanTiket = in.nextInt();
        System.out.println("Berikut jadwal yang tersedia");
        jd.getJadwal();
        System.out.print("jadwal mana yang kamu ambil? "); String pilihanJadwal = in.nextLine();
        pilihanJadwal = in.nextLine();
        System.out.print("pesan berapa tiket? "); int jumlahPesanan = in.nextInt();
        int studio = (int) (Math.random() * 4) + 1;

        ArrayList<Pembeli> people = new ArrayList<>();
        people.add(new Pembeli(nama, pilihanTiket, pilihanJadwal, jumlahPesanan, studio));
        System.out.println();
        System.out.println("-".repeat(30));
        for (Pembeli pembeli : people) {
            System.out.print("Nama: ");
            System.out.println(pembeli.getNamaPembeli());
            System.out.print("Judul film: ");
            pembeli.pilihanTiket(pilihanTiket);
            System.out.print("Jam: ");
            System.out.println(pembeli.getJadwal());
            System.out.print("Jumlah tiket: ");
            System.out.println(pembeli.getJumlahPesanan());
            System.out.print("Studio: ");
            pembeli.namaStudio();
            System.out.print("Total Harga: ");
            System.out.println(pembeli.hitungHarga());
        }

        
    }
}
    
    