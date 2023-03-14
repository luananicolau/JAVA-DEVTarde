package CalculdoraVelocidade2Scanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public void calcular(){
  Scanner sc = new Scanner (System.in);    
   System.out.println("Informe a Distancia Percorrida"); 
   double distanciaPercorrida = sc.nextDouble();
   System.out.println("A distancia percorrida foi de "
   +distanciaPercorrida+ " km");
   System.out.println( "Informe o Tempo Gasto na Viagem");
   double tempoGasto = sc .nextDouble();
   System.out.println( "O Tempo Gasto Na Viagem foi de"
   + tempoGasto  + "horas");
   sc.close();
   double velocidadeMedia = distanciaPercorrida/tempoGasto;
   System.out.println("A Velocidade Media foi de "
   +velocidadeMedia+"km/h");
   


}
}