package aula07;
/**
 *
 * @author pedro.rsgomes1
 */
public class ExFor01 {

    public static void main(String[] args) { 
        System.out.println("--- Mostra números pares de 0 até 100");
        for(int x = 0; x <= 100; x++){
           if ((x % 2)==0){
               System.out.print(x+", ");
           }
       }
    }
}
