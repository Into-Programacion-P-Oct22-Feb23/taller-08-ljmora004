package problema03;

public class Problema03 {

    public static void main(String[] args) {

        int contador;
        double fahrenheit = 20;
        double celcius = 0;
        String mensaje = "";
        mensaje = mensaje + "F°\tC°\n";

        for (contador = 1; contador <= 20; contador ++) {
            celcius = (fahrenheit - 32) * 5/9;
            mensaje = String.format("%s%.2f\t%.2f\n", mensaje,
                    fahrenheit, celcius);
            fahrenheit += 4;
        }
        System.out.println(mensaje);
    }

}
