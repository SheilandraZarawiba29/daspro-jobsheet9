import java.util.Scanner;

public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double ttlLulus = 0;
        double ttlTdkLulus = 0;
        double rataLulus = 0;
        double rataTdkLulus = 0;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] > 70) {
                ttlLulus += nilaiMhs[i]; 
                rataLulus += 1; 
            } else {
                ttlTdkLulus += nilaiMhs[i]; 
                rataTdkLulus += 1; 
            }
        }

        if (rataLulus != 0) {
            rataLulus = ttlLulus/rataLulus;
        }

        if (rataTdkLulus != 0) {
            rataTdkLulus = ttlTdkLulus/rataTdkLulus;
        }

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
    }
}
