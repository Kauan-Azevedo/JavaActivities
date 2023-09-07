package questions;

public class TwoNumbers {
    private float x;
    private float y;
    public static final String question = "3. Soma dois valores num\u00E9ricos\r\n" + //
            "\u25CF Cria um c\u00F3digo Java que solicite ao usu\u00E1rio dois n\u00FAmeros\r\n" + //
            "\u25CF Em seguida some os dois valores informados e apresente o resultado";

    public TwoNumbers(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float calculate() {
        return this.x + this.y;
    }
}
