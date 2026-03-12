import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome produto:");
        String produto = scanner.nextLine();
        System.out.println("Digite o preço de custo: ");
        Double preco = scanner.nextDouble();

        
        Double valorCusto = preco * 1.25;

        System.out.println("O preço final de lucro do "+produto +" é "+ valorCusto);
        scanner.close();
    }
    
}
