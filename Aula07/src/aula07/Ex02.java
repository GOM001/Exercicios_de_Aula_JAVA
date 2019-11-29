package aula07;
/**
 *
 * @author pedro.rsgomes1
 */
public class Ex02 {

    public static void main(String[] args) { 
        System.out.println("--- Mostra números impares de 0 até 100");
        int x = 0;
        while(x <= 100){
           if ((x % 2)==1){
               System.out.println(x);
           }
           x++;
       }
    }
}
