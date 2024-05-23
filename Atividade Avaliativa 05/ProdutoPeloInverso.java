/**
 * @(#)ProdutoPeloInverso.java
 *
 *
 * @author Juliana
 * 22/05/2024
 */
import java.util.Scanner;
public class ProdutoPeloInverso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] vetor1 = new double[20];
        double[] vetor2 = new double[20];
        double[] resultado = new double[20];

        System.out.println("Digite 20 valores para o vetor1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("vetor1[" + i + "] = ");
            vetor1[i] = ler.nextDouble();
        }

        System.out.println("Digite 20 valores para o vetor2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("vetor2[" + i + "] = ");
            vetor2[i] = ler.nextDouble();
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor2[i] != 0) {
                resultado[i] = vetor1[i] * (1.0 / vetor2[i]);
            } else {
                System.out.println("Erro: Divisão por zero na posição " + i);
                resultado[i] = Double.NaN; 
            }
        }

        System.out.println("Resultado do produto do primeiro vetor pelo inverso do segundo:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("resultado[%d] = %.2f%n", i, resultado[i]);
        }

        ler.close();
    }
}

