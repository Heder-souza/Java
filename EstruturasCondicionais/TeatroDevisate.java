import java.util.Scanner;

public class TeatroDevisate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double[] valorReservas = new double[3];
        double[] valorCompradas = new double[3];
        int[] compradasPorSala = new int[3];
        int[] reservadasPorSala = new int[3];
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
            System.out.println("7 - Menu de exercicios");
            System.out.println("0 - Sair");
            System.out.println("============================");

            System.out.println("\nDigite a sua opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
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
                    break;
                }

                case 2: {
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
                            System.out.println("");
                        }
                        System.out.println("=====================================");
                        System.out.println(
                                "Compradas: " + compradasPorSala[s - 1] + " | Reservadas: " + reservadasPorSala[s - 1]
                                        + " | Livres: " + (144 - (compradasPorSala[s - 1] + reservadasPorSala[s - 1])));

                    }
                    break;
                }

                case 3: {
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
                    } else if (linhaIndex < 0 || linhaIndex > 11) {
                        System.out.println("Linha invalida tente algo entre A-L");
                    } else if (c < 1 || c > 12) {
                        System.out.println("Coluna invalida tente algo entre 1-12");
                    }

                    else if (cadeiras[s - 1][linhaIndex][c - 1] == 1) {
                        System.out.println("Cadeira já reservada!");
                    } else if (cadeiras[s - 1][linhaIndex][c - 1] == 2) {
                        System.out.println("Cadeira já comprada!");
                    } else {
                        cadeiras[s - 1][linhaIndex][c - 1] = 1;
                        System.out.println("Cadeira Reservada! Valor: R$ " + ingresso[s - 1] / 2);
                        reservadasPorSala[s - 1]++;
                        valorReservas[s - 1] += ingresso[s - 1] / 2;
                    }

                    break;
                }

                case 4: {
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
                    } else if (linhaIndex < 0 || linhaIndex > 11) {
                        System.out.println("Linha invalida tente algo entre A-L");
                    } else if (c < 1 || c > 12) {
                        System.out.println("Coluna invalida tente algo entre 1-12");
                    }

                    else if (cadeiras[s - 1][linhaIndex][c - 1] == 2) {
                        System.out.println("Cadeira já comprada!");
                    } else {
                        if (cadeiras[s - 1][linhaIndex][c - 1] == 1) {
                            System.out.println("Cadeira comprada! Valor: R$" + ingresso[s - 1] / 2);
                            reservadasPorSala[s - 1]--;
                            valorReservas[s - 1] -= ingresso[s - 1] / 2;
                            valorCompradas[s - 1] += ingresso[s - 1];
                        } else {
                            System.out.println("Cadeira Comprada! Valor R$" + ingresso[s - 1]);
                            valorCompradas[s - 1] += ingresso[s - 1];
                        }

                        cadeiras[s - 1][linhaIndex][c - 1] = 2;
                        compradasPorSala[s - 1]++;
                    }
                    break;
                }

                case 5: {
                    System.out.println("==================================");
                    System.out.println("       Cancelar uma Reserva");
                    System.out.println("==================================");
                    System.out.println("\nQual sala sua cadeira está reservada?? (1-3):");
                    s = scanner.nextInt();
                    System.out.println("\nQual a coluna da cadeira reservada?(1-12):");
                    int c = scanner.nextInt();
                    System.out.println("\nQual a linha da cadeira reservada?(A-L):");
                    String l = scanner.next();
                    char lFormatado = l.toUpperCase().charAt(0);

                    int linhaIndex = lFormatado - 'A';

                    if (s < 1 || s > 3) {
                        System.out.println("\nSala invalida");
                    } else if (linhaIndex < 0 || linhaIndex > 11) {
                        System.out.println("Linha invalida tente algo entre A-L");
                    } else if (c < 1 || c > 12) {
                        System.out.println("Coluna invalida tente algo entre 1-12");
                    }
                    else if(cadeiras[s-1][linhaIndex][c -1] == 2){
                        System.out.println("Não é possivel cancelar uma compra!");
                    }
                    else if(cadeiras[s-1][linhaIndex][c-1] == 0){
                        System.out.println("A cadeira não está reservada!");
                    }
                    else{
                        System.out.println("A reserva da cadeira "+lFormatado+" "+ c+" foi cancelada! Reembolso: R$" + ingresso[s-1]/2);
                        reservadasPorSala[s - 1]--;
                        valorReservas[s - 1] -= ingresso[s - 1] / 2;
                        cadeiras[s-1][linhaIndex][c-1] = 0;
                    }
                    break;
                }

                case 6:{
                    System.out.println("============================================================================");
                    System.out.println("                            Relatório Financeiro");
                    System.out.println("============================================================================");
                    System.out.println("                            Salas disponiveis\n");
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
                    } else{
                        System.out.println("Relatório financeiro da "+salas[s-1]);
                        System.out.println("Total de Cadeiras Livres: " + (144 - (compradasPorSala[s - 1] + reservadasPorSala[s - 1])));
                        System.out.println("Total de Cadeiras Reservadas: "+reservadasPorSala[s-1]);
                        System.out.println("Total de Cadeiras Compradas: "+compradasPorSala[s-1]);
                        System.out.println("Total Arrecadado: R$"+valorCompradas[s-1]);
                        System.out.println("Total em Reservas: R$"+valorReservas[s-1]);
                        System.out.println("Receita Potencial se Reservas forem confirmadas: R$"+(valorCompradas[s-1]+(reservadasPorSala[s-1]*ingresso[s-1]/2)));
                        System.out.println("Receita Potencial Máxima: R$"+(144*ingresso[s-1]));
                    }
                    break;
                }

                case 7:{
                    String [] titulos = {"Par ou Ímpar", "Maior de Dois Números","Aprovação Escolar","Classificação de Temperatura","Calculadora Simples com Switch", "Ano Bissexto", "Triângulo Válido", "IMC", "Dia da Semana com Switch","Positivo, Negativo ou Zero", "Ingresso de Cinema", "Nota por Conceito", "Estação do Ano com Switch", "Maior de Três Números", "Verificador de Login", "Múltiplo de 3 e 5", "Desconto em Compra", "Número Romano com Switch", "Velocidade e Multa", "Jogo Pedra, Papel e Tesoura"};
                    String[] enunciados = {
                        "Leia um número inteiro e informe se ele é par ou ímpar.\nObrigatório: use o operador ternário para exibir a mensagem.",
                        "Leia dois números inteiros e exiba qual é o maior.\nObrigatório: use o operador ternário para determinar e exibir o maior.",
                        "Leia a média de um aluno (0 a 10) e exiba:\n- Aprovado se média >= 7\n- Recuperação se média >= 5 e < 7\n- Reprovado se média < 5",
                        "Leia a temperatura em graus Celsius e classifique:\n- Abaixo de 15°C = Frio\n- Entre 15°C e 25°C = Agradável\n- Acima de 25°C = Quente\nDesafio: use o ternário aninhado.",
                        "Leia dois números e um operador (+, -, *, /) e realize a operação\ncorrespondente usando switch.\nTrate a divisão por zero.",
                        "Leia um ano e informe se ele é bissexto ou não.\nUm ano é bissexto se divisível por 4,\nexceto centenários, salvo os divisíveis por 400.",
                        "Leia três lados e verifique se formam um triângulo válido.\nSe sim, classifique como equilátero, isósceles ou escaleno.",
                        "Leia o peso (kg) e a altura (m), calcule o IMC (peso/altura²) e classifique:\n- < 18.5 = Abaixo do peso\n- 18.5 a 25 = Peso normal\n- 25 a 30 = Sobrepeso\n- >= 30 = Obesidade",
                        "Leia um número de 1 a 7 e exiba o nome do dia da semana usando switch.\nPara qualquer outro número, exiba Dia inválido.",
                        "Leia um número e informe se é positivo, negativo ou zero.\nObrigatório: use o operador ternário aninhado.",
                        "Uma sala de cinema cobra:\n- Menores de 12 anos: R$ 10,00\n- Entre 12 e 60 anos: R$ 20,00\n- Acima de 60 anos: R$ 10,00\nLeia a idade e exiba o valor do ingresso.",
                        "Leia uma nota (0-10) e exiba o conceito:\n- 9 a 10 = A\n- 7 a 8 = B\n- 5 a 6 = C\n- 0 a 4 = D",
                        "Leia o número do mês (1-12) e exiba a estação do ano\ncorrespondente no hemisfério sul usando switch.",
                        "Leia três números inteiros e exiba qual é o maior entre os três.\nTrate o caso de empate.",
                        "Defina um usuário e senha fixos no código.\nLeia o usuário e a senha digitados e exiba\nAcesso permitido ou Acesso negado usando o operador ternário.",
                        "Leia um número inteiro e informe:\n- Se é múltiplo de 3 e de 5 simultaneamente\n- Se é múltiplo apenas de 3\n- Se é múltiplo apenas de 5\n- Se não é múltiplo de nenhum",
                        "Uma loja dá desconto conforme o valor da compra:\n- Acima de R$ 500 = 20% de desconto\n- Entre R$ 200 e R$ 500 = 10% de desconto\n- Abaixo de R$ 200 = sem desconto\nLeia o valor e exiba o valor final após o desconto.",
                        "Leia um número de 1 a 10 e exiba seu equivalente\nem algarismo romano usando switch.",
                        "Leia a velocidade de um veículo e o limite da via. Classifique:\n- Dentro do limite = Sem multa\n- Até 20% acima = Multa leve\n- Entre 20% e 50% acima = Multa grave\n- Acima de 50% = Multa gravíssima + suspensão",
                        "Leia a escolha de dois jogadores (pedra, papel ou tesoura)\ne determine quem venceu ou se houve empate.\nUse o operador ternário para exibir o resultado final."
                    };
                    int paginaAtual = 0;
                    int itensPorPagina = 7;
                    int totalExercicios = 20;
                    int totalPaginas = (int) Math.ceil((double) totalExercicios / itensPorPagina);
                    String escolha;

                    

                    do{
                        int inicio = paginaAtual * itensPorPagina;
                        int fim = Math.min(inicio + itensPorPagina, totalExercicios);

                        System.out.println("\n======Pagina "+(paginaAtual+1)+"=======\n");
                        for (int i = inicio; i < fim; i++) {
                            System.out.println((i+1)+" - "+titulos[i]);
                        }
                        System.out.println("=================================");

                        System.out.println(paginaAtual > 0 ? "A - pagina anterior" : "");

                        System.out.println(paginaAtual < totalPaginas-1 ? "P - proxima pagina": "");
                        
                        System.out.println("V - voltar");

                        escolha = scanner.next().toUpperCase();

                        if (escolha.equals("A")) {
                            paginaAtual--;
                        }
                        else if (escolha.equals("P")) {
                            paginaAtual++;
                        }
                        else if(!escolha.equals("V")){
                            int n = Integer.parseInt(escolha);
                            System.out.println(enunciados[n-1]);
                        }

                    }
                    while(!escolha.equals("V"));
                    break;
                }

                case 0:{
                    System.out.println("Saindo do sistema");
                }

                default:
                    System.out.println("Selecione uma opção valida!!!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}