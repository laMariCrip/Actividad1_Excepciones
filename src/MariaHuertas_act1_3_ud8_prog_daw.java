import java.util.Scanner;

public class MariaHuertas_act1_3_ud8_prog_daw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30};
        System.out.print("Introduce un índice (0 a 2): ");
        int indice = sc.nextInt();
        System.out.print("Introduce un divisor: ");
        int divisor = sc.nextInt();

        try {
            int resultado = numeros[indice] / divisor;
            System.out.println("Resultado: " + resultado);
        }catch (ArithmeticException e) {
            System.out.println("Error de división: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de longitud: " + e.getMessage());
        }finally {
            System.out.println("Operación finalizada");
            sc.close();
        }

    }
}