import java.util.Scanner;

public class Ex19{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a velocidade do veiculo");
    double v = scanner.nextDouble();

    System.out.println("Digite a velocidade limite da via");
    double l = scanner.nextDouble();



    double calc =(((v - l)/l)*100);
   
    if(calc <= 20){
        System.out.println("multa leve");
    }
    else if(calc > 20 && calc <= 50){
        System.out.println("Multa grave");

    }
    else if(calc > 50){
        System.out.println("gravissima mais suspensão");
    }
    
    else{

        System.out.println("sem multa");
    }

    

        scanner.close();
    }
}