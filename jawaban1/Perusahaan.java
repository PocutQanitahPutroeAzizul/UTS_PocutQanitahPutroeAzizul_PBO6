package jawaban1;

import java.util.ArrayList;

public class Perusahaan {
    private ArrayList<Karyawan> daftar =   new ArrayList<>();

    //tambah karyawan
    public void tambah(Karyawan a){
        for ( Karyawan b : daftar){
            if (b.getId().equals(a.getId())){
                System.out.println("Id sudah digunakan");
                return;
            }
        }
        daftar.add(a);
        System.out.println("Data sudah berhasil ditambahkan");
    }

    //hapus karyawan
    public void hapus(String id){
        for (Karyawan a : daftar){
            if (a.getId().equals(id)){
                daftar.remove(a);
                System.out.println("Data sudah berhasil dihapuskan");
                return;
            }
        }
        System.out.println("Id tidak ditemukan");
    }

    //ubah posisi
    public void ubahPosisi (String id, String posisiBaru){
        for (Karyawan a : daftar){
            if (a.getId().equals(id)){
                a.setPosisi(posisiBaru);
                System.out.println("Posisi sudah berhasil diubah");
                return;
            }
        }
        System.out.println("Id tidak ditemukan");
    }

    //ubah divisi
    public void ubahDivisi (String id, String divisiBaru){
        for (Karyawan a : daftar){
            if (a.getId().equals(id)){
                a.setDivisi(divisiBaru);
                System.out.println("Divisi sudah berhasil diubah");
                return;
            }
        }
        System.out.println("Id tidak ditemukan");
    }

    //ubah gaji
    public void ubahGaji (String id, double gajiBaru){
        if (gajiBaru > 0){
            System.out.println("Gaji tidak boleh negatif");
            return;
        }

        for (Karyawan a : daftar){
            if (a.getId().equals(id)){
                a.setGaji(gajiBaru);
                System.out.println("Gaji sudah berhasil diubah");
                return;
            }
        }
        System.out.println("Id tidak ditemukan");
    }

    public void tampilkan(){
        if  (daftar.isEmpty()){
            System.out.println("Belum ada data karyawan.");
            return;
        }

        for (Karyawan a : daftar){
            a.display();
        }
    }
}
