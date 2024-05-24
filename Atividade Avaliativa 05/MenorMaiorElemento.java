/**
 * @(#)MenorMaiorElemento.java
 *
 *
 * @author Juliana
 * 23/05/2024
 */
import java.util.Scanner;
public class MenorMaiorElemento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[80];

        System.out.println("Entre com os 80 valores do vetor:");
        for (int i = 0; i < 80; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetor[i] = ler.nextInt();
        }

        int menorElemento = vetor[0];
        int maiorElemento = vetor[0];
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        for (int i = 1; i < 80; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
                posicaoMenor = i;
            }
            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Menor elemento: " + menorElemento + " na posição " + posicaoMenor);
        System.out.println("Maior elemento: " + maiorElemento + " na posição " + posicaoMaior);

        ler.close();
    }
}

