
public class MutiplesOf3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 1000;
		boolean[] arr = new boolean[max];
		int index = 1;
		int sum = 0;
		
		while (index*3 < max) {
			arr[index*3] = true;
			index++;
		}
		index = 1;
		while (index*5 < max) {
			arr[index*5] = true;
			index++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println(sum);
		
		

	}

}
