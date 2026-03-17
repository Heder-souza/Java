import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (kg)");
        double p = scanner.nextDouble();

        System.out.println("Digite seu altura (m)");
        double a = scanner.nextDouble();

        double imc = p/(a*a);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso normal");
        }
        else if( imc >= 25 && imc < 30){
            System.out.println("Acima do peso");
        }
        else{
            System.out.println("obesidade");
        }

        System.out.println((imc >= 18.5 && imc < 25)? "faixa saudavel" : "fora da faixa saudavel");


        scanner.close();
    }
}
