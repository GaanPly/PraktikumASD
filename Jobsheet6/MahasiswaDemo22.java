import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        // Input data mahasiswa
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------------------------");
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            
            list.tambah(new Mahasiswa22(nim, nama, kelas, ipk));
        }
        
        System.out.println("------------------------------------");
        // Menampilkan seluruh isi data mahasiswa
        list.tampil();

        // ----------------------------------------------------
        // 1. Melakukan pencarian data dengan Sequential Search
        // ----------------------------------------------------
        System.out.println("------------------------------------");
        System.out.println("Pencarian data (Sequential Search)");
        System.out.println("------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cariSeq = sc.nextDouble();
        
        System.out.println("------------------------------------");
        System.out.println("menggunakan sequential searching");
        double posisiSeq = list.sequentialSearching(cariSeq);
        int pssSeq = (int) posisiSeq;
        list.tampilPosisi(cariSeq, pssSeq);
        list.tampilDataSearch(cariSeq, pssSeq);

        // ----------------------------------------------------
        // 2. Melakukan pencarian data dengan Binary Search
        // ----------------------------------------------------
        System.out.println("------------------------------------");
        System.out.println("Pencarian data (Binary Search)");
        System.out.println("------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cariBin = sc.nextDouble();
        
        System.out.println("------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------------");
        // Pemanggilan method dengan batas kiri = 0, batas kanan = jumMhs - 1
        double posisiBin = list.findBinarySearch(cariBin, 0, jumMhs - 1);
        int pssBin = (int) posisiBin;
        list.tampilPosisi(cariBin, pssBin);
        list.tampilDataSearch(cariBin, pssBin);
        
        sc.close();
    }
}