public class Mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    // Konstruktor berparameter dengan nilai default -1 (tugas belum dinilai)
    public Mahasiswa22(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; //
    }

    // Method untuk mengeset nilai tugas
    public void tugasDinilai(int nilai) {
        this.nilai = nilai; //
    }
}