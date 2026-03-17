import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sue média:");
        double n = scanner.nextDouble();

        if (n >= 7) {
            System.out.println("Aprovado");
        }
        else if (n >= 5 && n < 7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}