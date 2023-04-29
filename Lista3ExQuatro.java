import java.util.Scanner;

public class Lista3ExQuatro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, soma, media;

        while (true) {
            System.out.print("\nInsira o 1° número: ");
            numeroUm = scanner.nextDouble();
            System.out.print("Insira o 2° número: ");
            numeroDois = scanner.nextDouble();
            System.out.print("Insira o 3° número: ");
            numeroTres = scanner.nextDouble();
            System.out.print("Insira o 4° número: ");
            numeroQuatro = scanner.nextDouble();
            System.out.print("Insira o 5° número: ");
            numeroCinco = scanner.nextDouble();

            soma = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco;
            media = soma / 5;

            System.out.printf("\nO total da soma vai ser " + soma + " e a média dos cinco números é %.2f.\n", media);

            scanner.close();

            break;
        }

    }
}
