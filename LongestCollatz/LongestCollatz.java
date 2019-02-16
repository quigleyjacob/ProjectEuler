public class LongestCollatz {

  public static long collatz(int k) {
    long original = k;
    long count = 0;
    while (k != 1) {
      if (k % 2 == 0) {
        k /= 2;
      } else {
        k = 3*k + 1;
      }
      count++;
    }
    return count;
  }

  public static void main(String[] args) {

    int n = 1000000;

    long length = 0;
    long answer = 0;

    for (int i = 1; i <= n; i+=2) {
      long coll = collatz(i);
      if (coll > length) {
        length = coll;
        answer = i;
        System.out.println(length + " " + answer);
      }
    }
    System.out.println(answer);



  }
}
