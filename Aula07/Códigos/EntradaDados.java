import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = lerTeclado.nextLine();
        System.out.println("Digite sua idade:");
        int idade = lerTeclado.nextInt();
        lerTeclado.nextLine();
        // Após nextInt(), nextDouble(), e outros
        //  invocar o método nextLine() para limpar o buffer
        System.out.println("Nome: " + nome + " - Idade: " + idade);
        lerTeclado.close();
    }
}
