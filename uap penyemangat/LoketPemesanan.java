public abstract class LoketPemesanan {
    private String jadwal;
    static final double harga = 30000;
    private int studio;

    public LoketPemesanan(){} //overloading
    public LoketPemesanan(String jadwal, int studio){
        setJadwal(jadwal);
        setStudio(studio);
    }
    public void setStudio(int studio) {
        this.studio = studio;
    }
    public int getStudio() {
        return studio;
    }
    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
    public abstract double hitungHarga();
    public String getJadwal() {
        return jadwal;
    }

} 
