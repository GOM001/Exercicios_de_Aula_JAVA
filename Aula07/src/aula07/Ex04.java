package aula07;

import java.util.Scanner;

/**
 *
 * @author pedro.rsgomes1
 */
public class Ex04 {

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        double valor;
        double soma = 0;
        int x = 1, positivos = 0;
        System.out.println("--- Soma, média e  positivos por laço "
                + "de repetição---");
        while(x <= 6){
            System.out.println("Digite o "+x+"º: valor ");
            valor = entrada.nextDouble();
            if (valor > 0){
                positivos++;
            }
            soma = (soma + valor);
            x++;
       }
        entrada.close();
        System.out.println("A soma dos valores digitádos é = "+soma);
        System.out.println(positivos+" Números possitivos");
        System.out.println("A média dos valores digitádos é = "+(soma/(x-1)));
    }
}
