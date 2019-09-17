package ado_ap;
/* Exercício Switch-case 05, Algoritimos e lógica de programação TADS turma B
* @author pedro.rsgomes1
*/
import java.util.Scanner;
public class switchEX08 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double valorAssociacao;
	double f;
	int mes;
	System.out.println("Calcula o valor da multa anual de uma associação");
	System.out.println("Digite o valor da associação: ");
	valorAssociacao = entrada.nextDouble();
	System.out.println("Digite o mês numérico (xx): ");
	mes = entrada.nextInt();
	entrada.close();
	switch(mes) {
		case 1:
			f = valorAssociacao*(Math.pow((1 + 0.05), 12));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 2:
			f = valorAssociacao*(Math.pow((1 + 0.05), 11));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 3:
			f = valorAssociacao*(Math.pow((1 + 0.05), 10));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 4:
			f = valorAssociacao*(Math.pow((1 + 0.05), 9));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 5:
			f = valorAssociacao*(Math.pow((1 + 0.05), 8));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 6:
			f = valorAssociacao*(Math.pow((1 + 0.05), 7));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 7:
			f = valorAssociacao*(Math.pow((1 + 0.05), 6));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 8:
			f = valorAssociacao*(Math.pow((1 + 0.05), 5));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 9:
			f = valorAssociacao*(Math.pow((1 + 0.05), 4));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 10:
			f = valorAssociacao*(Math.pow((1 + 0.05), 3));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 11:
			f = valorAssociacao*(Math.pow((1 + 0.05), 2));
			System.out.println("O valor da multa é de: " + f);
			break;
		case 12:
			f = valorAssociacao*(Math.pow((1 + 0.05), 1));
			System.out.println("O valor da multa é de: " + f);
			break;
		default:
			System.out.println("Mês Inválido: ");
	}		
	}

}
