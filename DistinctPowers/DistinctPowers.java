import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;

public class DistinctPowers {

  public static void main(String[] args) {
    Set<BigInteger> vals = new HashSet<BigInteger>();
    for(int a = 2; a <= 100; ++a) {
      for(int b = 2; b <= 100; ++b) {
        BigInteger val = new BigInteger(a+"");
        val = val.pow(b);
        vals.add(val);
      }
    }
    System.out.println(vals.size());
  }
}
