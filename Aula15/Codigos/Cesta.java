public class Cesta {
    private Object[] itens;
    private int tamanhoAtual;
    
    
    // Construtor para inicializar a cesta com um tamanho fixo
    public Cesta(int capacidade) {
        itens = new Object[capacidade];
        tamanhoAtual = 0;
    }
    // Método para inserir um objeto na cesta
    public void inserir(Object o) {
        if (tamanhoAtual < itens.length) {
            itens[tamanhoAtual++] = o;
        } else {
            System.out.println("Cesta cheia! Não é possível adicionar mais itens.");
        }
    }
    // Método para obter o último objeto adicionado na cesta e removê-lo (LIFO)
    public Object getProximo() {
        if (tamanhoAtual > 0) {
            Object item = itens[--tamanhoAtual];
            itens[tamanhoAtual] = null; // Remove referência para permitir garbage collection
            return item;
        } else {
            System.out.println("Não há mais itens na cesta.");
            return null;
        }
    }
    // Método para verificar se existem itens na cesta
    public boolean exiteItens() {
        return tamanhoAtual > 0;
    }
}



