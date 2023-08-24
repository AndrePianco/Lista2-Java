package Questoes;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[][] notas = new double[5][2];
        double[] media = new double[5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("Informe as notas do aluno %d: ",i+1);
                notas[i][j] = scan.nextDouble();
            }
            media[i] = (notas[i][0]+notas[i][1])/2;
        }
        for(double i : media){
            if(i >= 7){
                System.out.printf("Aluno aprovado! com media %.2f\n", i);
            } else{
                System.out.printf("Aluno reprovado! com media %.2f\n", i);
            }
        }
    }
}
