public class Palindrome {

    public static boolean isPalindrome(String str) {
        for (int k = 0; k < str.length()/2; k++) {
            if (str.charAt(k) != str.charAt(str.length()-k-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pal = "0";
        int num1 = 0;
        int num2 = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                String str = "" + (i*j);
                if (isPalindrome(str)) {
                    if (Integer.parseInt(str) > Integer.parseInt(pal)) {
                        pal = str;
                        num1 = i;
                        num2 = j;
                    }
                }
            }
        }
        System.out.println(num1 + " * " + num2 + " = " + pal);
    }
}


int sum = 0;
for (int i = 0; i <= 100; i++) {
    sum = sum + i;
}
23 % 2
