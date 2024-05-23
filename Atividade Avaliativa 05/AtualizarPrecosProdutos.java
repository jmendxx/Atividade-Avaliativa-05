/**
 * @(#)AtualizarPrecosProdutos.java
 *
 *
 * @author Juliana
 * 21/05/2024
 */
import java.util.Scanner;
public class AtualizarPrecosProdutos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] descricoes = new String[5];
        double[] precos = new double[5];

        for (int i = 0; i < descricoes.length; i++) {
            System.out.print("Digite a descrição do produto " + (i + 1) + ": ");
            descricoes[i] = ler.nextLine();
            System.out.print("Digite o preço de venda do produto " + (i + 1) + ": ");
            precos[i] = ler.nextDouble();
            ler.nextLine();
        }

        for (int i = 0; i < precos.length; i++) {
            precos[i] = precos[i] * 1.10;
        }

        System.out.println("Descrições e novos preços de venda:");
        for (int i = 0; i < descricoes.length; i++) {
            System.out.printf("Produto: %s - Novo preço: %.2f%n", descricoes[i], precos[i]);
        }

        ler.close();
    }
}
