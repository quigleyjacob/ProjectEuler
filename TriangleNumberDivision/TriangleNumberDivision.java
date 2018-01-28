public class TriangleNumberDivision {

  public static void main(String[] args) {

    boolean notDone = true;
    int threshold = 500;
    long n = 0; //number to determine divisors
    long i = 1; //to be incremented and added to n
    while(notDone) {
      n += i;
      i++;
      int count = 0;
      for (int j = 1; j <= Math.sqrt(n); j++) {
        if (n % j == 0) {
          count+=2;
        }
      }
      if (count > threshold) {
        notDone = false;
      }
    }
    System.out.println(n);


  }
}
