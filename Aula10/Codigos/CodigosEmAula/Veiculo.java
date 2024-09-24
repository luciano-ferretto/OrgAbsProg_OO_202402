import java.time.LocalDate;

class Veiculo {
    String marca;
    String modelo;
    int ano;
    String placa;
    public Veiculo() {
        //Método construtor padrão
    }
    public Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    Veiculo cloneFromOther(Veiculo veiculoOrigem) {
        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.marca = veiculoOrigem.marca;
        novoVeiculo.modelo = veiculoOrigem.modelo;
        novoVeiculo.ano = veiculoOrigem.ano;
        novoVeiculo.placa = veiculoOrigem.placa;
        return novoVeiculo;
    }
    //Abaixo temos um exemplo de "clone" errado
    // Pois temos a atribuição por referência
    // Nesse caso o objeto que é recebido por parâmetro
    // é o mesmo retornado (return)
    Veiculo cloneFromOtherWrong(Veiculo veiculoOrigem) {
        Veiculo novoVeiculo = veiculoOrigem;
        return novoVeiculo;
    }

    Veiculo cloneMe() {
        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.marca = this.marca;
        novoVeiculo.modelo = this.modelo;
        novoVeiculo.ano = this.ano;
        novoVeiculo.placa = this.placa;
        return novoVeiculo;
    }


    int calcularTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        return this.calcularTempoUso(anoAtual);
    }

    int calcularTempoUso(int anoBase) {
        int tempoUso = anoBase - this.ano;
        return tempoUso;
    }
}