package aula07;
/**
 *
 * @author pedro.rsgomes1
 */
public class ExFor02 {

    public static void main(String[] args) { 
        System.out.println("---Mostra números impares de 0 até 100---");
        for(int x =0; x <= 100; x++){
           if ((x % 2)==1){
               System.out.println(x);
           }
       }
    }
}
