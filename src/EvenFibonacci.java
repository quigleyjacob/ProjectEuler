
public class EvenFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib = new int[100];
		int first = 1;
		int second = 2;
		fib[0] = first;
		fib[1] = second;
		int sum = 0;
		
		for (int i = 2; i < fib.length; i++) {
			int next = first + second;
			first = second;
			second = next;
			if (next < 4000000) {
				fib[i] = next;
			} else {
				i = fib.length;
			}
		}
		for (int i = 0; i < fib.length; i++) {
			if ((fib[i] % 2 == 0) && (fib[i] != 0)) {
				System.out.print(fib[i] + " ");
				sum += fib[i];
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
