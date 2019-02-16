import java.math.BigInteger;

public class Factorial {

  public static void main(String[] args) {
    BigInteger power = BigInteger.ONE;
    for(int i = 1; i <= 100; ++i) {
      power = power.multiply(new BigInteger(""+i));
    }
    String s = power.toString();
    int total = 0;
    for(int i = 0; i < s.length(); ++i) {
      total += Integer.parseInt(s.substring(i,i+1));
    }
    System.out.println(total);
  }
}
