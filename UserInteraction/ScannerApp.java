/**
 * ScannerApp
 */
import java.util.Scanner;

public class ScannerApp {

    static public void main(String[] argsv){
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Você tem "+ idade +" anos.");
    }
}