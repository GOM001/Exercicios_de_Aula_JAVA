/*
 * Exercício Switch-case 01, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1
 */
package ado_ap;

import java.util.Scanner;

public class switchEx01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int resto;
        System.out.println("Digite N1 ");
        n1 = entrada.nextInt();
        entrada.close();
        resto = (n1%3);
        switch(resto){
            case(0):
                System.out.println("Divisível por 3");
                break;
            default:
                System.out.println("Não é divisível por 3");
        }
    }
}
