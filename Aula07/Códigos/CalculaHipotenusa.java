import java.util.Scanner;

public class CalculaHipotenusa {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Cateto A: ");
        double catetoA = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //Limpar buffer
        System.out.print("Cateto B: ");
        double catetoB = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //Limpar buffer
        catetoA = catetoA * catetoA;
        catetoB = Math.pow(catetoB, 2);
        double hipotenusa = Math.sqrt(catetoA + catetoB);
        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
