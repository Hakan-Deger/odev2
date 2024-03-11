public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("null","null",1973,0.0,001);
        Ogrenci ogrenci2 = new Ogrenci("Gökhan","Bilgisayar Müh",1985,0.0,001);
        Ogrenci ogrenci3 = new Ogrenci("Ayşe","Makine Müh",1985,0.0,001);
        Ogrenci ogrenci4 = new Ogrenci("Elif","Elektrik-Elektronik Müh",2020,1.98,001);
        System.out.println("Öğrencilerin Bilgileri");
        System.out.println("OGR-1 "+ogrenci1.getAd()+" "+ogrenci1.getBolum()+" "+" "+ogrenci1.hesaplaOgrNo()+" "+ogrenci1.getGano());
        System.out.println("OGR-2 "+ogrenci2.getAd()+" "+ogrenci2.getBolum()+" "+ogrenci2.hesaplaOgrNo()+" "+ogrenci2.getGano());
        System.out.println("OGR-3 "+ogrenci3.getAd()+" "+ogrenci3.getBolum()+" "+ogrenci3.hesaplaOgrNo()+" "+ogrenci3.getGano());
        System.out.println("OGR-4 "+ogrenci4.getAd()+" "+ogrenci4.getBolum()+" "+ogrenci4.hesaplaOgrNo()+" "+ogrenci4.getGano());
        System.out.println("3. öğrencinin ödeyeceği harc: "+ogrenci3.harcHesapla(2,2));
        System.out.println("4. öğrencinin ödeyeceği harc: "+ogrenci4.harcHesapla(3,5));

    }
}

class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private int girisSirasi;
    private int bolumKodu;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String bolum, int girisYili, double gano, int girisSirasi) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = hesaplaOgrNo();
        this.gano = kontrolGano(gano);
        this.bolumKodu = 104;
    }

    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getGirisSirasi() {
        return girisSirasi;
    }

    public void setGirisSirasi(int girisSirasi) {
        this.girisSirasi = girisSirasi;
    }

    public String hesaplaOgrNo() {

        return Integer.toString(girisYili) + Integer.toString(bolumKodu) + "001";
    }

    public double kontrolGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır.");
        }
        return gano;
    }

    public int harcHesapla(int dersSayisi) {
        int harc = dersSayisi * 100;
        return harc;
    }

    public int harcHesapla(int dersSayisi, int uzatilanSene) {
        int harc = (dersSayisi * 120) + (uzatilanSene * 120);
        return harc;
    }


}