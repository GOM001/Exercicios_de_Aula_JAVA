/*
 * Exercício 15, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double delta;
        double r1;
        double r2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite A");
        a = entrada.nextDouble();
        System.out.println("Digite B");
        b = entrada.nextDouble();
        System.out.println("Digite C");
        c = entrada.nextDouble();
        delta = (Math.pow(b,2))-4*a*c;
        entrada.close();
        if (delta >= 0 && (a != 0)){
            r1 = (-(b)+ Math.sqrt(delta))/(2*a);
            r2 = (-(b)- Math.sqrt(delta))/(2*a);
            System.out.println("As Raizes são: " + r1 +" e "+ r2);
        }
        else{
            System.out.println("Impossível calcular");
        }
    }
}
