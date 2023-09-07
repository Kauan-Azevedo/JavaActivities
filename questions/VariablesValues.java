package questions;

import java.util.concurrent.TimeUnit;

public class VariablesValues {
    public static final String question = "4. Troque o valor das vari\u00E1veis\r\n" + //
            "\u25CF Escreva um c\u00F3digo em Java que solicite ao usu\u00E1rio dois n\u00FAmeros\r\n" + //
            "\u25CF Em seguida apresente para o usu\u00E1rio o valor do primeiro e segundo\r\n" + //
            "n\u00FAmero.\r\n" + //
            "\u25CF Depois troque os valores de cada vari\u00E1vel, se a vari\u00E1vel \"a\" recebeu o\r\n" + //
            "n\u00FAmero 5, e a vari\u00E1vel \"b\" recebeu o n\u00FAmero 4, agora a vari\u00E1vel \"a\" deve\r\n" + //
            "valer 4 e a vari\u00E1vel \"b\" deve valor 5.\r\n" + //
            "\u25CF Por fim apresente o resultado da troca ao usu\u00E1rio.";
    public String a;
    public String b;
    private String temp;

    public void printVariables() {
        System.out.println("Valor da variavel 'a': " + this.a);
        System.out.println("Valor da variavel 'b': " + this.b);
    }

    public void changeValues() throws InterruptedException {
        this.printVariables();

        System.out.println("Trocando Valores.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Trocando Valores..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Trocando Valores...");
        TimeUnit.SECONDS.sleep(1);

        temp = a;
        a = b;
        b = temp;

        this.printVariables();
    }
}
