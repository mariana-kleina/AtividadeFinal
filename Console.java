import java.util.Scanner;

public class Console {
    private static Scanner leitor = new Scanner(System.in);

   
    public static int lerInt() {
        while (!leitor.hasNextInt()) {
            System.out.println("Por favor, digite um número inteiro.");
            leitor.next();
        }
        int valor = leitor.nextInt();
        leitor.nextLine(); 
        return valor;
    }

    
    public static String lerString() {
        return leitor.nextLine();
    }
}
