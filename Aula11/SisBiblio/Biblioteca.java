import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //BD em memória
    private List<Livro> acervo = new ArrayList<>();

    public void adicionar(Livro livro){
        acervo.add(livro);
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro livro : acervo) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void removerPorTitulo(String titulo){
        Livro livroRemove = pesquisarPorTitulo(titulo);
        if (livroRemove != null) {
            acervo.remove(livroRemove);
        }
    }

    public List<Livro> pesquisarTodos(){
        return this.acervo;
    }
    
}
