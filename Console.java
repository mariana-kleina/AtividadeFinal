import java.util.Scanner;

public class Console {
    private static Scanner leitor = new Scanner(System.in);

    // Lê um número inteiro do usuário
    public static int lerInt() {
        while (!leitor.hasNextInt()) {
            System.out.println("Por favor, digite um número inteiro.");
            leitor.next();
        }
        int valor = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer
        return valor;
    }

    // Lê uma string do usuário
    public static String lerString() {
        return leitor.nextLine();
    }
}
