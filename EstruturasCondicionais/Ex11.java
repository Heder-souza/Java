import java.util.Scanner;

public class Ex11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int i = scanner.nextInt();

        if(i < 12){
            System.out.println("O ingresso custa R$10,00");
        }
        else if(i > 12 && i< 60){
            System.out.println("O ingresso custa R$20,00");
        }
        else{
            System.out.println("O ingresso custa R$10,00 (meia)");
        }
        scanner.close();
    }
}