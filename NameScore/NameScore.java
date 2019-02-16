import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class NameScore {

  public static void main(String[] args) throws IOException {
    FileReader f = new FileReader("names.txt");
    Scanner scan = new Scanner(f);

    scan.useDelimiter(",");
    String[] arr = new String[0];
    int i = 0;
    //adds contents of scanner into array
    while(scan.hasNext()) {
      // continuously make array bigger (no empty spaces)
      String[] replace = new String[arr.length+1];
      for(int j = 0; j < arr.length; ++j) {
        replace[j] = arr[j];
      }
      arr = replace;
      //now read into the array
      String s = scan.next();
      arr[i] = s.replaceAll("^\"|\"$", ""); //remove quotes
      ++i;
    }

    Arrays.sort(arr);

    int score = 0;
    // calculate name scores
    for(int k = 0; k < arr.length; ++k) {
      String s = arr[k];
      int nameScore = 0;
      for(int m = 0; m < s.length(); ++m) {
        char letter = s.charAt(m);
        nameScore += (((int)letter)&0x1f);
      }
      score += (nameScore*(k+1));
    }
    System.out.println(score);
  }
}
