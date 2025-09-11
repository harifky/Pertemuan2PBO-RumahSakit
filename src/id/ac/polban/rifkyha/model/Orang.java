package id.ac.polban.rifkyha.model;

public class Orang {
    private String nama;
    private int umur;

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }

    public void setNama(String nama) { this.nama = nama; }
    public void setUmur(int umur) { if (umur > 0) this.umur = umur; }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}