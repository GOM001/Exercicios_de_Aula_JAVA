/*
 * Exercício 14, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        double n1;
        double n2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite N1");
        n1 = entrada.nextDouble();
        System.out.println("Digite N2");
        n2 = entrada.nextDouble();  
        entrada.close();
        if (n1 > n2){
            System.out.println(n1 + " / " + n2 + " = " + n1/n2);
        }
        else
            System.out.println(n2 + " / " + n1 + " = " + n2/n1);

    }
}
