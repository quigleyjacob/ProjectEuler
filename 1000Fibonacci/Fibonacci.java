import java.math.BigInteger;

public class Fibonacci {

  public static void main(String[] args) {
    BigInteger f1 = new BigInteger("1");
    BigInteger f2 = new BigInteger("1");
    int i = 2;
    do {
      BigInteger next = f1.add(f2);
      f1 = f2;
      f2 = next;
      ++i;
    } while (f2.toString().length() < 1000);
    System.out.println(i);

  }
}
