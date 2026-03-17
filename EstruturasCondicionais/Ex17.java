import java.util.Scanner;

public class Ex17{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

	System.out.println("digite o valor da compra:");
    double n = scanner.nextDouble();


    if(n > 500){
        System.out.println("valor original R$"+n+" com desconto fica R$"+(n * 0.80));
    }
    else if( n>= 200){
        System.out.println("valor original R$"+n+" com desconto fica R$"+(n * 0.90));
    }
    else{
        System.out.println("o desconto não foi aplicado o valor original é R$"+n);
    }

        scanner.close();
    }
}