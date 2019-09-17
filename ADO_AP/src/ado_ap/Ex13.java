/*
 * Exercício 13, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1
 */
package ado_ap;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite N1");
        n1 = entrada.nextDouble();
        System.out.println("Digite N2");
        n2 = entrada.nextDouble();
        System.out.println("Digite N3");
        n3 = entrada.nextDouble();
        entrada.close();
        
        
        if (n1 > n2 && n1 >n3){
            System.out.println("O maior núero é " + n1);
        }
        else if (n2 > n1 && n2>n3){ 
            System.out.println("O maior núero é " + n2);
        }
        else{
            System.out.println("O maior núero é " + n3);
        }
    }
}
