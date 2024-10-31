import java.util.Scanner;

public class Tugas2js928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine(); 
        
        String[] namaPesanan = new String[jmlPesanan];
        double[] harga = new double[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            harga[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        double totalBiaya = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            totalBiaya += harga[i];
        }

        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println(namaPesanan[i] + " | Harga: " + harga[i]);
        }
        System.out.println("Total Biaya: " + totalBiaya);
    }
}
