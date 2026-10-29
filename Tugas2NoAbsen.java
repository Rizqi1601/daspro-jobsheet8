import java.util.Scanner;

public class Tugas2NoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int total = 0;

        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                int hasil = baris * kolom;
                System.out.printf("%4d", hasil);
                total += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + total);
        sc.close();
    }
}