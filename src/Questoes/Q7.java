package Questoes;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1.length; j++){
                System.out.printf("Informe o valor da casa [%d] [%d] da matriz 1: ", i+1, j+1);
                matriz1[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2.length; j++){
                System.out.printf("Informe o valor da casa [%d] [%d] da matriz 2: ", i+1, j+1);
                matriz2[i][j] = scan.nextInt();
            }
        }
        System.out.println("\nSoma das matrizes: ");
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1.length; j++){
                System.out.printf("%d ", (matriz1[i][j] + matriz2[i][j]));
            }
            System.out.println(" ");
        }
        System.out.println("\nDiferença das matrizes:");
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1.length; j++){
                System.out.printf("%d ", (matriz1[i][j] - matriz2[i][j]));
            }
            System.out.println(" ");
        }

    }

}
