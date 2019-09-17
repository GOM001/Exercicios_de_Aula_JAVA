/*
 * Exercício 15, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite A");
        a = entrada.nextDouble();
        System.out.println("Digite B");
        b = entrada.nextDouble();
        System.out.println("Digite C");
        c = entrada.nextDouble();
        System.out.println("Digite D");
        d = entrada.nextDouble();
        entrada.close();
        
        if ((b>c)&&(d>a)&&((c+d) > (a+b))&&(c>=0)&&(d>=0)&&(a%2 == 0)){
            System.out.println("Valores Aceitos");
        }
        else
            System.out.println("Valores não Aceitos");

    }
}
