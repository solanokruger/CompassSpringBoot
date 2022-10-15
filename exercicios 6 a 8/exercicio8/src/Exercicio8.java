import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de funcionários que deseja cadastrar: ");
        int quantidadeFuncionarios = scan.nextInt();

        String nomeFuncionario[] = new String[quantidadeFuncionarios];
        double salarioFuncionario[] = new double[quantidadeFuncionarios];

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o nome do funcionário:");
            nomeFuncionario[i] = scanner.nextLine();

            // verifica se o nome esta nulo ou se é somente um espaço
            while (nomeFuncionario[i].isBlank()) {
                System.out.println("Informe o nome do funcionário:");
                nomeFuncionario[i] = scanner.nextLine();
            }

            System.out.println("Informe o salário do funcionário:");
            salarioFuncionario[i] = scanner.nextDouble();

        }

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (salarioFuncionario[i] <= 1000 && salarioFuncionario[i] > 0) {
                double bonus = (salarioFuncionario[i] * 20) / 100;
                double salarioLiquido = bonus + salarioFuncionario[i];
                System.out.println("Funcionário " + nomeFuncionario[i] + ":");
                System.out.println("Salário: " + salarioFuncionario[i]);
                System.out.println("Bônus: " + bonus);
                System.out.println("Salário Líquido: " + salarioLiquido);
            } else if (salarioFuncionario[i] > 1000 && salarioFuncionario[i] <= 2000) {
                double bonus = (salarioFuncionario[i] * 10) / 100;
                double salarioLiquido = bonus + salarioFuncionario[i];
                System.out.println("Funcionário " + nomeFuncionario[i] + ":");
                System.out.println("Salário: " + salarioFuncionario[i]);
                System.out.println("Bônus: " + bonus);
                System.out.println("Salário Líquido: " + salarioLiquido);
            } else if (salarioFuncionario[i] > 2000) {
                double desconto = (salarioFuncionario[i] * 10) / 100;
                double salarioLiquido = salarioFuncionario[i] - desconto;
                System.out.println("Funcionário " + nomeFuncionario[i] + ":");
                System.out.println("Salário: " + salarioFuncionario[i]);
                System.out.println("Desconto: " + desconto);
                System.out.println("Salário Líquido: " + salarioLiquido);
            } else {
                System.out.println("Funcionário " + nomeFuncionario[i] + ":");
                System.out.println("O sálario informado é um valor menor que zero, tente novamente !");
            }
        }

    }
}
