public static int binarySearch(String[] sorts, String x, int low, int high) {
	if (low > high) {
		return -1;
	}
	int m = (low + high) / 2;
	int cmp = x.compareTo(sorts[m]);
	if (cmp < 0) {
		return binarySearch(sorts, x, low, m-1);		
	} else if (cmp > 0) {
		return binarySearch(sorts, x, m+1, high);
	} else {
		return m;
	}
}