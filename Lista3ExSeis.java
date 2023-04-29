import java.util.Scanner;

public class Lista3ExSeis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, numero1, numero2;

        System.out.print("Informe o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        numero2 = scanner.nextInt();

        System.out.println("Os números no intervalo de " + numero1 + " e " + numero2 + " são:");
        for (numero = numero1 + 1; numero < numero2; numero++) {
            System.out.println(numero);
        }

        scanner.close();
    }

}
