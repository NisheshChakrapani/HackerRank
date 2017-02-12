import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftShift {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        k = k%n;
        for (int i = 0; i < k; i++) {
            shift(a, n);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }

    private static void shift(int[] array, int size) {
        int temp = array[0];
        for (int i = 0; i < size-1; i++) {
            array[i] = array[i+1];
        }
        array[size-1] = temp;
    }
}
