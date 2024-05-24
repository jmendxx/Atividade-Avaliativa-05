/**
 * @(#)VetoresProdutoInverso.java
 *
 *
 * @author Juliana
 * 23/05/2024
 */
import java.util.Scanner;
public class VetoresProdutoInverso {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);

         double[] vetor1 = new double[10];
         double[] vetor2 = new double[10];
         double[] resultado = new double[20];

         System.out.println("Entre com os valores do vetor1 (10 valores):");
         for (int i = 0; i < vetor1.length; i++) {
             System.out.print("vetor1[" + i + "]: ");
             vetor1[i] = ler.nextDouble();
         }

         System.out.println("Entre com os valores do vetor2 (10 valores):");
         for (int i = 0; i < vetor2.length; i++) {
             System.out.print("vetor2[" + i + "]: ");
             vetor2[i] = ler.nextDouble();
         }

         double[] inversoVetor2 = new double[10];
         for (int i = 0; i < inversoVetor2.length; i++) {
             if (vetor2[i] != 0) {
                 inversoVetor2[i] = 1 / vetor2[i];
             } else {
                 inversoVetor2[i] = 0;
                 System.out.println("Aviso: Divisão por zero no vetor2[" + i + "], inverso considerado como 0.");
             }
         }

         double[] produto = new double[10];
         for (int i = 0; i < produto.length; i++) {
             produto[i] = vetor1[i] * inversoVetor2[i];
         }

         int centro = 10;
         for (int i = 0; i < 10; i++) {
             resultado[centro - 1 - i] = produto[2 * i]; 
             resultado[centro + i] = produto[2 * i + 1]; 
         }

         System.out.println("Vetor Resultado:");
         for (double v : resultado) {
             System.out.print(v + " ");
         }
 
         ler.close();
     }
 }