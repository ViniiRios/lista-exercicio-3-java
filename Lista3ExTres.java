import java.util.Scanner;

public class Lista3ExTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.next();

        while (nome.length() <= 3) {
            System.out.print("O nome está inválido!!! \nInforme um nome com mais de 3 caracteres: ");
            nome = scanner.next();
        }

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.print("Idade inválida!!! \nInforme uma idade entre 0 e 150: ");
            idade = scanner.nextInt();
        }

        System.out.print("Informe seu salário: ");
        double salario = scanner.nextDouble();

        while (salario <= 0) {
            System.out.print("Salário inválido!!! \nInforme um valor maior que zero: ");
            salario = scanner.nextDouble();
        }

        System.out.print("Informe seu sexo (f/m): ");
        char sexo = scanner.next().charAt(0);

        while (sexo != 'f' && sexo != 'm') {
            System.out.print("Sexo inválido!!! \nInforme 'f' para feminino ou 'm' para masculino: ");
            sexo = scanner.next().charAt(0);
        }

        System.out.print("Digite o estado civil (s/c/v/d): ");
        char estadoCivil = scanner.next().charAt(0);

        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.print(
                    "Estado civil inválido!!! \nInforme 's' para solteiro, 'c' para casado, 'v' para viúvo ou 'd' para divorciado: ");
            estadoCivil = scanner.next().charAt(0);
        }

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}