import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Lutador lutador1 = new Lutador("Rocky Balboa", "americana", 29, 1.77, 80, 10, 2, 3);
        Lutador lutador2 = new Lutador("Apollo Creed", "americana", 32, 1.88, 80, 25, 1, 4);
        Lutador lutador3 = new Lutador("Ivan Drago", "russa", 32, 1.93, 110, 50, 0, 7);


        lutador1.apresentar();
        lutador3.apresentar();
        Luta luta1 = new Luta();
        luta1.marcarLuta(lutador1, lutador3);
        luta1.lutar(lutador1, lutador3);

    }

}
