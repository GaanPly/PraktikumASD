import java.util.Scanner;

public class AntrianMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList22 antrianUnit = new QueueLinkedList22();
        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println(" ANTRIAN UNIT KEMAHASISWAAN (22) ");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian Mahasiswa (Enqueue)");
            System.out.println("2. Panggil Antrian Terdepan (Dequeue)");
            System.out.println("3. Tampilkan Antrian Depan & Akhir");
            System.out.println("4. Cek Jumlah Mahasiswa Mengantre");
            System.out.println("5. Lihat Semua Daftar Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih menu (0-6): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer input
            System.out.println("---------------------------------");

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc.nextDouble();
                    
                    Mahasiswa22 mhsBaru = new Mahasiswa22(nim, nama, kelas, ipk);
                    antrianUnit.enqueue(mhsBaru);
                    break;

                case 2:
                    Mahasiswa22 dipanggil = antrianUnit.dequeue();
                    if (dipanggil != null) {
                        System.out.println("Memanggil Mahasiswa atas nama:");
                        dipanggil.tampilInformasi();
                    }
                    break;

                case 3:
                    antrianUnit.tampilTerdepanDanAkhir();
                    break;

                case 4:
                    System.out.println("Jumlah mahasiswa yang masih mengantre: " + antrianUnit.getJumlahAntrian() + " orang.");
                    break;

                case 5:
                    antrianUnit.printQueue();
                    break;

                case 6:
                    antrianUnit.clear();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}