import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    
    public void exemplo1(){
        //criar preencher e manipular a matriz
        //declarar a matriz
        int matriz[][]= new int[10][9];//2 dimensões
        //preencher a minha matriz
        for(int i=0; i<10;i++){// 1°dimensão
            for(int j=0;j<9;j++){// 2° dimensão
                System.out.println("matriz["+i+"]["+j+"]=");
                matriz[i][j]=rd.nextInt(9);//usando random


            }
        }
        //impressão dos elementos da matriz individual
        for(int i=0; i<10;i++){//1° dimensão
            for(int j=0;j<9;j++){//2° dimensão 
            System.out.println("matriz["+i+"]["+j+"]=" +matriz [i][j]);
            

            }
        }
        //imprimir em formato de matriz 10x9
        for(int i=0; i<10; i++){//1° dimensão
            System.out.println("|");
            for(int j=0; j<9; j++){//2° dimensão
                System.out.println(matriz[i][j]+"");

            }
            System.out.println("|");
    
        }
        //somar todos os elementos da 4ª linha
        int somaLinha = 0;
        for (int i = 0; i < matriz[3].length; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println(" A soma da 4º linha é "+somaLinha);

        //somar todos os elementos da 4ª coluna
        int somaColuna = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println(" A soma da 4º coluna é "+somaColuna);
    }

        public void exercicio1(){
           int matriz[][] = new int[5][5];
           for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[0].length; j++){
                if (i==j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
           }
        }
        public void exercicio2(){
            

        }
}
