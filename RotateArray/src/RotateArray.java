import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
//20 10
// 41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51

// 77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77

public class RotateArray {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        // d is position not from index 
        // so d = d - 1 for indexing
        
        int [] b = new int[a.length];

        d = d - 1;

        for (int i = 0; i < a.length; i++)
        {
            if ( i <= d)
                b[i + (a.length - d - 1)] = a[i];
            else
                b[i - d - 1] = a[i];
        }
        
        
        return b;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
