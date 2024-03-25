package Calculadora;
import Calculadora.Calculadora;

import java.util.Scanner;

public class menuCalculadora {
    static Scanner leer = new Scanner(System.in);

    public static void showMenu(){
        int op;
        do{
            System.out.println("Ingresa 1-Sumar, 2-Restar, 3-Multiplicar");
            System.out.print("Ingresa el valor: ");
            op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese los valor para la suma:");
                    System.out.print("Ingrese a: ");
                    int a = leer.nextInt();
                    System.out.print("Ingrese b: ");
                    int b = leer.nextInt();
                    System.out.println(Calculadora.sumar(a,b, true));
                    break;
                case 2:
                    //Calculadora.restar();
                    break;
                case 3:
                    //Calculadora.multi();
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }
        }while(op != 1 && op != 2 && op != 3);
    }

}
