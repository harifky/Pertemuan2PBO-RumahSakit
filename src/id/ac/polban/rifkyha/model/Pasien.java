package id.ac.polban.rifkyha.model;

public class Pasien {
    private String nama;
    private int umur;
    private String penyakit;

    public Pasien(String nama, int umur, String penyakit) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getPenyakit() { return penyakit; }

    public void setNama(String nama) { this.nama = nama; }
    public void setUmur(int umur) { if (umur > 0) this.umur = umur; }
    public void setPenyakit(String penyakit) { this.penyakit = penyakit; }

    public void tampilkanInfo() {
        System.out.println("Nama Pasien    : " + nama);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Penyakit       : " + penyakit);
    }
}
