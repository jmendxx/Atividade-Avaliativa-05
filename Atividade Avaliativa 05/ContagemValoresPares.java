/**
 * @(#)ContagemValoresPares.java
 *
 *
 * @author Juliana
 * 23/05/2024
 */
import java.util.Scanner;
public class ContagemValoresPares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Entre com os 20 valores do vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetor[i] = ler.nextInt();
        }

        int contadorPares = 0;
        for (int i = 0; i < 20; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de valores pares no vetor: " + contadorPares);

        ler.close();
    }
}
