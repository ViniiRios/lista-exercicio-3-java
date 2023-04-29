import java.util.Scanner;

public class Lista3ExDois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;
        do {
            System.out.print("Insira um nome de usuário: ");
            nomeUsuario = scanner.next();
            System.out.print("Insira uma senha: ");
            senha = scanner.next();
            if (nomeUsuario.equals(senha)) {
                System.out.println("!!!Erro!!! \nA senha e o nome de usúario não podem ser iguais!!!\n");
            }
        } while (nomeUsuario.equals(senha));
        System.out.println("O nome de usuário e senha foram cadastrados com sucesso!");

        scanner.close();
    }

}
