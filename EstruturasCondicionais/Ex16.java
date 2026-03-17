import java.util.Scanner;

public class Ex16{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("digite um número:");
    int n = scanner.nextInt();

    System.out.println((n % 3 == 0 && n % 5 == 0)? "Multiplo de 3 e 5": (n % 3 == 0) ? "multiplo de 3": (n % 5 == 0) ? "mutiplo de 5": "não é multiplo de 5 nem de 3");

        scanner.close();
    }
}