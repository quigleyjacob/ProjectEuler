public class Lattice {

  public static long total = 0;
  public static int size = 2;

  public static void main(String[] args) {
    size = Integer.parseInt(args[0]);
    path(0,0);
    System.out.println(total);
  }

  private static void path(int row, int col) {
    if(row == size && col == size) {
      ++total;
      return;
    }
    if(row > size || col > size) {
      return;
    }
    path(row+1, col);
    path(row, col+1);
  }

}
