package ado_ap;

/* Exercício Switch-case 0, Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/

import java.util.Scanner;

public class switchEx04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int mes;
		int ano;
		System.out.println("Exibe quantidade de dias no mês a partir de mẽs/ano de referência" );
		System.out.println("Digite o mês (númerico xx): " );
		mes = entrada.nextInt();
		System.out.println("Digite o ano (númerico xxxx): " );
		ano = entrada.nextInt();
		entrada.close();
		switch (mes) {
		case 1:
			System.out.println("Janeiro de "+ano+" - 31 Dias");
			break;
		case 2:
			if ((ano % 4) == 0) {
				if ((ano % 100) != 0) {
					System.out.println("Fevereiro bisexto - 29 Dias");					
				}
				else if((ano % 400) == 0) {
					System.out.println("Fevereiro bisexto - 29 Dias");
				}
				else{
					System.out.println("Fevereiro - 29 Dias");
				}
			}
			else {
				System.out.println("Fevereiro - 29 Dias");
			}
			break;
		case 3:
			System.out.println("Março de "+ano+" - 31 Dias");
			break;
		case 4:
			System.out.println("Abril de "+ano+" - 30 Dias");
			break;
		case 5:
			System.out.println("Maio de "+ano+" - 31 Dias");
			break;
		case 6:
			System.out.println("Junho de "+ano+" - 30 Dias");
			break;
		case 7:
			System.out.println("Julho de "+ano+" - 31 Dias");
			break;
		case 8:
			System.out.println("Agosto de "+ano+" - 31 Dias");
			break;
		case 9:
			System.out.println("Setembro de "+ano+" - 30 Dias");
			break;
		case 10:
			System.out.println("Outubro de "+ano+" - 31 Dias");
			break;
		case 11:
			System.out.println("Novembro de "+ano+" - 30 Dias");
			break;
		case 12:
			System.out.println("Dezembro  de "+ano+" - 31 Dias");
			break;
		default:
			System.out.println("Inválido");
		}
		

	}

}
