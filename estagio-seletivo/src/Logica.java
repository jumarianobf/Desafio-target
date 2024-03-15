public class Logica {
    public static void main(String[] args) {
        System.out.println("a) " + calcularSoma(7, 2));
        System.out.println("b) " + calcularProduto(64, 2));
        System.out.println("c) " + calcularQuadrado(6));
        System.out.println("d) " + calcularQuadrado(8));
        System.out.println("e) " + calcularSoma(8, 5));

        String numeros = "dois" + "dez" + "doze" + "dezesseis" + "dezessete" + "dezoito" + "dezenove";
        String primeiraLetra = String.valueOf(numeros.charAt(0));
        System.out.println("f) Todos os números que iniciam com a letra: " + primeiraLetra + " e então o próximo número será duzentos");
    }

    public static int calcularSoma(int a, int b) {
        return a + b;
    }
    public static int calcularProduto(int a, int b) {
        return a * b;
    }

    public static int calcularQuadrado(int a) {
        return a * a;
    }
}




