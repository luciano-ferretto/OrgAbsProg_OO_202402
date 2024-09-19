import java.util.Scanner;

public class ForTradicional5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 1;
        for( ; ; ){
            System.out.println("Digite S para sair ");
            char letra = ler.next().charAt(0);
            
            if (letra == 'S'){
                break;
            } else if (letra == 'C') {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}


