import java.util.Scanner;

public class Ex15{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        
	    System.out.println("Digite o seu nome de usuario:");
        String u = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String s = scanner.nextLine();

        if(u.equals("admin") && s.equals("1234")){
            System.out.println("");
        }

        System.out.println((u.equals("admin") && (s.equals("1234"))) ? "Acesso Permitido":"Acesso negado");
        scanner.close();
    }
}