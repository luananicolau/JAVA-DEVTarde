package iteracaoWhile;

public class ExerciciosWhile {

    public void exercicio1(){
        //B[i]=A[i]
    int vetorA[]= new int[]{3,5,7,11,13};
    int vetorB[]=  new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){
        vetorB[i]=vetorA[i];
        System.out.println("VetorB["+i+"]="+vetorB[i]);
        i++;
    }
     }
    public void exercicio2(){
        int vetorA[] = new int[]{3,5,7,11,13,15,17,19};
        int vetorB[] = new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]= vetorA[6 *2];
            System.out.println("VetorB["+i+"]= "+vetorB[i]);
            i++;
        }
    }
    public void exercicio3(){
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorB[] = new int[vetorA.length];
        int i=0;
        while(i<vetorA.length){
            vetorB[i]=vetorA[i]*vetorA[i];
            System.out.println("vetorB["+i+"]= "+vetorB[i]);
            i++;
        }

    }
    
public void exercicio4(){
    int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int VetorB[] = new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){
        VetorB[i]= (int) Math.sqrt(vetorA[i]);
        System.out.println("vetorB["+i+"]= "+VetorB[i]);
        i++;
}
}

public void exercicio5 (){
    
}
}