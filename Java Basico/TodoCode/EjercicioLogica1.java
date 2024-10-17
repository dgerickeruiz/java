public class EjercicioLogica1 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que permita el intercambio de valores entre dos variables.
         * Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
         * realizar las acciones necesarias para que numero pase a valer 20 y numero2
         * pase a valer 35. Una vez realizado el cambio mostrar
         * el resultado por pantalla.
         * 
         */
        int num1=35, num2=20, aux;
        System.out.println();
        System.out.println("=====================Antes======================");
        System.out.println("Variable num1: " + num1+", Varibale num2: "+num2);
        System.out.println("================================================");
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println();
        System.out.println("=====================Despues====================");
        System.out.println("Variable num1: " + num1+", Varibale num2: "+num2);
        System.out.println("================================================");
        System.out.println();
    }
}
