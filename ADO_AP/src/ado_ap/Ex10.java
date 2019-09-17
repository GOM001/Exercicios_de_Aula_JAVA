/*
 * Exercício 10, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome; 
        double salario;
        double totalVendas;
        System.out.println("Digite Nome");
        nome = entrada.nextLine();
        System.out.println("Salário fixo do vendedor(R$): ");
        salario = entrada.nextDouble();
        System.out.println("Digite Total de Vendas(R$): ");
        totalVendas = entrada.nextDouble();
        entrada.close();
        System.out.println("O Vendedor "+nome+" Receberá o montante de " + (salario+(0.15*totalVendas)));
       
        
    }
}
