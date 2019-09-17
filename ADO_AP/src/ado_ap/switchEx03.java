 /* Exercício Switch-case 01, Algoritimos e lógica de programação TADS turma B
 * @author pedro.rsgomes1
 */
package ado_ap;

/**
 * @author gom
 *
 */

import java.util.Scanner;

public class switchEx03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int valor;
		System.out.println("Digite o Valor: ");
		valor = entrada.nextInt();
		entrada.close();
		
		if (valor >= 100) {
			System.out.println(((valor-(valor % 100))/100) + " notas de R$ 100,00 ");
			valor = (valor % 100);
		}
		if (valor >= 50) {
			System.out.println(((valor-(valor % 50))/50) + " notas de R$ 50,00 ");
			valor = (valor % 50);
		}
		if (valor >= 10) {
			System.out.println(((valor-(valor % 10))/10) + " notas de R$ 10,00 ");
			valor = (valor % 10);
		}
		if (valor >= 5) {
			System.out.println(((valor-(valor % 5))/5) + " notas de R$ 5,00 ");
			valor = (valor % 5);
		}
		if (valor >= 1) {
			System.out.println(((valor-(valor % 1))/1) + " notas de R$ 1,00 ");
			valor = (valor % 1);
		}
		switch(valor){
			case(0):
				System.out.println("Executado sem erros");
				break;
			default:
				System.out.println("Erro na execução");
				
		}

	}

}
