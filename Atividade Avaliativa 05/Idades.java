/**
 * @(#)Idades.java
 *
 *
 * @author Juliana
 * 21/05/2024
 */
import java.util.Scanner;
public class Idades {
      public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] idades = new int[6];
        int[] novasIdades = new int[6];

        System.out.println("Digite 6 idades: ");

        for(int i = 0; i < 6; i++){
            System.out.print((i + 1) + "° - ");
            idades[i] = ler.nextInt();
            novasIdades[i] = idades[i] + 3;
        }

        System.out.println("As novas idades são: " + novasIdades[0] + ", " + novasIdades[1] + ", " + novasIdades[2] + ", " + novasIdades[3] + ", " + novasIdades[4] + ", " + novasIdades[5]);
        
        ler.close();
    }
}
