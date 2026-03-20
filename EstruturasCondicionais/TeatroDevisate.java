import java.util.Scanner;

public class TeatroDevisate{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao; char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
        String [] salas = {"Sala Bethovenn", "Sala Principal", "Sala Villa-Lobos"};
        String [] espetaculos = {"A flauta mágica", "A grande ópera", "Baile de Mascaras"};
        double [] ingresso = {120.00, 200.00, 80.00};
        int[][][] cadeiras = new int[3][12][12];

        do{
        System.out.println("============================");
        System.out.println("       Teatro Devisate");
        System.out.println("============================");
        System.out.println("1 - Cadastro da Sala");
        System.out.println("2 - Exibir Mapa da Sala");
        System.out.println("3 - Reservar Cadeira");
        System.out.println("4 - Comprar Cadeira");
        System.out.println("5 - Cancelar reserva");
        System.out.println("6 - Relatório Financeiro");
        System.out.println("0 - Sair");
        System.out.println("============================");

        System.out.println("\nDigite a sua opção:");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("===========================================================================================");
                System.out.println("                                       Cadastro de Sala");
                System.out.println("===========================================================================================");
                System.out.println("                                       Salas disponiveis\n");
                System.out.println("1 - Sala Bethoven | Espetáculo: A flauta mágica | Inteiro: R$ 120,00 | Meia: R$ 60,00");
                System.out.println("2 - Sala Principal | Espetáculo: A grande ópera | Inteiro: R$ 200,00 | Meia: R$ 100,00");
                System.out.println("3 - Sala Villa-Lobos | Espetáculo: Baile de mascaras | Inteiro: R$ 80,00 | Meia: R$ 40,00");
                System.out.println("Qual sala deseja?:");
                int s = scanner.nextInt();

                if (s < 1 || s > 3){
                    System.out.println("Sala Invalida");
                }else{
                    System.out.println("Você selecionou a "+salas[s-1]+" | Espetáculo: "+espetaculos[s-1]+" | Ingresso: R$ "+ingresso[s-1]+" | Meia entrada: R$"+ingresso[s-1]/2);
                }
                
                break;
        
            default:
                break;
        }
        }
        while(opcao!=0);


        

        
        scanner.close();
    }
}