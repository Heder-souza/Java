import java.util.Scanner;

public class Ex10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scanner.nextInt();

        System.out.println((n > 0) ? "positivo" : (n == 0) ? "nulo" : "negativo");

        scanner.close();
    }
}