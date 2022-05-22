
package suma3;
import java.util.Scanner;
public class Suma3 {

    public static void main(String[] args) {
        int A, B, resultado; //variables que se usaran
        
        Scanner entrada = new Scanner(System.in);//crea el objeto para meter datos
        System.out.println("Inserte el primer valor");//sirve para imprimir datos
        A = entrada.nextInt(); //sirve para que el dato se guarde en la variable A
        
        System.out.println("Inserte el segundo valor");
        B = entrada.nextInt();
        resultado = A+B;
        System.out.println("El resultado de "+A+" + "+B+" es: "+resultado);
    }
    
}
