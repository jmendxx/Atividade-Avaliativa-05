/**
 * @(#)PreencherVetor.java
 *
 *
 * @author Juliana
 * 22/05/2024
 */
public class PreencherVetor {
    public static void main(String[] args) {

        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = 0; 
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d] = %d%n", i, vetor[i]);
        }
    }
}

