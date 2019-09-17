/*
 * Exercício 06, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = 3.14159;
        double a;
        double b;
        double c;
        double areaTrianguloRetangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;
        double perimetroRetangulo;
        System.out.println("Digite A: ");
        a = entrada.nextDouble();
        System.out.println("Digite B: ");
        b = entrada.nextDouble();
        System.out.println("Digite C: ");
        c = entrada.nextDouble();
        entrada.close();
        areaTrianguloRetangulo = (a*c)/2;
        areaCirculo = (PI*Math.pow(c, 2));
        areaTrapezio = (a+b)/(c/2);
        areaQuadrado = (b*b);
        areaRetangulo = (a*b);
        perimetroRetangulo = 2*(a+b);
        System.out.println("A Área do Triangulo Retângulo é = "+ areaTrianguloRetangulo);
        System.out.println("A Área do Círculo é = "+ areaCirculo);
        System.out.println("A Área do Trapézio é = "+ areaTrapezio);
        System.out.println("A Área do Quadrado é = "+ areaQuadrado);
        System.out.println("A Área do Retângulo é = "+ areaRetangulo);
        System.out.println("A Perímetro do Retângulo é = "+ perimetroRetangulo);
    }
}
