public class MahasiswaBerprestasi22 {
    Mahasiswa22[] listMhs = new Mahasiswa22[5];
    int idx = 0;

    // Method untuk menambah objek mahasiswa ke dalam array
    public void tambah(Mahasiswa22 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data array sudah penuh!");
        }
    }

    // Method untuk menampilkan seluruh data mahasiswa di dalam array
    public void tampil() {
        for (Mahasiswa22 mhs : listMhs) {
            if (mhs != null) {
                mhs.tampilInformasi();
                System.out.println("------------------------------------");
            }
        }
    }

    // Method Sequential Search
    public int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j] != null && listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // Method untuk menampilkan posisi dari data yang dicari
    public void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    // Method untuk menampilkan detail data yang dicari berdasarkan posisi
    public void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t: " + listMhs[pos].nim);
            System.out.println("nama\t: " + listMhs[pos].nama);
            System.out.println("kelas\t: " + listMhs[pos].kelas);
            System.out.println("ipk\t: " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    // Method Binary Search
    public int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listMhs[mid] != null && cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid] != null && listMhs[mid].ipk > cari) {
                // Proses pencarian ke kiri
                return findBinarySearch(cari, left, mid - 1);
            } else {
                // Proses pencarian ke kanan
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}