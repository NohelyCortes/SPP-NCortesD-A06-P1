//Nohely Monserrat Cortés del Ángel
//A01410768
//IMT
package spp.ncortesd.a06;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortesDA06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora();
    }
    static int pedirDatos(){
        int numero;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce un número entero");
        numero= kb.nextInt();
        return numero;
    }
    static void calculadora(){
        int suma=0;
        while(pedirDatos()>-1)
        {
            suma=suma+pedirDatos();
        
        }
    System.out.println("La suma de todos los positivos es" + suma);    
    }
}
