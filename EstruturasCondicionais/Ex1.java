import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIgite um número:");
        int n = scanner.nextInt();

        System.out.println((n % 2 == 0) ? "o número é par" : "o número é impar");


        scanner.close();
    }
}