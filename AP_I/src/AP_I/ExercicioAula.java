/**
 * 
 */
package AP_I;

import java.util.Scanner;

/**
 * @author rafae
 *
 */
public class ExercicioAula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- Digite a hora do alarme ---");
		System.out.println("Digite a Hora");
		int h = entrada.nextInt();
		System.out.println("Digite o Minuto");
		int m = entrada.nextInt();
		System.out.println("Digite o Segundo");
		int s = entrada.nextInt();
		entrada.close();
		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				for (int j2 = 0; j2 <= 59; j2++) {
					System.out.printf("%2d:%2d:%2d \n",i,j,j2);
					if(i==h && j == m && j2 == s) {
						System.out.println("ALARME");
						break;
					}
					
				}
				
				if(i==h && j == m) {
					break;
				}
				}
			
			if(i==h) {
				break;}

	}

}
}
