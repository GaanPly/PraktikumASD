public class MahasiswaMain22 {
    public static void main(String[] args) {
        Mahasiswa22 mhs1 = new Mahasiswa22();
        mhs1.nama = "Putra Bakti";
        mhs1.nim = "254107020147";
        mhs1.kelas = "TI 1C";
        mhs1.ipk = 3.9;

        mhs1.tampilkaninformasi();
        mhs1.ubahKelas("TI 2A");
        mhs1.updateIpk(4.0);
        System.out.println();
        mhs1.tampilkaninformasi();

        Mahasiswa22 mhs2 = new Mahasiswa22("Gaan","254107020345","TI 2C",4.0);
        mhs2.updateIpk(3.6);
        mhs2.tampilkaninformasi();
    }
}
