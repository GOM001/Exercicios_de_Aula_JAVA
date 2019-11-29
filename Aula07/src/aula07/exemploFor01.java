package aula07;

import java.util.Scanner;

/**
 *
 * @author pedro.rsgomes1
 */

public class exemploFor01 {
    public static void main(String[] args) {
        int x, soma = 0;
        Scanner entrada = new Scanner(System.in);
        for(int i =0; i < 10; i++){
            System.out.println("Digite o item " + i);
            x = entrada.nextInt();
            soma = soma + x;
        }
        System.out.println("Total: " + soma);
    }
    
}
