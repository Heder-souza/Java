import java.util.Scanner;

public class Ex2{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double n2 = scanner.nextDouble();

        System.out.println((n1 > n2) ? n1+" é o maior número" : n2+" é o maior número");

        scanner.close();
    }
}