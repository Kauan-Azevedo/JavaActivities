package questions;

public class CircleArea {
    private final float phi = (float) 3.1415;
    public static final String question = "1. \u00C1rea do C\u00EDrculo\r\n" + //
            "\u25CF Desenvolva um c\u00F3digo Java que solicite o raio de um c\u00EDrculo\r\n" + //
            "\u25CF Em seguida o c\u00F3digo deve calcular a \u00E1rea do c\u00EDrculo\r\n" + //
            "\u25CF Por fim deve apresentar para o usu\u00E1rio o resultado do c\u00EDrculo";

    public float calculate(float radius) {
        return this.phi * (radius * radius);
    }
}
