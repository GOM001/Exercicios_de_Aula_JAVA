/**
 * 
 */
package AP_I;

/**
 * @author rafae
 *
 */
public class EX_42 {

	/**
	 * 42. Fazer um programa que lê duas matrizes A e B de números inteiros e imprima o produto do maior número
	 * de A pelo maior número de B.
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{4,3},{2,1}};
		int maiorA = comparacao(a);
 		int maiorB = comparacao(b);
 		System.out.printf("O maior munero de A é %d e o maior número de B é %d", maiorA,maiorB);
 		System.out.printf("\nO produto dos dois é igual a %d",(maiorA*maiorB));

	}
	
	
	static int comparacao(int[][] c) {
		int maiorNumero = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				if(maiorNumero < c[i][j]) {
					maiorNumero = c[i][j];
				}
				
			}
		}
		return maiorNumero;
		
	}

}
