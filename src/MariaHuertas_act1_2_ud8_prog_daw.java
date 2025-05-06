import java.util.Scanner;

public class MariaHuertas_act1_2_ud8_prog_daw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("El número introducido es: " + numero);
        }catch (Exception e) {
            System.out.println("Error genérico: ese número no es válido!");
        }finally {
            System.out.println("Gracias por usar el programa");
            sc.close();
        }

    } //end main
}//end class