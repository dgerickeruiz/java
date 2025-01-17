public class RepetitivasDos {
    public static void main(String[] args){
        
        //ejemplo 1: es infinito
        /* 
        int cont = 0;
        while (cont <= 10){
            System.out.println("Estoy en la vuelta " + cont);
            //cont = cont + 1;
        }*/

        boolean centinela = true;

        while (centinela == true) {
            System.out.println("El valir de la bandera es " + centinela);
            // Si centinela no cambia a false, el bucle se hace infinito
            centinela = false;
        }
    }
}