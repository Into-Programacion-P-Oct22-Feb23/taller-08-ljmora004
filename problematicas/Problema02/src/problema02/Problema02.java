package problema02;

public class Problema02 {

    public static void main(String[] args) {
        
        int numero = 25;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int contador;
        String mensaje = "";
        mensaje = mensaje + "N°\tx2\tx3\tx4\n";
        
        for(contador = 25; contador >= 1; contador--){
            numeroDos = numero * 2;
            numeroTres = numero * 3;
            numeroCuatro = numero * 4;
            mensaje = String.format("%s%d\t%d\t%d\t%d\n", mensaje,
                    numero, numeroDos, numeroTres, numeroCuatro);
            numero--;
            numeroDos--;
            numeroTres--;
            numeroCuatro--;
        }
        System.out.println(mensaje);   
    }
    
}
