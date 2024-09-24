import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //aqui estou usando o método construtor com parâmetros
        Veiculo marea = new Veiculo("Ford", "Marea", 1990, "DEF-5555");
        //aqui estou usando o método construtor PADRÃO
        Veiculo uno = new Veiculo();
        uno.marca = "Fiat";
        uno.modelo = "Uno Mille";
        uno.ano = 1998;
        uno.placa = "ABC-1234";

        //Veiculo novoUno = uno;
        //novoUno.ano = 2005;
        //System.out.println("Velho uno: " + uno.ano);
        //System.out.println("Novo uno: " + novoUno.ano);


        Veiculo fusca;
        fusca = new Veiculo();
        fusca.marca = "Volskwagem";
        fusca.modelo = "Fusca série ouro";
        fusca.ano = 1995;
        fusca.placa = "DEF-5678";

        //int anoAtual = LocalDate.now().getYear();
        int tempoUsoUno = uno.calcularTempoUso();
        System.out.println("Tempo de Uso do Uno: " + tempoUsoUno);

        System.out.println("Tempo de Uso do Fusca: " + fusca.calcularTempoUso());
        System.out.println("Tempo de Uso do Fusca em 2030: " + fusca.calcularTempoUso(2030));


        Veiculo uno2 = uno.cloneMe();
        System.out.println("");
    }
}
