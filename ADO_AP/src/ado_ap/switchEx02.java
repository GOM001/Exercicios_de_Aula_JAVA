package ado_ap;
/* Exercício Switch-case 01, Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/

import java.util.Scanner;

public class switchEx02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        System.out.println("Digite Número do Dia! (numérico xx): ");
        n1 = entrada.nextInt();
        entrada.close();
        switch (n1) {
			case 01:
			case 07:
				System.out.println("Fim de Semana");
				break;
			case 02:
			case 03:
			case 04:
			case 05:
			case 06:
				System.out.println("Dias de semana");
				break;
			default:
				System.out.println("Dia inválido");
		}
    }
}
