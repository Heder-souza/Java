import java.util.Scanner;

public class Exercicio_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o produto que desejar:");
        String produto = scanner.nextLine();
        System.out.println("Digite o valor unitário em Dólar(U$):");
        Double valorDolar = scanner.nextDouble();
        System.out.println("Digite o valor do Real hoje:");
        Double real = scanner.nextDouble();

        Double valorReal = valorDolar * real;

        System.out.println("O valor a ser no "+produto+" pago em real é R$"+valorReal);

        scanner.close();
    }
}