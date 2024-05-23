/**
 * @(#)ResultadoInvertido.java
 *
 *
 * @author Juliana
 * 21/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;
public class ResultadoInvertido {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] vetor1 = {10,20,30,4,5,40,55,2,35,8};
        int[] vetor2 = {4,14,23,1,5,43,14,18,16,3};
        int[] somaVetor = new int[10];

        
        for(int i = 0; i < 10; i++){
            somaVetor[i] = vetor1[i] + vetor2[i];
        }

        int[] somaInv = new int[somaVetor.length];
        for(int i = 0; i < somaVetor.length; i++){
            somaInv[i] = somaVetor[somaVetor.length - 1 - i];

        }

        /*for(int i = 0; i < somaVetor.length / 2; i++){
            int temp = somaVetor[i];
            somaVetor[i] = somaVetor[somaVetor.length- 1 - i];
            somaVetor[somaVetor.length - 1 - i] = temp;
        }*/

        System.out.println("O resultado da soma dos dois vetores inverso é: " + Arrays.toString(somaInv));

        ler.close();

    }

}
