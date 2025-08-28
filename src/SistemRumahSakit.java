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
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            int pilihan = sc.nextInt();

            // Setelah sc.nextInt(), karakter "newline" (saat user menekan Enter) masih ada di buffer.
            // sc.nextLine() ini digunakan untuk "membuang" sisa karakter newline tersebut.
            // Jika tidak ada baris ini, pemanggilan sc.nextLine() berikutnya akan langsung membaca newline kosong ini.
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine(); // Membaca input teks untuk nama.
                    System.out.print("Umur: ");
                    int umur = sc.nextInt(); // Membaca input angka untuk umur.
                    sc.nextLine(); // Membuang sisa newline setelah nextInt().
                    System.out.print("Penyakit: ");
                    String penyakit = sc.nextLine(); // Membaca input teks untuk penyakit.

                    rs.tambahPasien(new Pasien(nama, umur, penyakit));
                    break;

                case 2:
                    rs.lihatPasien();
                    break;

                case 3:
                    rs.lihatPasien();

                    // Jika jumlah pasien saat ini adalah 0, jangan lanjutkan proses update.
                    if (rs.getJumlahPasien() == 0) {
                        break;
                    }

                    System.out.print("Pilih nomor pasien: ");
                    // Membaca nomor urut pasien, lalu dikurangi 1 karena array/list dimulai dari indeks 0.
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();

                    // Meminta input data baru. Pengguna bisa mengosongkan input jika tidak ingin mengubah data tertentu.
                    System.out.print("Nama baru: ");
                    String nBaru = sc.nextLine();

                    System.out.print("Umur baru: ");
                    String umurStr = sc.nextLine(); // Umur dibaca sebagai String terlebih dahulu.

                    // Logika untuk umur:
                    // Jika input umurStr kosong (pengguna hanya tekan Enter), uBaru diisi -1 (sebagai penanda tidak diubah).
                    // Jika tidak kosong, konversi string tersebut menjadi integer.
                    int uBaru = umurStr.isEmpty() ? -1 : Integer.parseInt(umurStr);

                    System.out.print("Penyakit baru: ");
                    String pBaru = sc.nextLine();

                    // Memanggil metode updatePasien dengan data baru yang sudah didapat.
                    rs.updatePasien(idx, nBaru, uBaru, pBaru);
                    break;

                case 0:
                    // Mengubah nilai 'jalan' menjadi false. Ini akan menghentikan perulangan while.
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