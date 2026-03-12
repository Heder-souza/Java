import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu cargo: ");
        String cargo = scanner.nextLine();

        System.out.println("Bem-vindo ao Sistema Comercial, " +nome +". Seu acesso como " +cargo+ " foi configurado com sucesso.");

        scanner.close();
    }
    
}
