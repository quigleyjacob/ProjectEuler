public class SmallestMultiple {

    public static boolean isDivisible(int num) {
        for (int i = 1; i <= 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static int smallestMultiple(int num) {
        while(!isDivisible(num)) {
            num += 2;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 2522;
        System.out.println(smallestMultiple(num));
    }
}
