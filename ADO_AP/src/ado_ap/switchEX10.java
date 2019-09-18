package ado_ap;

/* Exercício Switch-case 10 Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/
import java.util.Scanner;

public class switchEX10 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
// Define as váriaveis a serem usadas no algoritimo
        double n1;
        double n2;
        String caracter;
 // Recebe os vaores das váriáveis
        System.out.println("Faz calculos simples");
        System.out.println("Digite o 1º Número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o Operador (+, -, *, ou /) ");
        caracter = entrada.next();
        System.out.println("Digite o 2º digito: ");
        n2 = entrada.nextInt();
        entrada.close();
// incia operação de soma e multiplicação
        switch (caracter) {
        case("+"):
            System.out.println("A Soma de "+n1+" + "+n2+" = "+(n1+n2));
            break;
        case("-"):
            System.out.println("A Subtração de "+n1+" - "+n2+" = "+(n1-n2));
            break;
        case("*"):
            System.out.println("A Multiplicação de "+n1+" * "+n2+" = "+(n1*n2));
            break;
        case("/"):
            System.out.println("A Divisão de "+n1+" / "+n2+" = "+(n1/n2));
            break;
        default:
            System.out.println("Valoe Inválido");
        }
        
        
    }
    
}
