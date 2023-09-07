import java.util.Scanner;

import questions.CircleArea;
import questions.PesonnalInfos;

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

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        // main.question01();
        main.question02();
    }
}