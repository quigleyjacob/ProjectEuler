public class Spiral {

    public static void main(String[] args) {
      int n = 1001*1001;
      int skip = 1;
      int counter = 0;
      long total = 0;
      for(int i = 1; i <= n; ++i) {
        total += (long)i;
        ++counter;
        i += skip;
        if(counter % 4 == 0) {
          skip += 2;
        }

      }
      System.out.println(total);
    }

}
