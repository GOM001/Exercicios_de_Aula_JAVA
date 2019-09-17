package ado_ap;
/* Exercício Switch-case 05, Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/
import java.util.Scanner;

public class switchEx07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		final int C = 100;
		System.out.println("Calcula valor do plano de saúde: ");
		System.out.println("Digite a Idade do Conveniado: ");
		idade = entrada.nextInt();
		entrada.close();
		if (idade < 10) {
			idade = 1;
		}
		else if (idade >= 10 && idade < 40) {
			idade = 2;
		}
		else if (idade >= 40 && idade < 60) {
			idade = 3;
		}
		else {
			idade = 4;
		}
		
		switch (idade) {
		case 1:
			System.out.println("O valor a ser pago no plano de saúd"
                                + "e é de " + (C + 80));
			break;
		case 2:
			System.out.println("O valor a ser pago no plano de saúd"
                                + "e é de " + (C + 50));
			break;
		case 3:
			System.out.println("O valor a ser pago no plano de saúd"
                                + "e é de " + (C + 95));
			break;
		default:
			System.out.println("O valor a ser pago no plano de saúd"
                                + "e é de " + (C + 130));
		}

	}

}
