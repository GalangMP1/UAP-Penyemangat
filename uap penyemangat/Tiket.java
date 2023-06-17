public class Tiket{
    private String namaFilm;
    public Tiket(String namaFilm){
        setNamaFilm(namaFilm);
    }
    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }
    public String getNamaFilm() {
        return namaFilm;
    }
    
    // public static String toString(){
    //     return "Film yang sedang tayang: " + 
    //     "1. Pengabdi Mixue" +
    //     "2. Ada Apa dengan Gacoan" +
    //     "3. Habibie Ainun";
    // }
    
}
