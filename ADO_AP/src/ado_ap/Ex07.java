/*
 * Exercício 07, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ladoA;
        double ladoB;
        double calculo;
        double hipotenusa;
        System.out.println("Digite tamanho do Lado A: ");
        ladoA = entrada.nextDouble();
        System.out.println("Digite tamanho do Lado B: ");
        ladoB = entrada.nextDouble();
        calculo = (Math.pow(ladoA,2)+ Math.pow(ladoB,2));
        hipotenusa = Math.sqrt(calculo);
        entrada.close();
        System.out.println("O valor da hipotenusa é "+hipotenusa);
    }
}
