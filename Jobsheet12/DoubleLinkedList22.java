public class DoubleLinkedList22 {
    Node22 head;
    Node22 tail;

    public DoubleLinkedList22() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Penambahan data di awal
    public void addFirst(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Penambahan data di akhir
    public void addLast(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Sisipkan data setelah NIM tertentu
    public void insertAfter(String keyNim, Mahasiswa22 data) {
        Node22 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node22 newNode = new Node22(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // Modifikasi Pertanyaan Percobaan 1 No. 5: Menampilkan pesan jika kosong
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node22 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    // Modifikasi Pertanyaan Percobaan 1 No. 6: Menampilkan data terbalik (Tail -> Head)
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("===== PRINT REVERSE (TAIL -> HEAD) =====");
        Node22 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    // Modifikasi Pertanyaan Percobaan 2 No. 2: Menampilkan data yang dihapus
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Modifikasi Pertanyaan Percobaan 2 No. 2: Menampilkan data yang dihapus
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}