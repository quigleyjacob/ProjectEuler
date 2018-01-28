public class TenThousandAndOnePrime {

  public static boolean isPrime(int n) {
    for (int i = 2; i <= (int)Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int count = 2;
    int prime = 3;
    while (count < 10001) {
      // System.out.println((int)Math.sqrt(prime));
      prime+=2;
      if (isPrime(prime)) {
        count++;
      }
    }
    System.out.println(prime);

  }

}
