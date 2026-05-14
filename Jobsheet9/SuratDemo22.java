import java.util.Scanner;

public class SuratDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat22 stackSurat = new StackSurat22(10); // Kapasitas 10 surat izin
        int pilihan;

        do {
            System.out.println("\n=== MENU MANAJEMEN SURAT IZIN ==="); //
            System.out.println("1. Terima Surat Izin"); //
            System.out.println("2. Proses Surat Izin"); //
            System.out.println("3. Lihat Surat Izin Terakhir"); //
            System.out.println("4. Cari Surat"); //
            System.out.println("5. Keluar");
            System.out.print("Pilihan Menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1: //
                    System.out.print("Masukkan ID Surat       : ");
                    String id = input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Kelas          : ");
                    String kelas = input.nextLine();
                    System.out.print("Masukkan Jenis Izin (S/I): ");
                    char jenis = input.next().charAt(0);
                    System.out.print("Masukkan Durasi (Hari)  : ");
                    int durasi = input.nextInt();

                    Surat22 s = new Surat22(id, nama, kelas, jenis, durasi);
                    stackSurat.push(s);
                    break;

                case 2: //
                    Surat22 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa + " (" + diproses.idSurat + ")");
                        System.out.println("Status: Surat Berhasil Diverifikasi Prodi.");
                    }
                    break;

                case 3: //
                    Surat22 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("\n--- Surat Teratas / Terakhir Masuk ---");
                        System.out.println("Nama Mahasiswa: " + terakhir.namaMahasiswa);
                        System.out.println("ID Surat      : " + terakhir.idSurat);
                        System.out.println("Kelas         : " + terakhir.kelas);
                    }
                    break;

                case 4: //
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = input.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;

                case 5:
                    System.out.println("Sistem Berhenti. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan menu salah! Harap masukkan angka 1-5.");
            }
        } while (pilihan != 5);

        input.close();
    }
}