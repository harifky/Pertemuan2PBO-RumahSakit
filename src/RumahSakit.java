public class RumahSakit {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    // Method untuk menyimpan daftar pasien
    public RumahSakit(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    // Method untuk menambahkan pasien
    public void tambahPasien(Pasien p) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = p;
            jumlahPasien++;
            System.out.println("Pasien berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    // Method untuk melihat daftar pasien
    public void lihatPasien() {
        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien.");
        } else {
            for (int i = 0; i < jumlahPasien; i++) {
                System.out.println("[" + (i+1) + "]");
                daftarPasien[i].tampilkanInfo();
                System.out.println("-----------------");
            }
        }
    }


    // Method untuk mengupdate data pasien
    public void updatePasien(int index, String nama, int umur, String penyakit) {
        if (index >= 0 && index < jumlahPasien) {
            Pasien p = daftarPasien[index];
            if (!nama.isEmpty()) p.setNama(nama);
            if (umur > 0) p.setUmur(umur);
            if (!penyakit.isEmpty()) p.setPenyakit(penyakit);
            System.out.println("Data pasien diperbarui!");
        } else {
            System.out.println("Nomor pasien tidak valid!");
        }
    }

    // Method untuk mengambil data jumlah pasien
    public int getJumlahPasien() { return jumlahPasien; }
}
