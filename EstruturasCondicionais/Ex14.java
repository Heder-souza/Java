import java.util.Scanner;

public class Ex14{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número:");
    double n1 = scanner.nextDouble();

    System.out.println("Digite o segundo número:");
    double n2 = scanner.nextDouble();

    System.out.println("Digite o terceiro número:");
    double n3 = scanner.nextDouble();

    System.out.println((n1 > n2 && n1 > n3) ? n1+" é o maior" : (n2>n1 && n2 > n3) ? n2+" é o maior" : (n3 > n1 && n3 > n1) ? n3+ "é o maior" : "os três números são iguais");



        scanner.close();
    }
}