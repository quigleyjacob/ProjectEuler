public class SummationOfPrimes {

  public static boolean isPrime(int n) {
    for (int i = 2; i <= (int)Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    int n = 2000000;
    long sum = 2;
    for (int i = 3; i < n; i+=2) {
      if(isPrime(i)) {
        sum += i;
      }
    }
    System.out.println(sum);



  }

}
