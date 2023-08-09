package listaExtra;

public class ListaExtraMatriz {

    public void exercicio1() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // criando a matriz
        int[][] matriz = new int[4][4];

        // Preencher a matriz com o produto da linha e da coluna de cada elemento
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
            }
        }

        // Imprimir a matriz na tela
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exercicio2() {
        int[][] matriz = new int[4][4];
        Random rand = new Random();

        // Preencher a matriz com valores aleatórios entre 1 e 100
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
            }
        }

        // Imprimir a matriz na tela
        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Encontrar a localização do maior valor na matriz
        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        // Imprimir a localização do maior valor na matriz
        System.out.println("Maior valor: " + maior);
        System.out.println("Localização: linha " + (linha + 1) + ", coluna " + (coluna + 1));
    }

    }

    public void exercicio3() {

        int[][] matriz = new int[5][5];
        Random rand = new Random();

        // Preencher a matriz com valores aleatórios entre 1 e 100
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
            }
        }

        // Imprimir a matriz na tela
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Lê o valor X a ser buscado na matriz
        System.out.print("Digite um valor a ser buscado na matriz: ");
        int x = input.nextInt();

        // Buscar o valor X na matriz
        boolean encontrado = false;
        int linha = -1;
        int coluna = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    encontrado = true;
                    linha = i;
                    coluna = j;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        // Imprimir a localização do valor X ou mensagem de não encontrado
        if (encontrado) {
            System.out
                    .println("O valor " + x + " foi encontrado na linha " + (linha + 1) + " e coluna " + (coluna + 1));
        } else {
            System.out.println("O valor " + x + " não foi encontrado na matriz");
        }
    }

    public void exercicio4() {

        int[][] A = new int[10][10];

        // Preencher a matriz A de acordo com as condições
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    A[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    A[i][j] = 3 * i * i - 1;
                } else {
                    A[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        // Imprimir a matriz A na tela
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exercicio5() {

        int[][] matriz = new int[5][4];
        int matriculaMaiorNota = 0;
        int maiorNota = 0;
        int somaNotasFinais = 0;

        Scanner entrada = new Scanner(System.in);

        // Leitura das informações dos alunos
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as informações do aluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            matriz[i][0] = entrada.nextInt();
            System.out.print("Média das provas: ");
            matriz[i][1] = entrada.nextInt();
            System.out.print("Média dos trabalhos: ");
            matriz[i][2] = entrada.nextInt();

            // Cálculo da nota final
            matriz[i][3] = matriz[i][1] + matriz[i][2];
        }

        // Encontrar o aluno com a maior nota final
        for (int i = 0; i < 5; i++) {
            int notaFinal = matriz[i][3];
            somaNotasFinais += notaFinal;

            if (notaFinal > maiorNota) {
                maiorNota = notaFinal;
                matriculaMaiorNota = matriz[i][0];
            }
        }

        // Imprimir a matrícula do aluno com a maior nota final
        System.out.println("Matrícula do aluno com a maior nota final: " + matriculaMaiorNota);

        // Imprimir a média aritmética das notas finais
        double mediaNotasFinais = somaNotasFinais / 5.0;
        System.out.println("Média aritmética das notas finais: " + mediaNotasFinais);
    }

    public void exercicio6(){
    
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        Scanner entrada = new Scanner(System.in);

        // Leitura da matriz A
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = entrada.nextInt();
            }
        }

        // Leitura da matriz B
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = entrada.nextInt();
            }
        }

        // Calcular matriz C
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Impressão da matriz C
        System.out.println("Matriz C resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
