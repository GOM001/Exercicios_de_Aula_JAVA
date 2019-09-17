/*
 * Exercício 05, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double l;
        System.out.println("Digite L: ");
        l = entrada.nextDouble();
        entrada.close();
        System.out.println("A Área do quadrado é = "+ (l*l));
    }
}
