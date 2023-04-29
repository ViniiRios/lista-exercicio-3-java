import java.util.Scanner;

public class Lista3ExCinco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        for (numero = 1; numero <= 50; numero++) {
            if (numero % 2 == 1) {
                System.out.printf(numero + " / ");
            }

        }

        scanner.close();
    }

}
