package id.ac.polban.rifkyha.service;

import id.ac.polban.rifkyha.model.Pasien;

public class RumahSakit {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    // Static field → menghitung total pasien global
    private static int totalPasien = 0;

    public RumahSakit(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    public void tambahPasien(Pasien p) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = p;
            jumlahPasien++;
            totalPasien++;
            System.out.println("Pasien berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

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

    public int getJumlahPasien() { return jumlahPasien; }

    // Static method untuk mendapatkan total pasien global
    public static int getTotalPasien() {
        return totalPasien;
    }
}
