/**
 * @(#)SomaDoisVetores.java
 *
 *
 * @author Juliana
 * 21/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;
public class SomaDoisVetores {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] vetor1 = {10,20,30,4,5,40,55,2,35,8};
        int[] vetor2 = {4,14,23,1,5,43,14,18,16,3};
        int[] somaVetor = new int[10];
        
        for(int i = 0; i < 10; i++){
            somaVetor[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("O resultado da soma dos dois vetores é: " + Arrays.toString(somaVetor));

    }

}
