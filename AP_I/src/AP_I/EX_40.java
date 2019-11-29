/**
 * 
 */
package AP_I;

import java.util.Scanner;

/**
 * @author rafae
 *
 */
public class EX_40 {

	/**
	 * 40. Dada uma matriz de tamanho N x M, de números inteiros, verificar se um dado número inteiro faz parte
	 *dos elementos dessa matriz. Caso faça, imprimir a posição em que esse número se encontra dentro da
	 *matriz.

	 * @param args
	 */
	public static void main(String[] args) {
		fazTudo();
	}
	
	static Scanner entrada = new Scanner(System.in);
	
	static void fazTudo() {
		System.out.println("---- Selecione o valor das dimensões da matriz ----");
		System.out.println("Digite o Valor de M");
		int m =  entrada.nextInt();
		System.out.println("Digite o Valor de N");
		int n = entrada.nextInt();
		System.out.println("Digite o númeor que deve ser encontrado na matriz");
		int numero = entrada.nextInt();
		int[][] matriz = new int[m][n];
		int x = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = x;
				x++;
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
				if (numero == matriz[i][j]) {
					System.out.printf("O número %d está nlocalizado na matriz na posição [%2d][%2d]",numero,i,j);
				}
			}
		}
	}

}
