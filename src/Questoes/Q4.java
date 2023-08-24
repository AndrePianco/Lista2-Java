package Questoes;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[10];
        int Bbl;

        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.printf("Informe o %d° valor do vetor", i+1);
            vetorNumeros[i] = scan.nextInt();
        }

        for(int i = 0; i < vetorNumeros.length-1; i++){
            for(int j = i+1; j < vetorNumeros.length; j++){
                if(vetorNumeros[j] < vetorNumeros[i]){
                    Bbl = vetorNumeros[j];
                    vetorNumeros[j] = vetorNumeros[i];
                    vetorNumeros[i] = Bbl;
                }
            }
        }

        for (int k:
             vetorNumeros) {
            System.out.printf("%d ",k);
        }
    }
}
