/**
 * @(#)OrdenacaoVetor.java
 *
 *
 * @author Juliana
 * 23/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;
public class OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorOriginal = new int[10];
        int[] vetorOrdenado = new int[10];

        System.out.println("Entre com os 10 valores do vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetorOriginal[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorOrdenado[i] = vetorOriginal[i];
        }

        Arrays.sort(vetorOrdenado);

        System.out.println("Vetor Original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }

        System.out.println("\nVetor Ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorOrdenado[i] + " ");
        }

        ler.close();
    }
}
