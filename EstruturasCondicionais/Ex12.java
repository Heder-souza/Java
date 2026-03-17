import java.util.Scanner;

public class Ex12{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        double n = scanner.nextDouble();

        if(n <= 10 && n >= 9){
            System.out.println("A");
        }
        else if(n >= 7 && n <= 8){
            System.out.println("B");
        }
        else if(n >= 5 && n <= 6){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }



        scanner.close();
    }
}