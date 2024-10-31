import java.util.Scanner;

public class Tugas1js9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        double total = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 0; i < jmlMhs; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        double rataRata = total / jmlMhs;
        System.out.println("Semua nilai mahasiswa:");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}

