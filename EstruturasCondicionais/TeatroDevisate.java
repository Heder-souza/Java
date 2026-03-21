import java.util.Scanner;

public class TeatroDevisate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int [] compradasPorSala = new int [3];
        int [] reservadasPorSala = new int [3];
        char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L' };
        String[] salas = { "Sala Bethovenn", "Sala Principal", "Sala Villa-Lobos" };
        String[] espetaculos = { "A flauta mágica", "A grande ópera", "Baile de Mascaras" };
        double[] ingresso = { 120.00, 200.00, 80.00 };
        int[][][] cadeiras = new int[3][12][12];
        int s = 0;

        do {
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
                case 1:{
                    System.out.println(
                            "===========================================================================================");
                    System.out.println("                                       Cadastro de Sala");
                    System.out.println(
                            "===========================================================================================");
                    System.out.println("                                       Salas disponiveis\n");
                    System.out.println(
                            "1 - Sala Bethoven | Espetáculo: A flauta mágica | Inteiro: R$ 120,00 | Meia: R$ 60,00");
                    System.out.println(
                            "2 - Sala Principal | Espetáculo: A grande ópera | Inteiro: R$ 200,00 | Meia: R$ 100,00");
                    System.out.println(
                            "3 - Sala Villa-Lobos | Espetáculo: Baile de mascaras | Inteiro: R$ 80,00 | Meia: R$ 40,00");
                    System.out.println("Qual sala deseja?:");
                    s = scanner.nextInt();

                    if (s < 1 || s > 3) {
                        System.out.println("\nSala Invalida");
                    } else {
                        System.out.println("\nVocê selecionou a " + salas[s - 1] + " | Espetáculo: "+ espetaculos[s - 1] + " | Ingresso: R$ " + ingresso[s - 1] + " | Meia entrada: R$"+ ingresso[s - 1] / 2);
                    }
                    break;
                }

                case 2:{
                    System.out.println("=========================");
                    System.out.println("  Exibir Mapa de Sala");
                    System.out.println("=========================");
                    System.out.println("\nQual sala deseja visualizar o mapa?:");
                    s = scanner.nextInt();

                    if (s < 1 || s > 3) {
                        System.out.println("\nSala invalida");
                    } else {
                        System.out.println("\n" + salas[s - 1] + " | " + espetaculos[s - 1] + "\n");
                        for (int colunas = 0; colunas < 12; colunas++) {
                            System.out.print("   " + (colunas + 1) + " ");
                        }
                        System.out.println();
                        for (int i = 0; i < 12; i++) {
                            System.out.print(letras[i] + " ");
                            for (int j = 0; j < 12; j++) {
                                System.out.print((cadeiras[s - 1][i][j] == 0) ? " [ ] "
                                        : (cadeiras[s - 1][i][j] == 1) ? " [R] " : " [X] ");
                            }
                            System.out.println();
                        }

                    }
                    break;
                }

                case 3:{
                    System.out.println("=========================");
                    System.out.println("  Reservar uma Cadeira");
                    System.out.println("=========================");
                    System.out.println("\nDeseja reservar uma cadeira de qual sala? (1-3):");
                    s = scanner.nextInt();
                    System.out.println("\nQual a coluna da cadeira que deseja reservar?(1-12):");
                    int c = scanner.nextInt();
                    System.out.println("\nQual a linha da cadeira que deseja reservar?(A-L):");
                    String l = scanner.next();
                    char lFormatado = l.toUpperCase().charAt(0);

                    int linhaIndex = lFormatado - 'A';

                    if (s < 1 || s > 3) {
                    System.out.println("\nSala invalida");
                    }
                    else if (linhaIndex < 0 || linhaIndex > 11){
                        System.out.println("Linha invalida tente algo entre A-L");
                    }
                    else if(c < 1 || c > 12){
                        System.out.println("Coluna invalida tente algo entre 1-12");
                    }
                    
                    else if(cadeiras[s-1][linhaIndex][c-1] == 1){
                        System.out.println("Cadeira já reservada!");
                    }
                    else if(cadeiras[s-1][linhaIndex][c-1] == 2){
                        System.out.println("Cadeira já comprada!");
                    }
                    else{
                        cadeiras[s-1][linhaIndex][c-1] = 1;
                        System.out.println("Cadeira Reservada! Valor: R$ "+ingresso[s-1]/2);
                        reservadasPorSala[s-1]++;
                    }
                        
                    break;
                }

                case 4:{
                    System.out.println("=========================");
                    System.out.println("  Comprar uma Cadeira");
                    System.out.println("=========================");
                    System.out.println("\nDeseja comprar uma cadeira de qual sala? (1-3):");
                    s = scanner.nextInt();
                    System.out.println("\nQual a coluna da cadeira que deseja comprar?(1-12):");
                    int c = scanner.nextInt();
                    System.out.println("\nQual a linha da cadeira que deseja comprar?(A-L):");
                    String l = scanner.next();
                    char lFormatado = l.toUpperCase().charAt(0);

                    int linhaIndex = lFormatado - 'A';

                    if (s < 1 || s > 3) {
                    System.out.println("\nSala invalida");
                    }
                    else if (linhaIndex < 0 || linhaIndex > 11){
                        System.out.println("Linha invalida tente algo entre A-L");
                    }
                    else if(c < 1 || c > 12){
                        System.out.println("Coluna invalida tente algo entre 1-12");
                    }
                    
                    
                    else if(cadeiras[s-1][linhaIndex][c-1] == 2){
                        System.out.println("Cadeira já comprada!");
                    }
                    else{
                        if(cadeiras[s-1][linhaIndex][c-1] == 1){
                            reservadasPorSala[s-1]--;
                        }

                        cadeiras[s-1][linhaIndex][c-1] = 2;
                        System.out.println("Cadeira Comprada! Valor: R$ "+ingresso[s-1]);
                        compradasPorSala[s-1]++;
                    }
                        
                    break;
                }
                    

                default:
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}