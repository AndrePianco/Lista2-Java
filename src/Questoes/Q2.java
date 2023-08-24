package Questoes;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double salario = 0, maxsal = 0, contsal = 0;
        int filhos = 0, fam = 0, contfilho = 0;


        while(salario > -1){
            System.out.println("Informe o seu salario ou digite -1 para parar");
            salario = scan.nextDouble();
            if(maxsal < salario){
                maxsal = salario;
            }
            if(salario > -1){
                System.out.println("Informe quantos filhos você tem:");
                filhos = scan.nextInt();
                contsal += salario;
                contfilho += filhos;
                fam++;

            }
//
        }
        System.out.printf("Salario mais alto: %.2f ", maxsal);
        System.out.printf("Media de salarios: %.2f", (contsal/fam));
        System.out.printf("Media de filhos por familia: %d", (contfilho/fam));
        scan.close();
    }

}
