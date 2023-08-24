package Questoes;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.printf("Informe o valor da casa [%d] [%d] da matriz: ",i+1,j+1);
                matriz[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.printf("%d ",matriz[j][i]);
            }
            System.out.println(" ");
        }

    }

}
