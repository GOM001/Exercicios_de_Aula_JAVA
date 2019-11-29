package aula07;
/**
 *
 * @author pedro.rsgomes1
 */
public class Ex01 {

    public static void main(String[] args) { 
        System.out.println("--- Mostra números pares de 0 até 100");
        int x = 0;
        while(x <= 100){
           if ((x % 2)==0){
               System.out.print(x+", ");
           }
           x++;
       }
    }
}
