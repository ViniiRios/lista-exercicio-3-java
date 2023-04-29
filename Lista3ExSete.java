import java.util.Scanner;

public class Lista3ExSete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, numeroInicial, pares = 0, impares = 0;

        for (numeroInicial = 0; numeroInicial < 10; numeroInicial++) {
            System.out.print("Insira o " + (numeroInicial + 1) + "º número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("O total de números pares é: " + pares);
        System.out.println("O total de números impares é: " + impares);

        scanner.close();

    }

}
