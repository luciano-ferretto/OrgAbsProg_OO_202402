public class OpCurtoCircuito {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 0;
        if (var2 > 0 && var1 % var2 == 0) {
            System.out.println("var2 é fator de var1");
        } else {
            System.out.println("NÃO é fator");
        }
    }
}
