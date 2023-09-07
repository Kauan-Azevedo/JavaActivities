package questions;

public class PesonnalInfos {
    public static final String question = "2. Informa\u00E7\u00F5es Pessoais\r\n" + //
            "\u25CF Crie um c\u00F3digo em Java que solicite as seguintes informa\u00E7\u00F5es:\r\n" + //
            "\u25CB Nome do funcion\u00E1rio\r\n" + //
            "\u25CB Idade do funcion\u00E1rio\r\n" + //
            "\u25CB Sal\u00E1rio do funcion\u00E1rio\r\n" + //
            "\u25CF Em seguida apresente as informa\u00E7\u00F5es coletadas";

    private String name;
    private int age;
    private float salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void displayInfos() {
        System.out.println(
                "+========---------- FICHA DO FUNCIONARIO ----------========+" + "\n" +
                        "| Nome: " + this.name + "\n" +
                        "| Idade: " + this.age + "\n" +
                        "| Salario: " + this.salary + "\n" +
                        "+========----------------- FIM -----------------========+");
    }
}
