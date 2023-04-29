import java.util.Scanner;

public class Lista3ExUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("\nInsira uma nota (entre 0 e 10): ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! O valor deve ser entre 0 e 10.");
            }
        }
        System.out.println("Nota informada: " + nota);

        scanner.close();
    }

}
