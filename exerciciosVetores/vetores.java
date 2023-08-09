package exerciciosVetores;

import java.util.Scanner;

public class vetores {
    Scanner sc = new Scanner(System.in);
    public void exercicio1(){
    Scanner input = new Scanner(System.in);
    int[] vetor = new int[5];

    System.out.println("Digite 5 números inteiros:");

    for (int i = 0; i < 5; i++) {
      vetor[i] = input.nextInt();
    }

    System.out.println("Os números digitados foram:");
    for (int i = 0; i < 5; i++) {
      System.out.println(vetor[i]);
    }
  }
  public void exercicio2(){
        double[] numeros = new double[10]; // vetor para armazenar os números
        Scanner scanner = new Scanner(System.in);
        
        // lê os números e armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }
        
        // exibe os números na ordem inversa
        System.out.print("Números na ordem inversa: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
    public void exercicio3(){
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
        System.out.println("Média: " + media);
    }

    public void exercicio4(){

        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[10];
        int numConsoantes = 0;

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.next().charAt(0);
            if (isConsoante(vetor[i])) {
                numConsoantes++;
            }
        }

        System.out.println("Foram lidas " + numConsoantes + " consoantes:");
        for (char c : vetor) {
            if (isConsoante(c)) {
                System.out.print(c + " ");
            }
        }
    }

    private static boolean isConsoante(char c) {
        char[] consoantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        for (char consoante : consoantes) {
            if (c == consoante || c == Character.toUpperCase(consoante)) {
                return true;
            }
        }
        return false;
    }
    public void exercicio5(){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                par[indicePar] = numeros[i];
                indicePar++;
            } else {
                impar[indiceImpar] = numeros[i];
                indiceImpar++;
            }
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }
    public void exercicio6(){
        Scanner input = new Scanner(System.in);
        double[][] notas = new double[10][4];
        double[] medias = new double[10];
        int alunosAprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as quatro notas do aluno " + (i+1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = input.nextDouble();
                medias[i] += notas[i][j];
            }
            medias[i] /= notas[i].length;
            if (medias[i] >= 7) {
                alunosAprovados++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 7: " + alunosAprovados);
    }
    public void exercicio7(){
        int[] numeros = new int[5]; // cria um vetor de 5 números inteiros
        int soma = 0;
        int multiplicacao = 1;

        Scanner leitor = new Scanner(System.in);

        // lê os números informados pelo usuário e armazena no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %dº número: ", i+1);
            numeros[i] = leitor.nextInt();
        }

        // calcula a soma e a multiplicação dos números informados
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        // exibe os números, a soma e a multiplicação
        System.out.print("Números informados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        leitor.close();
    }
    public void exercicio8(){
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[5];
        double[] alturas = new double[5];

        // Solicita as informações de idade e altura de cada pessoa
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", i+1);
            idades[i] = scanner.nextInt();
            System.out.printf("Digite a altura da pessoa %d (em metros): ", i+1);
            alturas[i] = scanner.nextDouble();
        }

        // Imprime as informações na ordem inversa
        System.out.println("Idades e alturas na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.printf("Pessoa %d: %d anos, %.2f metros\n", i+1, idades[i], alturas[i]);
        }
    }
    public void exercicio9(){
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = sc.nextInt();
        }

        int somaQuadrados = 0;

        for (int i = 0; i < 10; i++) {
            somaQuadrados += vetor[i] * vetor[i];
        }

        System.out.printf("A soma dos quadrados dos elementos do vetor é: %d", somaQuadrados);

        sc.close();
    }
}

    


