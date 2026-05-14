public class StackSurat22 {
    Surat22[] dataSurat;
    int size;
    int top;

    public StackSurat22(int size) { //
        this.size = size;
        this.dataSurat = new Surat22[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat22 srt) {
        if (!isFull()) {
            top++;
            dataSurat[top] = srt;
            System.out.println("Surat dengan ID " + srt.idSurat + " berhasil diterima.");
        } else {
            System.out.println("Stack Surat Penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            Surat22 srt = dataSurat[top];
            top--;
            return srt;
        } else {
            System.out.println("Tidak ada surat izin untuk diproses.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return dataSurat[top];
        } else {
            System.out.println("Tidak ada surat di dalam tumpukan.");
            return null;
        }
    }

    // Fitur Tambahan Menu 4: Cari surat berdasarkan Nama Mahasiswa
    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Tumpukan surat kosong.");
            return;
        }
        
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (dataSurat[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\n--- Surat Izin Ditemukan ---");
                System.out.println("ID Surat      : " + dataSurat[i].idSurat);
                System.out.println("Nama Mahasiswa: " + dataSurat[i].namaMahasiswa);
                System.out.println("Kelas         : " + dataSurat[i].kelas);
                System.out.println("Jenis Izin    : " + (dataSurat[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi        : " + dataSurat[i].durasi + " Hari");
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat izin atas nama \"" + nama + "\" tidak ditemukan.");
        }
    }
}