public class MainEncapsulamento {
    public static void main(String[] args) {
        VeiculoComEncapsulamento palio = new VeiculoComEncapsulamento();
        palio.setMarca("Fiat");
        palio.setModelo("Palio ELX");
        palio.setAno(2005);
        palio.setPlaca("ABC-1234");
        System.out.println("A placa é: " + palio.getPlaca());
    }
}
