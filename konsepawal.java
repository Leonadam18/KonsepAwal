import java.util.Scanner;

public class konsepawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        System.out.println("Masukkan jumlah kolom: ");
        int kolom = scanner.nextInt();
        int matrix[][] = new int[baris][kolom];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Masukkan Nilai Baris "+i+" Kolom "+j+": ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matrix: ");
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[j].length; k++) {
                System.out.print(matrix[j][k]+" ");
            }
            System.out.println();            
        }
    }
}