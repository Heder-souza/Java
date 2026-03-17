import java.util.Scanner;

public class Ex13{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o numero do mês");
    int n = scanner.nextInt();

    switch (n) {
        case 12:
        case 1:
        case 2:
            System.out.println("É verão");
            break;

        case 3:
        case 4:
        case 5:
            System.out.println("É outono");
            break;

        case 6:
        case 7:
        case 8:
            System.out.println("É inverno");
            break;

        case 9:
        case 10:
        case 11:
            System.out.println("Primavera");
            break;
    
        default:
            System.out.println("Digite um mês válido");
            break;
    }

        scanner.close();
    }
}