/**
 * @(#)VerificarNumeroNoVetor.java
 *
 *
 * @author Juliana
 * 22/05/2024
 */
import java.util.Scanner;
public class VerificarNumeroNoVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        System.out.print("Digite um número para verificar se está no vetor: ");
        int numero = ler.nextInt();

        boolean encontrado = false;
        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("O número " + numero + " não se encontra no vetor.");
        }

        ler.close();
    }
}
