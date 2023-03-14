package ExerciciosIfElse;

import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class Exercicios {

Scanner sc = new Scanner(System.in);

public void exercicio1(){
System.out.println("Informe o primeiro valor");
double primeiroValor = sc.nextDouble();
System.out.println("Informe o Segundo Valor ");
double segundoValor = sc.nextDouble();
if (primeiroValor>=segundoValor){
    System.out.println("O maior Valor é "+primeiroValor);
}
if (segundoValor>=primeiroValor){
    System.out.println("O maior valor é"+segundoValor);
}
}
public void exercicio2(){
    System.out.println("Informe o Ano de seu Nascimento");
    int anoNascimento = sc.nextInt();
    int idade = 2023 - anoNascimento;
    if (idade>16){
        |System.out.println("Idade maior que 16 pode votar");
    } else {
        System.out.println("Idade menor que 16 Não pode votar");
    }
}
public void exercicio3(){
    System.out.println("Digite a senha de 4 dígitos");
    int senha = sc.nextInt();
    if (senha == 1234){
        System.out.println("Acesso Permitido");
    } else {
        System.out.println("Acesso Negado");
    }
}
public void exercicio4(){
    System.out.println("Quantidade de maçãs desejadas");
    int quantidadesMacas= sc.nextInt();
    double valorMaca;
    if (quantidadesMacas >=12){
 valorMaca= 0.25;
    } else{
        valorMaca = 0.30;
    }
    double valorCompra= quantidadesMacas * valorMaca;
    System.out.println("Valor da compra é + valor final");
}

public void exercicio5(){
    System.out.println("Digite um numero");
 int um = sc.nextInt();
 System.out.println("Agora, digite outro numero");
 int dois = sc.nextInt();
 System.out.println("Digite mais um numero");
 int tres = sc.nextInt();
 int primeiro;
 int segundo;
 int terceiro;
 if (um>dois && dois>tres){
    primeiro = um;
    segundo = tres;
    terceiro = dois;
  }
   else if (um>dois && dois<tres){
    primeiro = dois;
    segundo = um;
    terceiro = tres;
  }
  else if (dois>um && um>tres){
    primeiro = dois;
    segundo = tres;
    terceiro = um;
  }
  else if (tres>um && um>dois){
    primeiro = tres;
    segundo = um;
    terceiro = dois;
  }
  else{
    primeiro = tres;
    segundo = dois;
    terceiro = um;
  }
System.out.println("Do maior para o menor fica: primeiro, segundo, terceiro");
}

public void exercicio6(){
System.out.println("Digite seu sexo (1:Feminino - 2:Masculino)");
int sexo = sc.nextInt();
System.out.println("Digite sua altura (em metros)");
double altura = sc.nextDouble();
double pesoIdeal;
if (sexo == 1){
    pesoIdeal = (62.1*altura)-44.7;
}
else{
    pesoIdeal = (72.7*altura)-58;
}
System.out.println("Seu peso ideal é de "+pesoIdeal+"KG");

}

public void ex7(){
    System.out.println("Digite a primeira nota do aluno:");
    int nota1 = sc.nextInt;
    System.out.println("Digite a segunda nota do aluno:");
    int nota2 = sc.nextInt();
    System.out.println("Digite a frequencia do aluno;");
    int freq = sc.nextInt();
    double notaMedia = (nota1+nota2)/2;
    if (notaMedia >=50 && freq >= 75){
        System.out.println("O aluno está aprovado");
    } else {
        System.out.println("O aluno está reprovado");
    }
  }
}
    

