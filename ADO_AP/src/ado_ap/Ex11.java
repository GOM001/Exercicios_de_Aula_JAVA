/*
 * Exercício 11, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        double n;
        System.out.println("Digite N");
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextDouble();
        entrada.close();
        if (n < 0){
            System.out.println("Numero negativo");
        }
        else if (n == 0){
            System.out.println("Numero é Zero");
        }
        else{
            System.out.println("Numero positivo");
        }
        
    }
}
