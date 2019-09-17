/*
 * Exercício 12, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        double l;
        double r;
        double areaQuadrado;
        double areaCirculo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite L");
        l = entrada.nextDouble();
        System.out.println("Digite R");
        r = entrada.nextDouble();
        entrada.close();
        areaQuadrado = (l * l);
        areaCirculo = (Math.PI * Math.pow(r,2));
        if (areaQuadrado > areaCirculo){
            System.out.println("A Area do Quadrado é a Maior");
            System.out.println("A Area do Quadrado é = "+ areaQuadrado);
            System.out.println("E a Area do Circulo é = "+ areaCirculo);
        }
        else{
            System.out.println("A Area do Circulo é a Maior");
            System.out.println("E a Area do Circulo é = " + areaCirculo);
            System.out.println("A Area do Quadrado é = " + areaQuadrado);
        }
        
    }
}
