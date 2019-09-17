/*
 * Exercício 09, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1

 */
package ado_ap;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numeroCadastro;
        double horasTrabalhadas;
        double valorHora;
        double salario;
        System.out.println("Digite Numero de Cadastro do Funcionário: ");
        numeroCadastro = entrada.nextLine();
        System.out.println("digite a quantidade de Horas trabalhadas: ");
        horasTrabalhadas = entrada.nextDouble();
        System.out.println("Digite o valor Hora: ");
        valorHora = entrada.nextDouble();
        salario = (horasTrabalhadas * valorHora); 
        entrada.close();
        System.out.println("O funcionário cadastrado com o núemro " + numeroCadastro+" deverá receber o valor de: " + salario);
    }
}
