/**
 * @(#)OrdenacaoVetorDecrescente.java
 *
 *
 * @author Juliana
 * 23/05/2024
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoVetorDecrescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Integer[] vetorOriginal = new Integer[10];
        Integer[] vetorOrdenado = new Integer[10];

        System.out.println("Entre com os 10 valores do vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetorOriginal[i] = ler.nextInt();
        }

        System.arraycopy(vetorOriginal, 0, vetorOrdenado, 0, 10);

        Arrays.sort(vetorOrdenado, Collections.reverseOrder());

        System.out.println("Vetor Original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }

        System.out.println("\nVetor Ordenado (Decrescente):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorOrdenado[i] + " ");
        }

        ler.close();
    }
}

