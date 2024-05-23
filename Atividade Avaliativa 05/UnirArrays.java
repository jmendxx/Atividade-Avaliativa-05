/**
 * @(#)UnirArrays.java
 *
 *
 * @author Juliana
 * 21/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;  
public class UnirArrays {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] x = new int[10];
        int[] y = new int[10];
        

        System.out.println("Digite " + x.length + " números para o array X: ");
        for(int i = 0; i < x.length; i++){
            System.out.print((i + 1) +"° - ");
            x[i]= ler.nextInt();
        }

        System.out.println("Digite " + x.length + " números para o array Y: ");
        for(int i = 0; i < y.length; i++){
            System.out.print((i + 1) + "° - ");
            y[i]= ler.nextInt();
        }

        int[] z = new int[x.length + y.length];

        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }

        // Copiando os elementos de y para z
        for (int i = 0; i < y.length; i++) {
            z[x.length + i] = y[i];
        }

        System.out.println("Array resultante z (unindo x e y):" + Arrays.toString(z));

        ler.close();
    }
}
