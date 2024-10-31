import java.util.Scanner;

public class Tugas3js928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String mknDicari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(mknDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(mknDicari + " tersedia di menu.");
        } else {
            System.out.println(mknDicari + " tidak ada di menu.");
        }
    }
}
