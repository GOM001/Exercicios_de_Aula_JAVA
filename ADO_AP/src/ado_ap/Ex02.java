/*
 * Exercício 02, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1
 */
package ado_ap;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double b;
        double e;
        System.out.println("Digite a Base: ");
        b = entrada.nextInt();
        System.out.println("Digite o expoente: ");
        e = entrada.nextInt();
        entrada.close();
        System.out.println(Math.pow(b,e));
    }
}
