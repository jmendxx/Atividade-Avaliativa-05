/**
 * @(#)ValorIndiciImpar.java
 *
 *
 * @author Juliana
 * 22/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;   
public class ValorIndiciImpar {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números para o vetor: ");
        for(int i = 0; i < 5; i++){
            vetor[i] = ler.nextInt();
            
            if(i % 2 != 0){
                vetor[i] *= 10;
            }
        }

        System.out.println("Vetor atualizado:" + Arrays.toString(vetor));
    }
    
}
