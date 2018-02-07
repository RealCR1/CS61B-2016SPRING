
public class FindMinimumArray {
	
	public static int max(int[] m){
		int max = m[0];
		int i = 1;
		int max_index = Array.length(m) - 1;
		while (i <= max_index){
			if (max < m[i]){
				max = m[i];
				i = i + 1;
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));
	}	
}