/**
 * @(#)SomaDoisArrays.java
 *
 *
 * @author Juliana
 * 22/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;
public class SomaDoisArrays {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int[] array1 = {10,20,13,4,5,40,55,2,35,8};
        int[] array2 = {4,14,23,1,55,43,14,18,16,3};
        int[] somaArrays = new int[10];
        
        for(int i = 0; i < 10; i++){
            somaArrays[i] = array1[i] + array2[i];
        }

        System.out.println("O resultado da soma dos dois arrays é: " + Arrays.toString(somaArrays));

        ler.close();

    }

}
