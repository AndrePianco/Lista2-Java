package Questoes;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        String nome;
        Scanner scan = new Scanner(System.in);
        int contA = 0, contE = 0;

        System.out.println("Informe os nomes, separados com espaço, a serem analisados: ");
        nome = scan.nextLine();
        for(int i = 0; i < nome.length(); i++){
            if(nome.charAt(i) == 'a' || nome.charAt(i) == 'A'){
                contA++;
            }
            else if(nome.charAt(i) == 'e' || nome.charAt(i) == 'E'){
                contE++;
            }
        }
        System.out.printf("\nTivemos %d letra(s) E, e %d letra(s) A!",contE,contA);

    }
}
