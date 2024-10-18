public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        int a = 4;
        int b = 0;
        int resultado = 0;
        try {
            resultado = divisao (a, b);

        } catch (Exception e) {
            System.out.println("Erro!");
        }

        System.out.println(resultado);
    }
    public static int divisao(int a, int b) {
        return a / b;
    }
}