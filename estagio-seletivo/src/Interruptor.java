public class Interruptor {
    public static final boolean LIGADO = true;
    public static final boolean DESLIGADO = false;

    public static void main(String[] args) {
        boolean[] interruptores = {DESLIGADO, DESLIGADO, DESLIGADO};
        boolean[] lampadas = {DESLIGADO, DESLIGADO, DESLIGADO};

        ligarInterruptor(interruptores, 0);
        System.out.println("Primeira ida: Lâmpada 1 acesa.");

        desligarInterruptor(interruptores, 0);
        ligarInterruptor(interruptores, 1);
        System.out.println("Segunda ida: Lâmpada 2 acesa.");


        lampadas[0] = interruptores[0];
        lampadas[1] = interruptores[1];
        lampadas[2] = interruptores[2];

        // Exibe o resultado
        System.out.println("O interruptor da lâmpada 1 é o interruptor " + (lampadas[0] ? "1" : "2"));
        System.out.println("O interruptor da lâmpada 2 é o interruptor " + (lampadas[1] ? "1" : "2"));
        System.out.println("O interruptor da lâmpada 3 é o interruptor " + (lampadas[2] ? "1" : "2"));
    }
    public static void ligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = LIGADO;
    }
    public static void desligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = DESLIGADO;
    }
}
