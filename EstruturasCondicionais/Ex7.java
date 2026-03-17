import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        double a = scanner.nextDouble();

        System.out.println("Digite o segundo lado:");
        double b = scanner.nextDouble();

        System.out.println("Digite o terceiro lado:");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c){
                System.out.println("Seu triangulo é equilatero");
            }
                else if(a == b || a == c || b == c){
                    System.out.println("Seu triangulo é isoceles");
                }
                else{
                    System.out.println("Seu triangulo é escaleno");
                }
        }else{
            System.out.println("Não forma um triangulo");
        }

        scanner.close();
    }
}
