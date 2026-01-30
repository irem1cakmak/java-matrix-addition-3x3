import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int dizi[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Dizinin 1. Satır 1. sütununu girin: ");
        dizi[0][0] = scanner.nextInt();
        System.out.print(" Dizinin 1. Satır 2. sütununu girin: ");
        dizi[0][1] = scanner.nextInt();
        System.out.print(" Dizinin 1. Satır 3. sütununu girin: ");
        dizi[0][2] = scanner.nextInt();
        System.out.print(" Dizinin 2. Satır 1. sütununu girin: ");
        dizi[1][0] = scanner.nextInt();
        System.out.print(" Dizinin 2. Satır 2. sütununu girin: ");
        dizi[1][1] = scanner.nextInt();
        System.out.print(" Dizinin 2. Satır 3. sütununu girin: ");
        dizi[1][2] = scanner.nextInt();
        System.out.print(" Dizinin 3. Satır 1. sütununu girin: ");
        dizi[2][0] = scanner.nextInt();
        System.out.print(" Dizinin 3. Satır 2. sütununu girin: ");
        dizi[2][1] = scanner.nextInt();
        System.out.print(" Dizinin 3. Satır 3. sütununu girin: ");
        dizi[2][2] = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dizi[i][j] + " \t");

            }
            System.out.println(" ");
        }

        int dizi2[][] = new int[3][3];

        System.out.print("2. Dizinin 1. Satır 1. sütununu girin: ");
        dizi2[0][0] = scanner.nextInt();
        System.out.print("2. Dizinin 1. Satır 2. sütununu girin: ");
        dizi2[0][1] = scanner.nextInt();
        System.out.print(" 2.  Dizinin 1. Satır 3. sütununu girin: ");
        dizi2[0][2] = scanner.nextInt();
        System.out.print(" 2. Dizinin 2. Satır 1. sütununu girin: ");
        dizi2[1][0] = scanner.nextInt();
        System.out.print(" 2. Dizinin 2. Satır 2. sütununu girin: ");
        dizi2[1][1] = scanner.nextInt();
        System.out.print(" 2. Dizinin 2. Satır 3. sütununu girin: ");
        dizi2[1][2] = scanner.nextInt();
        System.out.print(" 2. Dizinin 3. Satır 1. sütununu girin: ");
        dizi2[2][0] = scanner.nextInt();
        System.out.print(" 2. Dizinin 3. Satır 2. sütununu girin: ");
        dizi2[2][1] = scanner.nextInt();
        System.out.print(" 2. Dizinin 3. Satır 3. sütununu girin: ");
        dizi2[2][2] = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dizi2[i][j] + " \t");

            }
            System.out.println(" ");
        }
        int result[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = dizi[i][j] + dizi2[i][j];
            }
        }
        System.out.println("Sonuç matrisi:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " \t");

            }
            System.out.println(" ");
        }

    }

}

