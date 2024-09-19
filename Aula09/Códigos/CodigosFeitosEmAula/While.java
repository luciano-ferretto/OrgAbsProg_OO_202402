import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            String menu = """
                    Escolha uma das opções abaixo:
                    1 - Cadastrar Veículo
                    2 - Listar Veículos
                    0 - Sair
                    """;
            System.out.println(menu);
            opcao = ler.nextInt();
            ler.nextLine(); //Limpar buffer
        } while (opcao != 0);
    }
}
