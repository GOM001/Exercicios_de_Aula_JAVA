/*
 * Exercício 03, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        System.out.println("Digite N1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite N2: ");
        n2 = entrada.nextInt();
        entrada.close();
        System.out.println((Math.pow(n1,2))+(Math.pow(n2,2)));
    }
}
