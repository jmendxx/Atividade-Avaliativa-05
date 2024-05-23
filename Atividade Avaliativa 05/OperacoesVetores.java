/**
 * @(#)OperacoesVetores.java
 *
 *
 * @author Juliana
 * 22/05/2024
 */
import java.util.Scanner;
public class OperacoesVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        char[] operacoes = new char[10];
        double[] resultados = new double[10]; 

        System.out.println("Digite 10 valores para o vetor1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("vetor1[" + i + "] = ");
            vetor1[i] = ler.nextInt();
        }

        System.out.println("Digite 10 valores para o vetor2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("vetor2[" + i + "] = ");
            vetor2[i] = ler.nextInt();
        }

        System.out.println("Digite 10 operações aritméticas (+, -, *, /) para o vetor de operações:");
        for (int i = 0; i < operacoes.length; i++) {
            System.out.print("operacoes[" + i + "] = ");
            operacoes[i] = ler.next().charAt(0);
        }

        for (int i = 0; i < operacoes.length; i++) {
            switch (operacoes[i]) {
                case '+':
                    resultados[i] = vetor1[i] + vetor2[i];
                    break;
                case '-':
                    resultados[i] = vetor1[i] - vetor2[i];
                    break;
                case '*':
                    resultados[i] = vetor1[i] * vetor2[i];
                    break;
                case '/':
                    if (vetor2[i] != 0) {
                        resultados[i] = (double) vetor1[i] / vetor2[i];
                    } else {
                        System.out.println("Erro: Divisão por zero na posição " + i);
                        resultados[i] = Double.NaN; 
                    }
                    break;
                default:
                    System.out.println("Erro: Operação inválida '" + operacoes[i] + "' na posição " + i);
                    resultados[i] = Double.NaN;
                    break;
            }
        }

        System.out.println("Resultados das operações:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.printf("vetor1[%d] %c vetor2[%d] = %.2f%n", i, operacoes[i], i, resultados[i]);
        }

        ler.close();
    }
}

