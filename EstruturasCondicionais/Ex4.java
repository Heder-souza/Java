import java.util.Scanner;

public class Ex4{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em °C:");
        double c = scanner.nextDouble();

        if(c <= 15){
            System.out.println("Frio");
        }
        else if(c <= 25){
            System.out.println("Agradavel");
        }
        else{
            System.out.println("Quente");
        }

        scanner.close();
    }
}