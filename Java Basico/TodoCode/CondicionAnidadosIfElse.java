public class CondicionAnidadosIfElse {
    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 25;

        System.out.println();
        if (num2 > num1) {
            System. out.println("El num2 es mayor al num1");
        }
        else{
            if(num1 == num2){
                System.out.println("Son iguales");
            }
            else{
                System.out.println("El num1 es mayor al num2");
            }
        }
        System.out.println();
    }
}
