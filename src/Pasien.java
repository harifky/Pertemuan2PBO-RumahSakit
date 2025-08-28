class Pasien {
    // Atribut private (Enkapsulasi)
    private String nama;
    private int umur;
    private String penyakit;

    // Constructor
    public Pasien(String nama, int umur, String penyakit) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getPenyakit() {
        return penyakit;
    }

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur > 0) {  // validasi agar umur masuk akal
            this.umur = umur;
        }
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    // Method untuk tampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama Pasien    : " + nama);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Penyakit       : " + penyakit);
    }
}