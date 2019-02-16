import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
public class LargeSum {

  public static void main(String[] args) throws IOException{
    FileReader f = new FileReader("values.txt");
    Scanner s = new Scanner(f);
    BigInteger[] arr = new BigInteger[100];
    BigInteger sum = BigInteger.ZERO;
    while(s.hasNextLine()) {
      String str = s.nextLine();
      BigInteger val = new BigInteger(str);
      sum = sum.add(val);

    }
    System.out.println(sum.toString().substring(0,10));



  }
}
