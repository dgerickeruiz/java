import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args){
        
        double promedio;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);

        // operador ternario:
        // variable = (condicion) ? valor_si_verdadero : valor_si_falso;

        System.out.println("Ingrese el promedio general del alumno en TodoCode");
        promedio = teclado.nextDouble();

        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condicion final del alumno es:" + condicionFinal);
        teclado.close();
    }
}