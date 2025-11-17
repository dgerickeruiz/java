import java.util.Scanner;

public class EjercicioIntegrador2 {

    public static void main(String[] args) {
        /*
        * Realizar un programa que permita cargar 15 numeros en un vector. Una vez
        * cargados, se necesita que el programa cuente e informe por pantalla cuántas
        * veces se cargó el número 3
        */

        int vector[] = new int[15];

        Scanner teclado = new Scanner(System.in);
    
        //cargar nuestro vector
        for(int i=0; i<15; i++){
            System.out.println("Ingrese un numero para el vector");
            vector[i] = teclado.nextInt();
        }

        //recorrer y contar cuantos numeros 3 hay
        int contador = 0;

        for(int i = 0; i<15; i++){
            if(vector[i] == 3){
                contador = contador +1;
            }
        }

        System.out.println("La cantidad de numeros 3 que hay en el vector es de: " + contador);

    }
    
}
