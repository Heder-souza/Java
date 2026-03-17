import java.util.Scanner;

public class Ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        double n2 = scanner.nextInt();

        System.out.println("Escolha sua operação:\n1 - Divisão\n2 - multiplicação\n3 - adição\n 4 - Subtração");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println(n1+" ÷ "+n2+" = "+(n1/n2));
                break;
            case 2: 
                System.out.println(n1+" x "+n2+" = "+(n1*n2));

            case 3: 
                System.out.println(n1+" + "+n2+" = "+(n1+n2));

            case 4:
                System.out.println(n1+" - "+n2+" = "+(n1 - n2));
            default:
                break;
        }


        scanner.close();
    }
}