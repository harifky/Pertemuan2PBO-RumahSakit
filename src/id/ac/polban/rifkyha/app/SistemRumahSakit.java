package id.ac.polban.rifkyha.app;

import id.ac.polban.rifkyha.model.Pasien;
import id.ac.polban.rifkyha.service.RumahSakit;

import java.util.Scanner;

public class SistemRumahSakit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RumahSakit rs = new RumahSakit(100);
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== MENU RUMAH SAKIT ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Daftar Pasien");
            System.out.println("3. Update Data Pasien");
            System.out.println("4. Lihat Total Pasien (Static)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Penyakit: ");
                    String penyakit = sc.nextLine();
                    rs.tambahPasien(new Pasien(nama, umur, penyakit));
                    break;

                case 2:
                    rs.lihatPasien();
                    break;

                case 3:
                    rs.lihatPasien();
                    if (rs.getJumlahPasien() == 0) break;

                    System.out.print("Pilih nomor pasien: ");
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();

                    System.out.print("Nama baru: ");
                    String nBaru = sc.nextLine();
                    System.out.print("Umur baru: ");
                    String umurStr = sc.nextLine();
                    int uBaru = umurStr.isEmpty() ? -1 : Integer.parseInt(umurStr);
                    System.out.print("Penyakit baru: ");
                    String pBaru = sc.nextLine();
                    rs.updatePasien(idx, nBaru, uBaru, pBaru);
                    break;

                case 4:
                    System.out.println("Total pasien (semua RS): " + RumahSakit.getTotalPasien());
                    break;

                case 0:
                    jalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        sc.close();
    }
}
