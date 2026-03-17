import java.util.Scanner;

public class Ex20{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("jogador 1 - escolha (pedra papel tesoura)");
    String j1 = scanner.nextLine();

    System.out.println("jogador 2 - escolha (pedra papel tesoura)");
    String j2 = scanner.nextLine();

    int resultado;

    if(j1.equals(j2)){
        resultado = 0;
    }
    else if ((j1.equals("pedra")&& j2.equals("tesoura"))|| (j1.equals("papel") && j2.equals("tesoura") || (j1.equals("tesoura") && j2.equals("papel"))){
        resultado = 1;
    }

    else{
        resultado = 2;
    }

    String m = (resultado == 0)? "Empate": (resultado == 1) ? "jogador 1 vennceu" : "jogafor 2 venceu";



        scanner.close();
    }
}