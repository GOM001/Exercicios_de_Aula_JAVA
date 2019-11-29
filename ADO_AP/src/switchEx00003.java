/*
 * Exercício Switch-case 01, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1
 */
package ado_ap;

import java.util.Scanner;

public class switchEx00003 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor;

		System.out.println("Digite Valor do troco: ");
		valor = entrada.nextInt();
		System.out.println(verificarTroco(valor));
		entrada.close();

	}

	public static StringBuffer verificarTroco(int troco) {
		int valor[] = new int[5];
		int switchzinho = 0;
		valor: for (int i = 0; 0 < troco; i++) {
			if (troco > 100) {
				switchzinho = 1;
			}

			else if (troco > 50) {
				switchzinho = 2;
			}

			else if (troco > 10) {
				switchzinho = 3;
			}

			else if (troco > 5) {
				switchzinho = 4;
			}

			else if (troco > 1) {

				switchzinho = 5;
			}

			switch (switchzinho) {
			case (1):
				valor[0] = ((troco - (troco % 100)) / 100);
				troco = (troco % 100);
				continue valor;
			case (2):
				valor[1] = ((troco - (troco % 50)) / 50);
			troco = (troco % 50);
			continue valor;
			case (3):
				valor[2] = ((troco - (troco % 10)) / 10);
			troco = (troco % 10);
			continue valor;
			case (4):
				valor[3] = ((troco - (troco % 5)) / 5);
			troco = (troco % 5);
			continue valor;
			case (5):
				valor[4] = ((troco - (troco % 1)) / 1);
			troco = (troco % 1);
			continue valor;
			default:
			}

		}
	StringBuffer a = new StringBuffer("Para o troco são necessarias: \n");
		if(valor[0] >= 1)  a.append(valor[0] + " notas de R$ 100 \n");
		if(valor[1] >= 1)  a.append(valor[1] + " notas de R$ 50 \n");
		if(valor[2] >= 1)  a.append(valor[2] + " notas de R$ 10 \n");
		if(valor[3] >= 1)  a.append(valor[3] + " notas de R$ 5 \n");
		if(valor[4] >= 1)  a.append(valor[4] + " notas de R$ 1 \n");
		
		return a;
	}

}
