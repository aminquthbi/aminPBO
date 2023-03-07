package punya.amin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PunyaAmin {
        public static void main(String[] args) throws IOException {
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("1. Nambah ");
            System.out.println("2. Tampil ");
            System.out.println("3. Update ");
            System.out.println("4. Hapus  ");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1 -> {
                    System.out.println("Tambah data");
                    System.out.print("Masukkan nama : ");
                    String nama = input.next();
                    System.out.print("Masukkan nim  : ");
                    String nim = input.next();
                    Mahasiswa mhs_baru = new Mahasiswa(nama, nim);
                    mhs.add(mhs_baru);
                }
                case 2 -> {
                    System.out.println("Lihat data");
                    for(int i =0; i < mhs.size(); i++){
                        mhs.get(i).tampak();
                    }
                    System.out.println("");
                }
                case 3 -> {
                    System.out.println("Update Data");
                    System.out.print("Masukkan nama akun : ");
                    String cari_kn = input.next();
                    for(Mahasiswa mhss : mhs){
                        if(mhss.nama.equals(cari_kn)){
                            System.out.print("Masukkan user name baru : ");
                            mhss.setNama(input.next());
                            System.out.print("masukkan password baru : ");
                            mhss.setNim(input.next());
                            break;
                        }
                        else{
                            System.out.println("data salah");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("hapus data");
                    System.out.print("Masukkan nama mahasiswa : ");
                    String nama = input.next();
                    for(int i = 0; i < mhs.size();  i++){
                        if(mhs.get(i).nama.equals(nama)){
                            mhs.remove(i);
                        }
                    }
                }
                case 5 -> System.exit(0);
                default -> {
                    System.out.println("=================");
                    System.out.println("pilihan tidak ada");
                    System.out.println("=================");
                }
            }
        }
    }
    
}
