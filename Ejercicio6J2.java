import java.util.Random;
import java.util.Scanner;

public class Ejercicio6J2 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner sc = new Scanner(System.in);
        Random Aleatoreo = new Random();
        double contador = 0;
        double contador2 = 0;
        int[] edades = new int[100];
        // este primero for crea edades al azar dentro dedl rango de 1 a 75 años que
        // asumen ser las 100 personas registradas
        for (int i = 1; i < 100; i++) {
            edades[i] = Aleatoreo.nextInt(75) + 1;
        // este for hace el recorrido para saber si son mayores o menores de 25 años    
            for (int j = 0; j < 100; j++) {
                if (edades[j] >= 25) {
                    contador = contador + 1;
                } else {
                    contador2 = contador2 + 1;
                }
            }
        }
        // imprime el contador y lo divide en 100 para sacar el promedio de las personas
        System.out.println("Promedio de personas con mayor de 25 años " + (contador / 100));
        System.out.println("Promedio de personas con menor de 25 años " + (contador2 / 100));
    }
}