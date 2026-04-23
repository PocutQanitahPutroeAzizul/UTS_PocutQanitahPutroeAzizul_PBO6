package jawaban2;

public class Kendaraan {
    private String jenis;
    private int durasi;

    public Kendaraan (String jenis) {
        this.jenis = jenis;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setDurasi(int masuk, int keluar) {
        this.durasi = keluar - masuk;
    }

    public int biayaParkir() {
        int tarif = 0;

        if (jenis.equals("Motor")) {
            tarif = 2000;
        } else if (jenis.equals("Mobil")) {
            tarif = 5000;
        } else if (jenis.equals("Truk")) {
            tarif = 8000;
        } else {
            System.out.println("Try Again");
        }

        int total = tarif * durasi;
        if (durasi > 5) {
            total *= 0.9;
        }

        return total;
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Vehicle type: " + jenis);
        System.out.println("Duration: " + durasi + " hour(s)");
        System.out.println("Total Fee: " + biayaParkir());
        System.out.println();
    }

    public int getBiaya() {
        return biayaParkir();
    }
}
