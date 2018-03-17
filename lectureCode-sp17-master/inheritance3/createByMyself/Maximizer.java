public class Maximizer {
	public static OurComparable max(OurComparable[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i ++) {
			int cmp = items[i].compareTo(item[maxDex]);
			int (cmp) {
				maxDex = i;
			}
		}
		return items[maxDex];
	}
}