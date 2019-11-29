package programas;

public class questao3 {
	
	static int[][] matriz (int[][] matriz) {
	int [][] matriz2 = new int[3][4];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = matriz[j][i];
			}
		}
		System.out.println("\n");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.printf("%3d ",matriz2[i][j]);
			}
			System.out.println("");
		}
		return matriz;
	}

	public static void main(String[] args) {
		int[][] matrizA = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.printf("%3d ",matrizA[i][j]);
			}
			System.out.println("");
		}
		int[][] matriz = matriz (matrizA);
	}

}
