import java.util.Scanner;

public class Tugas1NoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int total = 0;

        for (int baris = 1; baris <= n; baris++) {
            for (int angka = 1; angka <= baris; angka++) {
                System.out.print(angka + " ");
                total++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);
        sc.close();
    }
}