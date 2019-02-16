public class Amicable {

  public static void main(String[] args) {
    int NUM = 10000;
    int[] arr = new int[NUM];
    for(int i = 1; i < NUM; ++i) {
      //System.out.println(d(i));
      arr[i] = d(i);
    }
    int amicable = 0;
    for(int i = 1; i < arr.length; ++i) {
      if(arr[i] < arr.length) {
        if(i == arr[arr[i]]) {
          if(i != arr[i]) {
            amicable += i;
            System.out.println(i + " " + arr[i] + " " + arr[arr[i]]);

          }
        }
      }
    }
    System.out.println(amicable);
  }

  private static int d(int a) {
    // System.out.println("\n"+a);
    int total = 0;
    for (int i = 1; i < a; ++i) {
      if(a % i == 0) {
        // System.out.println(" "+i);
        total += i;
      }
    }
    return total;
  }
}
