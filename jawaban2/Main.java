package jawaban2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Kendaraan> daftar = new ArrayList<>();

        String lanjut ="";
        System.out.println("======= Welcome to Parkingking ========");

        do {

            System.out.print("Enter vehicle type (Motor/Mobil/Truk): ");
            String jenis = input.nextLine();

            Kendaraan k = new Kendaraan(jenis);

            System.out.print("Enter Duration (Manual/Time): ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("Manual")) {
                System.out.print("Enter Duration (in hour): ");
                int durasi = input.nextInt();
                input.nextLine();

                if (durasi <= 0) {
                    System.out.println("Invalid");
                    continue;
                }

                k.setDurasi(durasi);

            } else if (pilihan.equalsIgnoreCase("Time")) {
                System.out.print("Enter entry time: ");
                int masuk = input.nextInt();

                System.out.print("Enter exit time: ");
                int keluar = input.nextInt();
                input.nextLine();

                if (keluar < masuk) {
                    System.out.println("Invalid");
                    continue;
                }

                k.setDurasi(masuk, keluar);
            }

            daftar.add(k);

            System.out.println("\n--- Parking Summary ---");
            k.displayInfo();

            System.out.print("\nAdd another vehicle? (y/n): ");
            lanjut = input.nextLine();
            System.out.println();

        } while (lanjut.equals("y"));

        int total = 0;

        System.out.println("\n======= FINAL REPORT =======");

        for (Kendaraan k : daftar) {
            k.displayInfo();
            total += k.getBiaya();
        }

        System.out.println("Total Vehicle Final: " + daftar.size());
        System.out.println("Total Parking Fees Final: Rp " + total);
        System.out.println("THANK YOU <3");
    }
}
