import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Biblioteca biblio = new Biblioteca();
    static Scanner input = new Scanner(System.in);

    public static void limparTela() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void aguardarEnter() {
        System.out.println("Pressione Enter para continuar...");
        input.nextLine();
    }

    private static int inputNumerico(String mensagem) {
        int valor = 0;
        boolean entradaValida = false;
        System.out.println(mensagem);
        do {
            String valorStr = input.nextLine();
            try {
                valor = Integer.parseInt(valorStr);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Erro. Por favor informe um número Inteiro");
            }
        } while (!entradaValida);
        return valor;
    }

    private static void listar() {
        limparTela();
        // List<Livro> livros = biblio.pesquisarTodos();
        var livros = biblio.pesquisarTodos();
        livros.sort(Comparator.comparing(Livro::getTitulo));

        System.out.println("======== LISTA DE LIVROS =========");
        for (Livro livro : livros) {
            //System.out.println(livro);
            System.out.println(livro.toString());
            System.out.println("------------------------------------");
        }
        aguardarEnter();
    }

    private static void adicionar() {
        limparTela();
        Livro novoLivro;
        System.out.println("======== ADICIONANDO NOVO LIVRO ========");
        int tipoLivro = inputNumerico("Qual o tipo de livro: (1) Físico - (2) Digital");
        if (tipoLivro == 1) {
            novoLivro = new LivroFisico();
        } else if (tipoLivro == 2) {
            novoLivro = new LivroDigital();
        } else {
            novoLivro = new Livro();
        }
        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();
        novoLivro.setTitulo(titulo);

        System.out.print("Informe o nome do autor: ");
        novoLivro.setAutor(input.nextLine());

        int ano = inputNumerico("Informe o ano de publicação: ");
        novoLivro.setAnoPublicacao(ano);

        int nPaginas = inputNumerico("Informe o número de páginas: ");
        novoLivro.setnPaginas(nPaginas);

        if (tipoLivro == 1) {
            int nExemplares = inputNumerico("Informe o nº de exemplares: ");
            ((LivroFisico) novoLivro).setnExemplares(nExemplares);
            System.out.println("Digite as dimensões: ");
            String dimensoes = input.nextLine();
            ((LivroFisico) novoLivro).setDimensoes(dimensoes);
        } else if (tipoLivro == 2){
            System.out.println("Digite o formato do arquivo: ");
            String formatoArquivo = input.nextLine();
            ((LivroDigital) novoLivro).setFormatoArquivo(formatoArquivo);
        }

        try {
            biblio.adicionar(novoLivro);
            System.out.println("Livro adicionado com Sucesso!");
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        aguardarEnter();
    }

    private static void pesquisarPorTitulo() {
        limparTela();
        System.out.println("====== PESQUISAR LIVROS ======");
        System.out.print("Insira o titulo do livro: ");
        String titulo = input.nextLine();
        var livros = biblio.pesquisar(titulo);
        if (livros.isEmpty())
            System.out.println("Não foram encontrados livros com esta pesquisa.");
        else {
            for (Livro livro : livros) {
                System.out.println("-----------------");
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano :" + livro.getAnoPublicacao());
                System.out.println("N. Páginas: " + livro.getnPaginas());
            }
        }
        aguardarEnter();
    }
    
    private static void removerPorTitulo() {
        limparTela();
        System.out.println("====== EXCLUIR LIVRO ======");
        System.out.print("Insira o titulo do livro: ");
        String titulo = input.nextLine();
        try {
            biblio.removerPorTitulo(titulo);
            System.out.println("Livro removido com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        aguardarEnter();
    }

    public static void main(String[] args) {

        String menu = """
                SISTEMA DE GERENCIAMENTO DE BIBLIOTECA
                Escolha uma das opções:
                1 - Adicionar novo livro;
                2 - Listar todos os livros;
                3 - Pesquisar livro;
                4 - Remover livro;
                0 - Sair;
                """;
        int opcao;
        do {
            // System.out.println(menu);
            // opcao = input.nextInt();
            // input.nextLine(); // limpar buffer
            limparTela();
            opcao = inputNumerico(menu);
            switch (opcao) {
                case 0:
                    System.out.println("VOLTE SEMPRE!!!");
                    break;
                case 1:
                    adicionar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    pesquisarPorTitulo();
                    break;
                case 4:
                    removerPorTitulo();
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    input.nextLine();
                    break;
            }
        } while (opcao != 0);
    }
}
