package id.ac.polban.rifkyha.model;

public class PasienVIP extends Pasien {
    private String nomorKamarVIP;

    public PasienVIP(String nama, int umur, String penyakit, String nomorKamarVIP) {
        super(nama, umur, penyakit);  // Call super constructor
        this.nomorKamarVIP = nomorKamarVIP;
    }

    public String getNomorKamarVIP() { return nomorKamarVIP; }

    public void setNomorKamarVIP(String nomorKamarVIP) { this.nomorKamarVIP = nomorKamarVIP; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();  // Call super method
        System.out.println("Nomor Kamar VIP: " + nomorKamarVIP);
    }
}