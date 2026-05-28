public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    // Konstruktor
    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = -1;
        rear = -1;
    }

    // Method untuk mengecek apakah queue kosong
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method untuk mengecek apakah queue penuh
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // Method untuk menampilkan elemen terdepan
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // Method untuk menampilkan seluruh elemen queue
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    // Method untuk mengosongkan queue
    public void clear() {
        if (!IsEmpty()) {
            front = -1;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // Method untuk menambahkan data ke queue
    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            // Modifikasi Pertanyaan No 7: Jika overflow, hentikan program
            System.out.println("Program dihentikan karena Queue Overflow.");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = 0;
                rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    // Method untuk mengeluarkan data dari queue
    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            // Modifikasi Pertanyaan No 7: Jika underflow, hentikan program
            System.out.println("Program dihentikan karena Queue Underflow.");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = -1;
                rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}