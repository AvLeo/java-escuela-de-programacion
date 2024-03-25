// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Calculadora.Calculadora;
import Calculadora.menuCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la libreta de contactos: ");
        int cantidadContactos = leer.nextInt();


        String[] nombres = new String[cantidadContactos];
        // ["Hola","Chau","!"]
        //    0      1     2



        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Numero :" + i;
            System.out.println("N°: " + nombres[i]);
        }
        // Calculadora

    }



    /*
    1- Menu inicial
            -Calculadora
                    * Sumar
                    * Restar
                    * MOD
            - Enviar mensaje de Bienvenida

            - Calcular Area de un



     */
}