package ado_ap;
/* Exercício Switch-case 05, Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/
import java.util.Scanner;

public class switchEx05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Mostra se o mês é de alta ou baixa temporada");
		System.out.println("Digite o Mês (numérico xx): ");
		int mes = entrada.nextInt();
		entrada.close();
		switch(mes){
			case 1:
			case 2:
			case 6:
			case 7:
			case 12:
				System.out.println("Mês de alta temporada");
				break;
			case 3:
			case 4:
			case 5:
			case 8:
			case 9:
			case 10:
			case 11:
				System.out.println("Mẽs de baixa temporada");
				break;
			default:
				System.out.println("Mẽs inválido");
		
		}	
	}

}
