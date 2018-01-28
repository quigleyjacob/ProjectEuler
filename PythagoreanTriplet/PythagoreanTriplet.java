public class PythagoreanTriplet {

  public static boolean isTriplet(int a, int b, int c) {
    return a*a + b*b == c*c;
  }

  public static void main(String[] args) {

    int n = 1000;

    for (int a = 1; a < n/3; a++) {
      int b = a + 1;
      int c = n - a - b;
      while(b < c) {
          if (isTriplet(a,b,c)) {
            System.out.println(a*b*c);
            a = n;
            b = n;
          }
        b++;
        c--;
      }
    }


  }

}
