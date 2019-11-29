/**
 * 
 */
package AP_I;

import java.util.Scanner;

/**
 * @author rafae
 *
 */
public class EX_41 {

	/**
	 * 41. Fazer uma função que tem como parâmetro de entrada uma matriz MxN de números inteiros e fornece
	 * como saída o maior número dentro do matriz
	 * @param args
	 */
	public static void main(String[] args) {
		int maior = maiorNumeromatriz();
		System.out.println("\nO Maior número da Matriz é o "+maior);

	}
	
	static Scanner entrada = new Scanner(System.in);
	
	static int maiorNumeromatriz() {
		System.out.println("---- Selecione o valor das dimensões da matriz ----");
		System.out.println("Digite o Valor de M");
		int m =  entrada.nextInt();
		System.out.println("Digite o Valor de N");
		int n = entrada.nextInt();
		int[][] matriz = new int[m][n];
		int maior = 0;
		int x = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = x;
				x = (x*i+2*j*2)/2;
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf(" %5d ",matriz[i][j]);
			}
			System.out.println("");
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (maior < matriz[i][j]) {
					maior = matriz[i][j];
				}
			}
		}
		return maior;
	}

}
