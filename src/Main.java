/** 1. El programa debe mostrar un **menú interactivo** que permita al usuario elegir entre las siguientes opciones:
        - Convertir de **Celsius a Fahrenheit**
        - Convertir de **Fahrenheit a Celsius**

        2. Según la opción elegida, debe solicitar el valor numérico a convertir y aplicar la fórmula adecuada:

        - Fahrenheit = (Celsius × 9/5) + 32
        - Celsius = (Fahrenheit − 32) × 5/9

        3. Mostrar la temperatura convertida con **1 decimal de precisión**, acompañado del texto explicativo.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es la temperatura?");
        double temp = sc.nextDouble();


        System.out.println("¿Qué tipo de conversión desea realizar?: \n1) Celsius a Farenheit \n2) Fahrenheit a Celsius ");
        int tipo = sc.nextInt();

            switch (tipo) {
                case 1:
                    System.out.println("La temperatura en Farenheit es de " + ((temp * 1.8) + 32) + "°F");
                    break;
                case 2:
                    System.out.println("Fahrenheit a Celsius es de " + ((temp -32) / 1.8 ) + "°C");
                    break;
            }
            sc.close();
    }
}