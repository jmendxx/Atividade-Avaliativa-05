/**
 * @(#)CincoNumIntSoma.java
 *
 *
 * @author Juliana
 * 21/05/2024
 */
import java.util.Scanner;
public class CincoNumIntSoma {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] num = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números: ");

        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + "° - ");
            num[i] = ler.nextInt();
            soma += num[i];
        }
     
        System.out.println("Os número digitados foram: " + num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4]);
        System.out.println("A soma desses números é: " + soma);

        ler.close();
    }
}
