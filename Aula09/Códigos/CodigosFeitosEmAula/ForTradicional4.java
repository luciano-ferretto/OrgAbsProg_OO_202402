import java.util.Scanner;

public class ForTradicional4 {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        for (int i = 1; ler.next().charAt(0) != 's'; i++){
            System.out.println("Entrou " + i + " vezes");
        }
    }
}
