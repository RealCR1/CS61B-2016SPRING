public class FindDuplicate {
	//If you want to the outcome whether the array has the same item?


/*	Silly solution
	In an iteration
	Comparing item from the second item with the first,
	Doing in the same way. 
	*/
	public static boolean duplicate1(int[] a) {
		for(int i = 0; i < a.length; i ++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					return true;
				}
			}
		}
		return false;
	}

/*	Better solution
	
	Take advantage of the sorted nature of our array.
	In a sorted array, the same item must be neighbored with each other.

	So compare 1th and 2nd item, if false, check 2nd with 3rd and so on.
	*/
	public static boolean duplicate2(int[] a) {
		for (int i = 0; i < a.length - 1; i += 1) {
			if (a[i] == a[i + 1]) {
				return true;
			}
		}
		return false;
	}
}

