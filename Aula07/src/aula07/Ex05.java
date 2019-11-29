package aula07;
import java.util.Scanner;
/**
 *
 * @author pedro.rsgomes1
 */
public class Ex05 {

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n,x = 0;
        System.out.println("--- ´Imprime tabuada do Número escolhido ---");
        System.out.println("Digite o número de referência ");
        n = entrada.nextInt();
        if (n >=2 && n <= 1000){   
            do {
                System.out.println(x+" x "+n+" = "+(x*n));
                x++;
            } while (x<=10);
        }
        else{
            System.err.println("Número inválido");
        }
    }
}
