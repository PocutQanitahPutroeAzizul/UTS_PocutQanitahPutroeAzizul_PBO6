package jawaban1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perusahaan perusahaan = new Perusahaan();

        int pilih;

        do {
            System.out.println("\n SISTEM MANAJEMEN KARYAWAN");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Ubah Posisi");
            System.out.println("4. Ubah Divisi");
            System.out.println("5. Ubah Gaji");
            System.out.println("6. Tampilkan Semua Karyawan");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan: ");

            pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                //untuk menambahkan data karyawan baru
                System.out.print("ID: ");
                String id = input.nextLine();

                System.out.print("Nama: ");
                String nama = input.nextLine();

                System.out.print("Posisi: ");
                String posisi = input.nextLine();

                System.out.print("Divisi: ");
                String divisi = input.nextLine();

                System.out.print("Gaji: ");
                double gaji = input.nextDouble();

                if (gaji < 0) {
                    System.out.println("Gaji tidak boleh negatif");
                    break;
                } else {
                    perusahaan.tambah(new Karyawan(id, nama, posisi, divisi, gaji));
                }

            } else if (pilih == 2) {// untuk menghapus data karyawan
                System.out.print("Masukkan ID: ");
                perusahaan.hapus(input.nextLine());

            } else if (pilih == 3) {// untuk mengubah posisi di data karyawan
                System.out.print("Masukkan ID: ");
                String idPosisi = input.nextLine();

                System.out.print("Posisi terbaru: ");
                perusahaan.ubahPosisi(idPosisi, input.nextLine());

            } else if (pilih == 4) { // untuk mengubah divisi di data karyawan
                System.out.print("Masukkan ID: ");
                String idDivisi = input.nextLine();

                System.out.print("Divisi terbaru: ");
                perusahaan.ubahDivisi(idDivisi, input.nextLine());
                break;

            } else if  (pilih == 5) { // untuk mengubah gaji di data karyawan
                System.out.print("Masukkan ID: ");
                String idGaji = input.nextLine();

                System.out.print("Gaji terbaru: ");
                perusahaan.ubahGaji(idGaji, input.nextDouble());
                break;

            } else if (pilih == 6){
                perusahaan.tampilkan();
            }

        } while (pilih != 7);
    }
}
