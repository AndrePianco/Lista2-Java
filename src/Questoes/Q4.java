package Questoes;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[10];

        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.printf("Informe o %d° valor do vetor", i+1);
            vetorNumeros[i] = scan.nextInt();
        }
    }
}
