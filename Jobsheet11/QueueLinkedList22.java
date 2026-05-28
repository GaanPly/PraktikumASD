public class QueueLinkedList22 {
    NodeMahasiswa22 head; // Menunjuk ke elemen terdepan (Front)
    NodeMahasiswa22 tail; // Menunjuk ke elemen terakhir (Rear)
    int size;

    public QueueLinkedList22() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // d. Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // d. Cek antrian penuh (SLL/Linked List secara teori dinamis & tidak penuh kecuali memori habis)
    public boolean isFull() {
        return false; 
    }

    // d. Mengosongkan antrian
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan!");
    }

    // e. Menambahkan antrian (Enqueue / insertLast)
    public void enqueue(Mahasiswa22 input) {
        NodeMahasiswa22 ndInput = new NodeMahasiswa22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println(input.nama + " berhasil masuk ke dalam antrian.");
    }

    // f. Memanggil antrian (Dequeue / removeFirst)
    public Mahasiswa22 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dipanggil!");
            return null;
        }
        Mahasiswa22 temp = head.data;
        head = head.next;
        
        if (head == null) {
            tail = null; // Jika setelah dihapus menjadi kosong, tail juga harus dinetralkan
        }
        size--;
        return temp;
    }

    // g. Menampilkan antrian terdepan dan antrian paling akhir
    public void tampilTerdepanDanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("=== MAHASISWA TERDEPAN (FRONT) ===");
            head.data.tampilInformasi();
            System.out.println("=== MAHASISWA PALING AKHIR (REAR) ===");
            tail.data.tampilInformasi();
        }
    }

    // h. Menampilkan jumlah mahasiswa yang masih mengantre
    public int getJumlahAntrian() {
        return size;
    }

    // Tambahan: Menampilkan seluruh daftar isi antrian secara berurutan
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        NodeMahasiswa22 tmp = head;
        int nomor = 1;
        System.out.println("Daftar Antrian Saat Ini:");
        while (tmp != null) {
            System.out.print(nomor + ". ");
            System.out.println(tmp.data.nama + " [" + tmp.data.nim + "]");
            tmp = tmp.next;
            nomor++;
        }
        System.out.println("---------------------------------");
    }
}