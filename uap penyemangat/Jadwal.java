public class Jadwal implements Waktu{
    private String sesi1;
    private String sesi2;
    private String sesi3;
    private String sesi4;

    @Override
    public void sesiJam() {
        // TODO Auto-generated method stub
        this.sesi1 = "12.00";
        this.sesi2 = "15.00";
        this.sesi3 = "18.00";
        this.sesi4 = "21.00";

    }
    public String getSesi1() {
        return sesi1;
    }
    public String getSesi2() {
        return sesi2;
    }
    public String getSesi3() {
        return sesi3;
    }
    public String getSesi4() {
        return sesi4;
    }
    
    public void getJadwal(){
        System.out.println(getSesi1());
        System.out.println(getSesi2());
        System.out.println(getSesi3());
        System.out.println(getSesi4());
    }

}
