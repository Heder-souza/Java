import java.util.Scanner;

public class Exercicio_6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi o valor total da sua compra:");
        Double valorOriginal = scanner.nextDouble();
        
        Double valorDesconto = valorOriginal*0.15;
        Double valorFinal = valorOriginal - valorDesconto;

        System.out.println("a sua compra que sairia por R$"+valorOriginal+" com o desconto de 15% diminuiu R$"+valorDesconto+" ficando por apenas R$"+valorFinal+"!!!");

        scanner.close();
    }
}