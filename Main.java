import java.util.Scanner;

import questions.CircleArea;
import questions.PesonnalInfos;
import questions.TwoNumbers;
import questions.VariablesValues;

class Main {
    public void question01() throws Exception {
        Scanner input = new Scanner(System.in);
        CircleArea question01 = new CircleArea();
        float radius;

        try {
            System.out.println(CircleArea.question);
            System.out.print("Digite o valor do raio: ");
            radius = input.nextFloat();

        } catch (Exception e) {
            throw new Exception("Ocorreu um erro", e);
        } finally {
            input.close();
        }

        System.out.println("Valor da area: " + question01.calculate(radius) + " m");

    }

    public void question02() throws Exception {
        Scanner input = new Scanner(System.in);
        PesonnalInfos infos = new PesonnalInfos();

        try {
            System.out.println(PesonnalInfos.question);

            System.out.print("Nome do funcionario: ");
            infos.setName(input.next());

            System.out.print("Idade do funcionario: ");
            infos.setAge(input.nextInt());

            System.out.print("Salario do funcionario: ");
            infos.setSalary(input.nextFloat());

        } catch (Exception e) {
            throw new Exception("Ocorreu um erro!", e);
        } finally {
            input.close();
        }

        infos.displayInfos();
    }

    public void question03() throws Exception {
        Scanner input = new Scanner(System.in);
        float x;
        float y;

        try {
            System.out.println(TwoNumbers.question);

            System.out.print("Valor de X: ");
            x = input.nextFloat();

            System.out.print("Valor de Y: ");
            y = input.nextFloat();

            TwoNumbers question = new TwoNumbers(x, y);
            System.out.println("Resultado: " + question.calculate());

        } catch (Exception e) {
            throw new Exception("Ocorreu um erro", e);
        } finally {
            input.close();
        }
    }

    public void question04() throws Exception {
        Scanner input = new Scanner(System.in);
        VariablesValues question = new VariablesValues();

        try {
            System.out.println(VariablesValues.question);

            System.out.print("Valor da variavel 'a': ");
            question.a = input.next();

            System.out.print("Valor da variavel 'b': ");
            question.b = input.next();

            question.changeValues();

        } catch (Exception e) {
            throw new Exception("Ocorreu um erro", e);
        } finally {
            input.close();
        }

    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        // main.question01();
        // main.question02();
        // main.question03();
        main.question04();

    }
}