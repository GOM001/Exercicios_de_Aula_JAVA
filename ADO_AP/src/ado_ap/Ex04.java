/*
 * Exercício 04, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Digite N1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite N2: ");
        n2 = entrada.nextInt();
        entrada.close();
        System.out.println((n1+1)+" "+(n2+1));
    }
}
