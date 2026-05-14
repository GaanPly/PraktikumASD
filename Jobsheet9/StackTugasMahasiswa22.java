public class StackTugasMahasiswa22 {
    Mahasiswa22[] stack;
    int size;
    int top;

    public StackTugasMahasiswa22(int size) {
        this.size = size; //
        this.stack = new Mahasiswa22[size]; //
        this.top = -1; //
    }

    public boolean isFull() {
        return top == size - 1; //
    }

    public boolean isEmpty() {
        return top == -1; //
    }

    public void push(Mahasiswa22 mhs) {
        if (!isFull()) { //
            top++; //
            stack[top] = mhs; //
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi."); //
        }
    }

    public Mahasiswa22 pop() {
        if (!isEmpty()) { //
            Mahasiswa22 m = stack[top]; //
            top--; //
            return m; //
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai."); //
            return null;
        }
    }

    public Mahasiswa22 peek() {
        if (!isEmpty()) { //
            return stack[top]; //
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan"); //
            return null;
        }
    }

    // Perbaikan loop cetak: Iterasi terbalik dari TOP ke 0 agar sesuai dengan output LIFO (Verifikasi Percobaan)
    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada tugas di dalam tumpukan.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas); //
        }
        System.out.println(""); //
    }

    // Method Konversi Desimal ke Biner (Percobaan 2)
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi22 stackKonv = new StackKonversi22(); //
        
        if (nilai == 0) return "0";

        while (nilai > 0) { //
            int sisa = nilai % 2; //
            stackKonv.push(sisa); //
            nilai = nilai / 2; //
        }

        String biner = new String(); //
        while (!stackKonv.isEmpty()) { //
            biner += stackKonv.pop(); //
        }
        return biner; //
    }

    // --- Jawaban Pertanyaan Modifikasi ---
    // Pertanyaan 4: Mengakses tugas terbawah (elemen pertama kali dikumpulkan)
    public Mahasiswa22 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // Pertanyaan 5: Menghitung jumlah tugas saat ini
    public int getJumlahTugas() {
        return top + 1;
    }
}