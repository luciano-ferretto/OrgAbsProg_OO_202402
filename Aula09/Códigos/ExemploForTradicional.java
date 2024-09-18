public class ExemploForTradicional {
    public static void main(String[] args) {
        /* Nesta estrutura exite a declaração de uma variável "i",
         *     do tipo "int" e é inicializada com o valor 1 (um)
         * A cada loop haverá o incremento de "+ 1" (mais um)
         *     na variável "i"
         * O loop ficará ativo enquanto a variável "i" for menor ou igual
         *     à 100 (100), ou seja, nesse caso o loop será executado
         *     100 vezes*/
        for (int i = 1; i < 100; i++) {
            double raiz = Math.sqrt(i);
            System.out.println("A raiz quadrada de " + i + " é: " + raiz);
        }

        
    }
}


