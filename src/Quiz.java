
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Quiz {

    static int pontuacaoQuiz = 0;
    static int pontuacaoErrado = 0;
    static String nome;

    public static void main(String[] args) {
        Inicializador();
    }

    public static void Inicializador() {
        Scanner digitar = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha uma opção: ");

        do {
            Menu();
            opcao = digitar.nextInt();
            switch (opcao) {
                case 1:
                    Instruções();
                    break;
                case 2:
                    Jogar();
                    break;
                case 3:
                    Créditos();
                    break;
                case 4:
                    Sair();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 2 && opcao != 4);

    }

    public static void Instruções() {
        System.out.println("Você está em instruções");
        System.out.println("| _________________________________________________________________________________________________|");
        System.out.println("| 1 - Leia atentamente cada pergunta antes de selecionar sua resposta.                              ");
        System.out.println("| _________________________________________________________________________________________________|");
        System.out.println("| 2 - Selecione a resposta que você acredita ser correta.                                           ");
        System.out.println("| _________________________________________________________________________________________________|");
        System.out.println("| 3 - Você tem até três tentativas para responder corretamente cada pergunta.                       ");
        System.out.println("| _________________________________________________________________________________________________|");
        System.out.println("| 4 - Caso erre em uma tentativa, não desista! Você ainda tem mais duas chances para acertar.       ");
        System.out.println("| _________________________________________________________________________________________________|");
        System.out.println("| 5 - Você tem até três tentativas para responder corretamente cada pergunta.                       ");
        System.out.println("| _________________________________________________________________________________________________|");
        System.out.println("| 6 - Ao final do quiz, você receberá sua pontuação final com base no número de respostas corretas. ");
        System.out.println("| _________________________________________________________________________________________________|");
        System.out.println("| 7 - Lembre-se de que o objetivo é se divertir e testar seus conhecimentos.                        ");
        System.out.println("| _________________________________________________________________________________________________|");

        teclaContinuar();
    }

    public static void teclaContinuar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------|");
        System.out.println("__Tecle algo para continuar_|");
        System.out.println("----------------------------|");
        try {
            System.in.read();
            entrada.nextLine();
        } catch (Exception e) {
        }
    }

    public static void telaOpcoes() {
        System.out.println("\nQual modo deseja jogar " + nome + "?");
        System.out.println("1) Fácil");
        System.out.println("2) Médio");
        System.out.println("3) Difícil");
    }

    public static void Jogar() {
        pontuacaoQuiz = 0;
        pontuacaoErrado = 0;
        char continuar;
        Scanner escolha = new Scanner(System.in);
        System.out.println("Seja bem vindo (a) ao nosso Quiz.");
        System.out.println("Qual o seu nome jogador (a)?");

        nome = escolha.next();
        int opcao;
        do {
            telaOpcoes();
            opcao = escolha.nextInt();
            switch (opcao) {
                case 1:
                    Fácil();
                    break;
                case 2:
                    Médio();
                    break;
                case 3:
                    Difícil();
                    break;
                default:
                    System.out.println("Favor, escolha um modo");
            }
        } while (opcao != 1 && opcao != 2 && opcao != 3);

        System.out.println("\nQuestões acertadas foram: " + pontuacaoQuiz);
        System.out.println("Questões erradas foram: " + pontuacaoErrado);

        System.out.println("Deseja reiniciar o jogo? Sim ou Não");
        continuar = escolha.next().toUpperCase().charAt(0);
        switch (continuar) {
            case 'S':
                Jogar1();
            case 'N':
                Sair();
        }
        if (continuar != 'S' && continuar != 'N') {
            System.out.println("Favor selecionar alguma das duas opções (Sim ou Não) =)");
        }

    }

    public static void Jogar1() {
        pontuacaoQuiz = 0;
        pontuacaoErrado = 0;
        char continuar;
        Scanner escolha = new Scanner(System.in);
        System.out.println("\nQual modo deseja jogar " + nome + "?");
        System.out.println("1) Fácil");
        System.out.println("2) Médio");
        System.out.println("3) Difícil");
        int opcao = escolha.nextInt();
        switch (opcao) {
            case 1:
                Fácil();
                break;
            case 2:
                Médio();
                break;
            case 3:
                Difícil();
                break;
            default:
                System.out.println("Favor, escolha um modo");
        }

        System.out.println("\nQuestões acertadas foram: " + pontuacaoQuiz);
        System.out.println("Questões erradas foram: " + pontuacaoErrado);

        System.out.println("Deseja reiniciar o jogo? Sim ou Não");
        continuar = escolha.next().toUpperCase().charAt(0);
        switch (continuar) {
            case 'S':
                Jogar1();
            case 'N':
                Sair();
        }
        if (continuar != 'S' && continuar != 'N') {
            System.out.println("Favor selecionar alguma das duas opções (Sim ou Não) =)");
        }
    }

    public static void Créditos() {
        System.out.println("Criadores do Quiz:");
        System.out.println(" ______________");
        System.out.println("|              |");
        System.out.println("|   Natanael   |");
        System.out.println("|   Karen      |");
        System.out.println("|   Amanda     |");
        System.out.println("|   Vinicius   |");
        System.out.println("|______________|");
        teclaContinuar();
    }

    public static void Sair() {
        System.out.println("Obrigado por jogar nosso Quiz, volte sempre !");
    }

    public static void Menu() {
        System.out.println("   ________________________   ");
        System.out.println("  |                        |  ");
        System.out.println(" _|       MENU QUIZ        |_ ");
        System.out.println("|____________________________|");
        System.out.println("|                            |");
        System.out.println("|--------[1]INSTRUÇÕES-------|");
        System.out.println("|                            |");
        System.out.println("|--------[2]JOGAR------------|");
        System.out.println("|                            |");
        System.out.println("|--------[3]CRÉDITOS---------|");
        System.out.println("|                            |");
        System.out.println("|--------[4]SAIR-------------|");
        System.out.println("|____________________________|");
    }

    public static void Fácil() {
        System.out.println("Ficou com medo Sr(a). " + nome + "? Rs");
        Pergunta01f();
        Pergunta02f();
        Pergunta03f();
        Pergunta04f();
        Pergunta05f();
        Pergunta06f();
        Pergunta07f();
        Pergunta08f();
        Pergunta09f();
        Pergunta10f();
    }

    public static void Médio() {
        System.out.println("Você gosta de arriscar Sr(a). " + nome + "? ");
        Pergunta01m();
        Pergunta02m();
        Pergunta03m();
        Pergunta04m();
        Pergunta05m();
        Pergunta06m();
        Pergunta07m();
        Pergunta08m();
        Pergunta09m();
        Pergunta10m();
    }

    public static void Difícil() {
        System.out.println("Muito corajoso Sr(a). " + nome + ", RS ");
        Pergunta01d();
        Pergunta02d();
        Pergunta03d();
        Pergunta04d();
        Pergunta05d();
        Pergunta06d();
        Pergunta07d();
        Pergunta08d();
        Pergunta09d();
        Pergunta10d();
    }

    public static void Pergunta01f() {

        boolean acertou = false;
        char resposta;
        int tentativas = 0;

        Scanner entrada = new Scanner(System.in);

        String resposta1 = "1889-1930";

        List alternativas = new ArrayList();
        alternativas.add("1996-2002");
        alternativas.add("1886-1998");
        alternativas.add("1858-1932");
        alternativas.add("2002-2021");
        alternativas.add("1889-1930");

        do {
            Collections.shuffle(alternativas);

            System.out.println(
                    "1) Júlio Prestes foi um dos presidentes eleitos do Brasil pelo voto popular no período da República Velha. Em qual perido ocorreu?"
                    + "");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'E':
                    if (alternativas.get(4).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }
        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Voce acertou na " + tentativas + "º tentativa");
        } else {
            System.out.println("Voce errou nas 3 tentaivas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta02f() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta2 = "Luiz Inacio Lula da Silva";

        List alternativas = new ArrayList();
        alternativas.add("Jair Messias Bolsonaro");
        alternativas.add("Luiz Inacio Lula da Silva");
        alternativas.add("Julio Prestes");
        alternativas.add("Janio da Silva Quadros");
        alternativas.add("Pelé");

        do {
            Collections.shuffle(alternativas);

            System.out.println("\n2) Quem foi presidente do brasil em 2002?" + "");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaCorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'E':
                    if (alternativas.get(4).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }
        } while (tentativas < 3 && !acertou);

        if (acertou) {
            System.out.println("Voce acertou na " + tentativas + " tentativa");
        } else {

            System.out.println("Voce errou nas 3 tentaivas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta03f() {

        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta3 = "Elefante africano";

        List alternativas = new ArrayList();
        alternativas.add("Elefante africano");
        alternativas.add("Urso polar");
        alternativas.add("Baleia-azul");
        alternativas.add("Gorila oriental");
        alternativas.add("Rinoceronte-branco");

        do {
            Collections.shuffle(alternativas);

            System.out.println("\n3) Qual é o maior animal terrestre do mundo?" + "");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));

            System.out.println("Qual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'B':
                    if (alternativas.get(1).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'C':
                    if (alternativas.get(2).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'D':
                    if (alternativas.get(3).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'E':
                    if (alternativas.get(4).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Voce acertou na " + tentativas + " tentativa");
        } else {
            System.out.println("Voce errou nas 3 tentaivas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta04f() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta4 = "Júpiter";

        List alternativas = new ArrayList();
        alternativas.add("Terra");
        alternativas.add("Júpiter");
        alternativas.add("Saturno");
        alternativas.add("Netuno");
        alternativas.add("Vênus");

        do {
            Collections.shuffle(alternativas);

            System.out.println("4) Qual é o nome do maior planeta do sistema solar?" + "");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'C':
                    if (alternativas.get(2).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }
        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Voce acertou na " + tentativas + " tentativa");
        }
    }

    public static void Pergunta05f() {

        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta5 = "Madrid";

        List alternativas = new ArrayList();
        alternativas.add("Paris");
        alternativas.add("Roma");
        alternativas.add("Lisboa");
        alternativas.add("Madrid");
        alternativas.add("Berlim");

        do {
            Collections.shuffle(alternativas);

            System.out.println("5) Qual é a capital da Espanha?" + "");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'C':
                    if (alternativas.get(2).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }
        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Voce acertou na " + tentativas + " tentativa");
        }
    }

    public static void Pergunta06f() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;

        Scanner entrada = new Scanner(System.in);

        String resposta6 = "China";

        List alternativas = new ArrayList();
        alternativas.add("Brasil");
        alternativas.add("Índia");
        alternativas.add("China");
        alternativas.add("Estados Unidos");
        alternativas.add("Rússia");

        do {
            Collections.shuffle(alternativas);

            System.out.println("6) Qual é o país mais populoso do mundo?" + "");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
                case 'E':
                    if (alternativas.get(4).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }
        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Voce acertou na " + tentativas + " tentativa");
        } else {
            System.out.println("Voce errou nas 3 tentaivas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta07f() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta7 = "Preta";
        List alternativas = new ArrayList();
        alternativas.add("Branca");
        alternativas.add("Preta");
        alternativas.add("Marrom");
        alternativas.add("Laranja");
        alternativas.add("Azul");

        do {
            Collections.shuffle(alternativas);
            System.out.println("7) Qual é a cor da pele dos ursos polares?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta08f() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta8 = "Escritor";
        List alternativas = new ArrayList();
        alternativas.add("Escultor");
        alternativas.add("Pintor");
        alternativas.add("Escritor");
        alternativas.add("Dançarino");
        alternativas.add("Cantor");

        do {
            Collections.shuffle(alternativas);
            System.out.println("8) Qual é o nome da pessoa que escreve livros?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta09f() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta9 = "Tóquio";

        List alternativas = new ArrayList();
        alternativas.add("Tóquio");
        alternativas.add("Pequim");
        alternativas.add("Seul");
        alternativas.add("Bangcoc");
        alternativas.add("Jacarta");

        do {
            Collections.shuffle(alternativas);
            System.out.println("9) Qual é o nome da capital do Japão?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta10f() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta10 = "Vermelho";

        List alternativas = new ArrayList();
        alternativas.add("Vermelho");
        alternativas.add("Azul");
        alternativas.add("Verde");
        alternativas.add("Amarelo");
        alternativas.add("Roxo");

        do {
            Collections.shuffle(alternativas);
            System.out.println("10) Qual é a cor do sangue das veias?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 3 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    //inicio do fluxo das perguntas na dificuldade média
    public static void Pergunta01m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta1 = "Deserto do Saara";

        List alternativas = new ArrayList();
        alternativas.add("Deserto de Gobi");
        alternativas.add("Deserto da Arábia");
        alternativas.add("Deserto do Saara");
        alternativas.add("Deserto da Patagônia");
        alternativas.add("Deserto do Atacama");

        do {
            Collections.shuffle(alternativas);
            System.out.println("01) Qual é o nome do maior deserto do mundo?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta1)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta02m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta2 = "1989";

        List alternativas = new ArrayList();
        alternativas.add("1986");
        alternativas.add("1989");
        alternativas.add("1991");
        alternativas.add("1993");
        alternativas.add("1995");

        do {
            Collections.shuffle(alternativas);
            System.out.println("02) Em que ano ocorreu a queda do Muro de Berlim?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta03m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta3 = "Cordilheira do Himalaia";

        List alternativas = new ArrayList();
        alternativas.add("Cordilheira dos Andes");
        alternativas.add("Cordilheira do Himalaia");
        alternativas.add("Cordilheira do Atlas");
        alternativas.add("Cordilheira do Cáucaso");
        alternativas.add("Cordilheira dos Alpes");

        do {
            Collections.shuffle(alternativas);
            System.out.println("03) Qual é o nome da maior cordilheira do mundo?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta04m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta4 = "Pedro Álvares Cabral";

        List alternativas = new ArrayList();
        alternativas.add("Vasco da Gama");
        alternativas.add("Cristóvão Colombo");
        alternativas.add("Pedro Álvares Cabral");
        alternativas.add("Fernão de Magalhães");
        alternativas.add("Bartolomeu Dias");

        do {
            Collections.shuffle(alternativas);
            System.out.println("04) Qual é o nome do navegador português que chegou ao Brasil em 1500?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta05m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta5 = "Marte";

        List alternativas = new ArrayList();
        alternativas.add("Mercúrio");
        alternativas.add("Vênus");
        alternativas.add("Terra");
        alternativas.add("Marte");
        alternativas.add("Júpiter");

        do {
            Collections.shuffle(alternativas);
            System.out.println("05) Qual é o nome do quarto planeta do sistema solar?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta06m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta6 = "Montanhas Rochosas";

        List alternativas = new ArrayList();
        alternativas.add("Montanhas Rochosas");
        alternativas.add("Montanhas dos Apalaches");
        alternativas.add("Cordilheira da Costa");
        alternativas.add("Cordilheira do Pacífico");
        alternativas.add("Sierra Nevada");

        do {
            Collections.shuffle(alternativas);
            System.out.println("06) Qual é o nome da maior cadeia montanhosa da América do Norte?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta07m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta7 = "Abraham Lincoln";

        List alternativas = new ArrayList();
        alternativas.add("George Washington");
        alternativas.add("Thomas Jefferson");
        alternativas.add("Abraham Lincoln");
        alternativas.add("Franklin D. Roosevelt");
        alternativas.add("John F. Kennedy");

        do {
            Collections.shuffle(alternativas);
            System.out.println(
                    "07) Qual é o nome do presidente americano que proclamou a emancipação dos escravos em 1863?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta08m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta8 = "Mar Báltico";

        List alternativas = new ArrayList();
        alternativas.add("Mar Morto");
        alternativas.add("Mar Báltico");
        alternativas.add("Mar Vermelho");
        alternativas.add("Mar Adriático");
        alternativas.add("Golfo Pérsico");

        do {
            Collections.shuffle(alternativas);
            System.out.println("08) Qual é o nome da menor e mais rasa massa de água salgada do mundo?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta09m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta9 = "J.K. Rowling";

        List alternativas = new ArrayList();
        alternativas.add("J.K. Rowling");
        alternativas.add("Agatha Christie");
        alternativas.add("Virginia Woolf");
        alternativas.add("Harper Lee");
        alternativas.add("Emily Bronte");

        do {
            Collections.shuffle(alternativas);
            System.out.println("09) Qual é o nome da autora da saga Harry Potter?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta10m() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta10 = "Rússia";

        List alternativas = new ArrayList();
        alternativas.add("China");
        alternativas.add("Estados Unidos");
        alternativas.add("Rússia");
        alternativas.add("Canadá");
        alternativas.add("Brasil");

        do {
            Collections.shuffle(alternativas);
            System.out.println("10) Qual é o país com a maior área territorial do mundo?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    //inicio do fluxo das perguntas na dificuldade dificil
    public static void Pergunta01d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta01 = "Rússia";

        List alternativas = new ArrayList();
        alternativas.add("China");
        alternativas.add("Estados Unidos");
        alternativas.add("Rússia");
        alternativas.add("Canadá");
        alternativas.add("Brasil");

        do {
            Collections.shuffle(alternativas);
            System.out.println("01) Qual é o país com a maior área territorial do mundo?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta01)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta01)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta01)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta01)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta01)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta02d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta2 = "Nelson Mandela";

        List alternativas = new ArrayList();
        alternativas.add("Nelson Mandela");
        alternativas.add("Thabo Mbeki");
        alternativas.add("Jacob Zuma");
        alternativas.add("Cyril Ramaphosa");
        alternativas.add("Kgalema Motlanthe");

        do {
            Collections.shuffle(alternativas);
            System.out.println("02) Qual foi o primeiro presidente eleito democraticamente na África do Sul, após o fim do apartheid?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta2)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta03d() {

        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta3 = "Samuel Beckett";

        List alternativas = new ArrayList();
        alternativas.add("Harold Pinter");
        alternativas.add("Samuel Beckett");
        alternativas.add("Anton Chekhov");
        alternativas.add("Tennessee Williams");
        alternativas.add("Arthur Miller");

        do {
            Collections.shuffle(alternativas);
            System.out.println("03) Quem escreveu a peça teatral 'Esperando Godot'?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta3)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta04d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta4 = "Meiose";

        List alternativas = new ArrayList();
        alternativas.add("Mitose");
        alternativas.add("Meiose");
        alternativas.add("Cariocinese");
        alternativas.add("Citocinese");
        alternativas.add("Prófase");

        do {
            Collections.shuffle(alternativas);
            System.out.println("04) Qual o nome do processo de divisão celular que resulta em quatro células haploides, cada uma com metade do número de cromossomos da célula original?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta4)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta05d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta5 = "São Petersburgo";

        List alternativas = new ArrayList();
        alternativas.add("Moscou");
        alternativas.add("São Petersburgo");
        alternativas.add("Kiev");
        alternativas.add("Minsk");
        alternativas.add("Tbilisi");

        do {
            Collections.shuffle(alternativas);
            System.out.println("05) Em qual cidade foi realizado o primeiro congresso do Partido Comunista da União Soviética?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta5)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta06d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta6 = "DNA";

        List alternativas = new ArrayList();
        alternativas.add("DNA");
        alternativas.add("RNA");
        alternativas.add("Proteína");
        alternativas.add("Carboidrato");
        alternativas.add("Lipídeo");

        do {
            Collections.shuffle(alternativas);
            System.out.println("06) Qual a molécula responsável por armazenar e transmitir informações genéticas em todos os seres vivos?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta6)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta07d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta7 = "William Faulkner";

        List alternativas = new ArrayList();
        alternativas.add("Ernest Hemingway");
        alternativas.add("Gabriel García Márquez");
        alternativas.add("Albert Camus");
        alternativas.add("William Faulkner");
        alternativas.add("Hermann Hesse");

        do {
            Collections.shuffle(alternativas);
            System.out.println("07) Qual desses escritores ganhou o Prêmio Nobel de Literatura mais de uma vez?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta7)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void Pergunta08d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta8 = "Edvard Munch";

        List alternativas = new ArrayList();
        alternativas.add("Vincent van Gogh");
        alternativas.add("Salvador Dalí");
        alternativas.add("Edvard Munch");
        alternativas.add("Pablo Picasso");
        alternativas.add("Claude Monet");

        do {
            Collections.shuffle(alternativas);
            System.out.println("08) Quem pintou a famosa obra 'O Grito1' ?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta8)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta09d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta9 = "Seychelles";

        List alternativas = new ArrayList();
        alternativas.add("Seychelles");
        alternativas.add("Egito");
        alternativas.add("África do Sul");
        alternativas.add("Nigéria");
        alternativas.add("Marrocos");

        do {
            Collections.shuffle(alternativas);
            System.out.println("09) Qual país africano possui o maior PIB per capita?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta9)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }

    }

    public static void Pergunta10d() {
        boolean acertou = false;
        char resposta;
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        String resposta10 = "Neil Armstrong";

        List alternativas = new ArrayList();
        alternativas.add("Neil Armstrong");
        alternativas.add("Buzz Aldrin");
        alternativas.add("Yuri Gagarin");
        alternativas.add("Alan Shepard");
        alternativas.add("John Glenn");

        do {
            Collections.shuffle(alternativas);
            System.out.println("10) Quem foi o primeiro astronauta a caminhar na Lua?");
            System.out.println("A) " + alternativas.get(0));
            System.out.println("B) " + alternativas.get(1));
            System.out.println("C) " + alternativas.get(2));
            System.out.println("D) " + alternativas.get(3));
            System.out.println("E) " + alternativas.get(4));
            System.out.println("\nQual a sua resposta?");
            resposta = entrada.next().toUpperCase().charAt(0);
            tentativas++;
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(resposta10)) {
                        RespostaCorreta();
                        acertou = true;
                        int pontuacao = 1;
                        pontuacaoQuiz += pontuacao;
                    } else {
                        RespostaIncorreta();
                    }
                    break;
            }

        } while (tentativas < 2 && !acertou);
        if (acertou) {
            System.out.println("Você acertou na " + tentativas + " tentativas");
        } else {
            System.out.println("Você errou nas 3 tentativas.");
            int pontuacaoErrada = 1;
            pontuacaoErrado += pontuacaoErrada;
        }
    }

    public static void RespostaCorreta() {
        System.out.println("Resposta Correta!");
    }

    public static void RespostaIncorreta() {
        System.out.println("Resposta Incorreta");
    }

}

}
