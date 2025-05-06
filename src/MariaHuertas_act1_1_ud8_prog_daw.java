import java.util.Scanner;

public class MariaHuertas_act1_1_ud8_prog_daw {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = 10; int b;
            System.out.println("Introduce un número para dividir 10 entre él: ");
            b = sc.nextInt();

            try {
                int resultado = a / b;
                System.out.println("Resultado: " + resultado); //se mu

            }catch(ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre 0");   //se muestra si hay una excepcion de tipo aritmetico

            } finally {
                System.out.println("Fin del programa");   //se muestra siempre
                sc.close();
            }

    }//end main
}  //end class