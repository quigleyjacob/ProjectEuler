import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class LargestProductGrid {

  public static void main(String[] args) throws IOException {
    FileReader f = new FileReader("values.txt");
    Scanner s = new Scanner(f);

    int[][] array = new int[28][28];
    for(int i = 4; i < 24; ++i) {
      for(int j = 4; j < 24; ++j) {
        array[i][j] = s.nextInt();
      }
    }

    int max = 0;
    for(int i = 4; i < 24; ++i) {
      for(int j = 4; j < 24; ++j) {
        int check = maxAt(i,j,array);
        if(check > max) {
          max = check;
        }
      }
    }
    System.out.println(max);
  }

    private static int maxAt(int row, int col, int[][] arr) {
      int zero = arr[row][col]*arr[row-1][col]*arr[row-2][col]*arr[row-3][col];
      int oneThirty = arr[row][col]*arr[row-1][col+1]*arr[row-2][col+2]*arr[row-3][col+3];
      int three = arr[row][col]*arr[row][col+1]*arr[row][col+2]*arr[row][col+3];
      int fourThirty = arr[row][col]*arr[row+1][col+1]*arr[row+2][col+2]*arr[row+3][col+3];
      int six = arr[row][col]*arr[row+1][col]*arr[row+2][col]*arr[row+3][col];
      int sevenThirty = arr[row][col]*arr[row+1][col-1]*arr[row+2][col-2]*arr[row+3][col-3];
      int nine = arr[row][col]*arr[row][col-1]*arr[row][col-2]*arr[row][col-3];
      int tenThirty = arr[row][col]*arr[row-1][col-1]*arr[row-2][col-2]*arr[row-3][col-3];
      return Math.max(Math.max(Math.max(zero, oneThirty), Math.max(three, fourThirty)), Math.max(Math.max(six, sevenThirty), Math.max(nine, tenThirty)));

    }
}
