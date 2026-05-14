import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5); //
        Scanner scan = new Scanner(System.in); //
        int pilih; //

        do {
            System.out.println("\nMenu:"); //
            System.out.println("1. Mengumpulkan Tugas"); //
            System.out.println("2. Menilai Tugas (Pop & Konversi Biner)"); //
            System.out.println("3. Melihat Tugas Teratas"); //
            System.out.println("4. Melihat Daftar Tugas"); //
            System.out.println("5. Melihat Tugas Terbawah (Pertanyaan 4)"); //
            System.out.println("6. Jumlah Tugas Saat Ini (Pertanyaan 5)"); //
            System.out.println("7. Keluar");
            System.out.print("Pilih: "); //
            pilih = scan.nextInt(); //
            scan.nextLine(); // Clear buffer

            switch (pilih) { //
                case 1:
                    System.out.print("Nama: "); //
                    String nama = scan.nextLine(); //
                    System.out.print("NIM: "); //
                    String nim = scan.nextLine(); //
                    System.out.print("Kelas: "); //
                    String kelas = scan.nextLine(); //
                    
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas); //
                    stack.push(mhs); //
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama); //
                    break; //

                case 2:
                    Mahasiswa22 dinilai = stack.pop(); //
                    if (dinilai != null) { //
                        System.out.println("Menilai tugas dari " + dinilai.nama); //
                        System.out.print("Masukkan nilai (0-100): "); //
                        int nilai = scan.nextInt(); //
                        dinilai.tugasDinilai(nilai); //
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai); //
                        
                        // Integrasi Percobaan 2 (Konversi Biner)
                        String biner = stack.konversiDesimalKeBiner(nilai); //
                        System.out.println("Nilai Biner Tugas: " + biner); //
                    }
                    break; //

                case 3:
                    Mahasiswa22 lihat = stack.peek(); //
                    if (lihat != null) { //
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama); //
                    }
                    break; //

                case 4:
                    System.out.println("Daftar semua tugas"); //
                    System.out.println("Nama\tNIM\tKelas"); //
                    stack.print(); //
                    break; //

                case 5: // Implementasi Pertanyaan 4
                    Mahasiswa22 terbawah = stack.peekBottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + terbawah.nama);
                    }
                    break;

                case 6: // Implementasi Pertanyaan 5
                    System.out.println("Jumlah tugas di dalam stack saat ini: " + stack.getJumlahTugas());
                    break;

                case 7:
                    System.out.println("Keluar dari program.");
                    break;

                default: //
                    System.out.println("Pilihan tidak valid."); //
            }
        } while (pilih != 7); // Diubah menjadi 'pilih != 7' agar program berhenti dengan benar saat memilih menu keluar
        
        scan.close();
    }
}