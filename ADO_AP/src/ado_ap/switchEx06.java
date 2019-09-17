package ado_ap;
/* Exercício Switch-case 05, Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/
import java.util.Scanner;
public class switchEx06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia;
		System.out.println("verifica se o Dia é fim de semana, dia da semana ou inválido): ");
		System.out.println("Digite o Dia da semana (numérico xx): ");
		dia = entrada.nextInt();
		entrada.close();
		switch(dia) {
			case 1:
			case 7:
				System.out.println("Fim de Semana");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dia de semana");
				break;
			default:
				System.out.println("Dia inválido");
		}
	}

}
