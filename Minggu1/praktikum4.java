public class praktikum4 {

    public static void hitungPendapatan(int[][] stok, int[] harga) {
        System.out.println("==================================================");
        System.out.println("Laporan Pendapatan & Status Cabang RoyalGarden");
        System.out.println("==================================================");

        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;

            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }

            String status;
            if (totalPendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("RoyalGarden %d : Pendapatan = Rp %,d | Status = %s\n", 
                              (i + 1), totalPendapatan, status);
        }
        System.out.println("==================================================");
    }

    public static void main(String[] args) {

        int[][] stokBunga = {
            {10, 5, 15, 7},   
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}     
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        hitungPendapatan(stokBunga, hargaBunga);
    }
}