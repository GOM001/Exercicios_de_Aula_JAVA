/*
 * Exercício 16, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double hinicio;
        double hfinal;
        double horaTotal;
        
        System.out.println("Digite hora inicial");
        hinicio = entrada.nextDouble();
        System.out.println("Digite hora final");
        hfinal = entrada.nextDouble();
        entrada.close();
        
        if (hinicio >= hfinal){
           horaTotal = 24-(hinicio - hfinal); 
        }
        else{
           horaTotal = (hfinal - hinicio);
        }
            System.out.println("O JOGO DUROU " + horaTotal +" HORA(S)");

    }
}
