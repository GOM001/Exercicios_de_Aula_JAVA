package ado_ap;

/* Exercício Switch-case 05, Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/
import java.util.Scanner;

public class switchEX09 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
// Define as váriaveis a serem usadas no algoritimo
        int d1;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        int d11;
        int soma, soma2;
        int resto, resto2;
        int passe;
 // Recebe os vaores das váriáveis
        System.out.println("Digite um a um os números do seu CPF");
        System.out.println("Digite o 1º digito: ");
        d1 = entrada.nextInt();
        System.out.println("Digite o 2º digito: ");
        d2 = entrada.nextInt();
        System.out.println("Digite o 3º digito: ");
        d3 = entrada.nextInt();
        System.out.println("Digite o 4º digito: ");
        d4 = entrada.nextInt();
        System.out.println("Digite o 5º digito: ");
        d5 = entrada.nextInt();
        System.out.println("Digite o 6º digito: ");
        d6 = entrada.nextInt();
        System.out.println("Digite o 7º digito: ");
        d7 = entrada.nextInt();
        System.out.println("Digite o 8º digito: ");
        d8 = entrada.nextInt();
        System.out.println("Digite o 9º digito: ");
        d9 = entrada.nextInt();
        System.out.println("Digite o 10º digito: ");
        d10 = entrada.nextInt();
        System.out.println("Digite o 11º digito: ");
        d11 = entrada.nextInt();
        entrada.close();
// incia operação de soma e multiplicação
        soma = d1*10+d2*9+d3*8+d4*7+d5*6+d6*5+d7*4+d8*3+d9*2;
        resto = (soma * 10) % 11;
                
        if (resto == d10){
            passe = 1;
        }
        else if (resto == 10){
            passe = 1;
        }
        else if(d1==d2&&d2==d3&&d3==d4&&d4==d5&&d5==d6&&d6==d7&&d7==d8&&d8==d9&&d9==d10&&d10==d11){
        	passe = 0;	
        }
        else {
        	passe = 0;
        }
        
        soma2 = d1*11+d2*10+d3*9+d4*8+d5*7+d6*6+d7*5+d8*4+d9*3+d10*2;
    	resto2 = (soma2 * 10) %  11;
    	
        switch (passe) {
        case 1:
        	if(resto2 == d11) {
        		System.out.println("CPF "+d1+d2+d3+"."+d4+d5+d6+"."+d7+d8+d9+"-"+d10+d11+" É Válido");
        	}
        	else {
        		System.out.println("CPF "+d1+d2+d3+"."+d4+d5+d6+"."+d7+d8+d9+"-"+d10+d11+ " É Inválido: Para ser válido deveria ser: "+d1+d2+d3+"."+d4+d5+d6+"."+d7+d8+d9+"-"+resto+resto2);
        	}
        	break;
        default:
        	System.out.println("CPF "+d1+d2+d3+"."+d4+d5+d6+"."+d7+d8+d9+"-"+d10+d11+ " Inválido: Para ser válido deveria ser: "+d1+d2+d3+"."+d4+d5+d6+"."+d7+d8+d9+"-"+resto+(resto2+1));
        }
        
        
    }
    
}
