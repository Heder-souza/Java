import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual produto você deseja:");
        String produto = scanner.nextLine();
        System.out.println("Qual o valor:");
        Double valorUnitario = scanner.nextDouble();
        System.out.println("Qual a quantidade:");
        int quantidade = scanner.nextInt();

        Double valorPago = quantidade * valorUnitario;

        System.out.println("Você comprou "+quantidade+" "+produto+"(s) a R$"+valorUnitario+" e deverá pagar R$"+ valorPago);

        scanner.close();
        
    }
}
