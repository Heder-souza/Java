import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário:");
        Double salario = scanner.nextDouble();
        System.out.println("Digite o valor total vendido:");
        Double valorVendido = scanner.nextDouble();

        Double comissao = valorVendido*0.05;
        Double valorFinal = salario + comissao;

        System.out.println("somando o seu salário de R$"+salario+" com a sua comissão do mês de R$"+comissao+" seu salário final foi de R$"+valorFinal);

        scanner.close();
    }
}
