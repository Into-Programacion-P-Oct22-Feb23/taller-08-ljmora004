package problema01;

import java.util.Scanner;
import java.util.Locale;

public class Problema01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int veces;
        int contador;
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String mensaje = "";
        
        System.out.println("Ingrese el número de jugadores a los que "
                + "ingresará información: ");
        veces = entrada.nextInt();
        
        for(contador = 1; contador <= veces; contador++ ){
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            
            mensaje = String.format("%s%d. %s -%s-, edad %d, estatura %.2f"
                    + "\n", mensaje, contador, nombre, posicion,
            edad, estatura);
        }
        
        System.out.println("\n" + mensaje);
    }
    
}
