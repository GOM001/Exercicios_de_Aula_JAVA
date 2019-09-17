/*
 * Exercício 8, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1
 */
package ado_ap;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        double a0, a, a2;
        double b0, b, b2;
        double c0, c, c2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite A");
        a0 = entrada.nextDouble();
        System.out.println("Digite B");
        b0 = entrada.nextDouble();
        System.out.println("Digite C");
        c0 = entrada.nextDouble();
        System.out.println("Digite N4");
        entrada.close();
        
        if ((a0>b0)&& (a0>c0)){
            if(b0>c0){
                a = a0; b = b0; c = c0;
            }
            else{
                a = a0; b = c0; c = b0;
            }
        }
        else if ((b0>a0) && (b0>c0)){
            if (a0>c0){
                a = b0; b = a0; c = c0;
            }
            else{
                a = b0; b = c0; c = a0;
            }
        }
        else{
            if (a0>b0){
                a = c0; b = a0; c = b0;
            }
            else{
                a = c0; b = b0; c = a0;
            }
        }
                
        a2 = Math.pow(a,2);
        b2 = Math.pow(b,2);
        c2 = Math.pow(c,2);
        System.out.println(a +" "+ b +" "+ c);
        
        if (a >= (b+c)){
            System.out.println("NAO FORMA TRIÂNGULO");
        }
        else{
        if (a2 == (b2 + c2)){
            System.out.println("TRIÂNGULO RETÂNGULO");
        }
        if (a2 > (b2 + c2)){
            System.out.println("TRIÂNGULO OBTUSÂNGULO");
        }
        if (a2 < (b2 + c2)){
            System.out.println("TRIÂNGULO ACUTÂNGULO");
        }
        if (a == b && (b == c)){
            System.out.println("TRIÂNGULO EQUILÁTERO");
        }
        if (((a == b) && (b != c))||(( b ==c )&& (b != a))|| ((a == c) && (c != b))){
            System.out.println("TRIÂNGULO ISÓSCELES");
        }
        }
    }
}
