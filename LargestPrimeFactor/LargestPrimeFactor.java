public class LargestPrimeFactor {

	public static void main(String[] args) {
		long n = 600851475143L;
		long num = n;
		for (long i = 1; i < n; i++) {
			if (num % i == 0) {
				num /= i;
				if (num == 1) {
					System.out.println(i);
				}
			}
		}
	}
}
