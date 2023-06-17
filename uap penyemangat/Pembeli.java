public class Pembeli extends LoketPemesanan{
    private String namaPembeli;
    private int jumlahPesanan;
    private int milihTiket;
    
    public Pembeli(String namaPembeli, int milihTiket, String jadwal, int jumlahPesanan, int studio) {
        super(jadwal, studio);
        setMilihTiket(milihTiket);
        setNamaPembeli(namaPembeli);
        setJumlahPesanan(jumlahPesanan);

    }
    public void setJumlahPesanan(int jumlahPesanan) {
        this.jumlahPesanan = jumlahPesanan;
    }
    public int getJumlahPesanan() {
        return jumlahPesanan;
    }
    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }
    public String getNamaPembeli() {
        return namaPembeli;
    }
    public void setMilihTiket(int milihTiket) {
        this.milihTiket = milihTiket;
    }
    public int getMilihTiket() {
        return milihTiket;
    }

    @Override
    public double hitungHarga() {
        // TODO Auto-generated method stub
        return LoketPemesanan.harga * getJumlahPesanan();
    }
    
    Tiket mytiket;

    public void pilihanTiket(int pilihanTiket){
        pilihanTiket = getMilihTiket();
        switch (pilihanTiket) {
            case 1:
                mytiket = new Tiket1();
                System.out.println(mytiket.getNamaFilm()); //polimorfism
                break;
            case 2:
                mytiket = new Tiket2();
                System.out.println(mytiket.getNamaFilm());
                break;
            case 3:
                mytiket = new Tiket3();
                System.out.println(mytiket.getNamaFilm());
            default:
                break;
        }
    }
    public void namaStudio(){
        System.out.println("Studio"+getStudio());
    }
    
}
