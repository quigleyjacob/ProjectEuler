import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class MaxPathTriangle {

  public static void main(String[] args) throws IOException{
    String filename = args[0];
    FileReader f = new FileReader(filename);
    Scanner s = new Scanner(f);
    int[][] arr = new int[100][100];

    int i = 0;
    while(s.hasNextInt()) {
      for (int j = 0; j <= i; ++j) {
        arr[i][j] = s.nextInt();
        System.out.println(arr[i][j]);
      }
      // arr[i] = s.nextInt();
      // System.out.println(arr[i]);
      ++i;
    }

    for(int m = arr.length-2; m >= 0; --m) {
      for(int n = 0; n <= m; n++) {
        arr[m][n] += Math.max(arr[m+1][n], arr[m+1][n+1]);
      }
    }
    System.out.println(arr[0][0]);

  }
}
