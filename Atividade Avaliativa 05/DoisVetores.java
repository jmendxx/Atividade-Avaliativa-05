/**
 * @(#)DoisVetores.java
 *
 *
 * @author Juliana
 * 21/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;
public class DoisVetores {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Digite 5 números:");

        for(int i = 0; i < 5; i++){
            System.out.println("Número " + (i + 1) + ": ");
            vetor1[i] = ler.nextInt();
            vetor2[i] = vetor1[i] + 2;
        }

        System.out.println("Os números do primeiro vetor são: " + Arrays.toString(vetor1));
        System.out.println("Os números do segundo vetor são:" + Arrays.toString(vetor2));
    }
    
}
