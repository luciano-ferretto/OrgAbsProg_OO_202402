import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.println("Informe seu gênero (M, F, N)");
        String generoStr = lerTeclado.nextLine();
        char genero = generoStr.charAt(0);
        //char genero = lerTeclado.nextLine().charAt(0);
        
        System.out.println("Digite sua altura: ");
        double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //limpar buffer

        System.out.println("Digite seu peso: ");
        double peso = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //limpar buffer

        double imc = peso / (altura * altura);
        //double imc = peso / Math.pow(altura, 2);

        if (genero == 'M') {
            if (imc >= 40) {
                System.out.println("Obesidade Mórbida");
            } else if (imc >= 30) {
                System.out.println("Obesidade Moderada");
            } else if (imc >= 25) {
                System.out.println("Obesidade Leve");
            } else if (imc >= 20) {
                System.out.println("Normal");
            } else {
                System.out.println("Abaixo do Normal");
            }
        } else if (genero == 'F' || genero == 'N') {
            if (imc >= 39) {
                System.out.println("Obesidade Mórbida");
            } else if (imc >= 29) {
                System.out.println("Obesidade Moderada");
            } else if (imc >= 24) {
                System.out.println("Obesidade Leve");
            } else if (imc >= 19) {
                System.out.println("Normal");
            } else {
                System.out.println("Abaixo do Normal");
            }
        } else {
            System.out.println("Gênero informado inválido");
        }
    }
}