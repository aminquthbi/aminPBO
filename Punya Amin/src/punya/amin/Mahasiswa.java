package punya.amin;

public class Mahasiswa {
    String nama;
    String nim;
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    void setNim(String nim){
        this.nim = nim;
    }
    void tampak(){
        System.out.println("=================================");
        System.out.println("1. Nama = " + this.nama);
        System.out.println("2. Password  = " + this.nim);
        System.out.println("=================================");
    }
}
