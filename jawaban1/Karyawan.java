package jawaban1;

public class Karyawan {
    private String id;
    private String nama;
    private String posisi;
    private String divisi;
    private double gaji;

    public Karyawan(String id, String nama, String posisi, String divisi, double gaji) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        this.divisi = divisi;
        this.gaji = gaji;
    }

    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String getDivisi() {
        return divisi;
    }
    public String getPosisi() {
        return posisi;
    }
    public double getGaji() {
        return gaji;
    }

    public void setPosisi(String posisi) { this.posisi = posisi; }
    public void setDivisi(String divisi) { this.divisi = divisi; }
    public void setGaji(double gaji) { this.gaji = gaji; }

    public void display() {
        System.out.println("ID: " + this.id + ", Nama: "+ this.nama + ", Posisi : " + this.posisi + ", Divisi : " + this.divisi + ", Gaji : " + this.gaji);
    }
}


