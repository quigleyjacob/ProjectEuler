public class LongestCollatz {

  public static long[] lengthOfSequence = new long[1000001];

  public static long collatz(long k, long length) {
  //  System.out.println(k);
    if(k == 1) {
      return ++length;
    }
    if(k < lengthOfSequence.length && lengthOfSequence[(int)k] != 0) {
      return length + lengthOfSequence[(int)k];
    }
    if (k % 2 == 0) {
      return collatz(k/2, ++length);
    }
    else {
      return collatz(3*k+1, ++length);
    }
    // return count;
  }

  public static void main(String[] args) {

    int n = 1000000;
    //System.out.println(collatz(13,0));
    long answer = 0;

    for (int i = 1; i <= n; i++) {
      long check = collatz(i, 0);
      lengthOfSequence[i] = check;
      //System.out.println(check);
      if(check > answer) {
        System.out.println(i + " " + check);
        answer = check;
      }
    }
    System.out.println(answer);



  }
}
