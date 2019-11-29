/**
 * 
 */
package AP_I;

import java.util.Scanner;

/**
 * @author rafae
 *
 */
public class EX_38 {

	/**
	 * 39 - Dadas duas matrizes, a primeira com N x M elementos, e a segunda com M x P elementos, fazer um
	 * programa que imprima o produto das duas matrizes

	 * @param args
	 */
	public static void main(String[] args) {
		fazTudo();
	}
	
	static Scanner entrada = new Scanner(System.in);
	
	static void fazTudo() {
	int[][] a = {{2,3},{1,0},{4,5}};
	int[][] b = {{3,1},{2,4}};
	
	System.out.println("--- Matriz A ---");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.printf(" %3d ",a[i][j]);
		}
		System.out.println("");
	}
	System.out.println("");
	
	System.out.println("--- Matriz B ---");
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.printf(" %3d ",b[i][j]);
		}
		System.out.println("");
	}
	System.out.println("");
	int [][] c = new int[a.length][b[0].length];
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[0].length; j++) {
			int sun = 0;
			for (int k = 0; k < b.length; k++) {
				sun = (a[i][k]*b[k][j]) + sun;
			}
			c[i][j] = sun;
		}
	}
	
	System.out.println("--- Matriz Resultante C ---");
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[0].length; j++) {
			System.out.printf(" %3d ",c[i][j]);
		}
		System.out.println("");
	}
	
	
	
	
	}
}

