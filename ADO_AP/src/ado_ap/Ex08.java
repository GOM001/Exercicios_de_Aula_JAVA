/*
 * Exercício 08, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1
 */
package ado_ap;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite N1");
        n1 = entrada.nextDouble();
        System.out.println("Digite N2");
        n2 = entrada.nextDouble();
        System.out.println("Digite N3");
        n3 = entrada.nextDouble();
        System.out.println("Digite N4");
        n4 = entrada.nextDouble();
        media = (n1 + n2 + n3 + n4) / 4;
        entrada.close();
        System.out.println("A média é: " + media);
    }
}
