
public class HWExercise2 {
	
	public static int max(int[] m) {
		int i = 0;
		int max_number = m[i];
		
		while (i < (m.length - 1)) {
			if (max_number < m[i])
				max_number = m[i];

			i = i + 1;
		}
		return max_number;

	}

	public static void main(String[] args){
		int[] numbers = new int[] {9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));
		
	}	
}