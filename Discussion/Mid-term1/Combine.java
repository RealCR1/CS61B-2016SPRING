public class Combine {
	public static int combine(ComFunc f, int[] x) {
		if (x == null) {
			return null;
		}
		if (x.length == 1) {
			return x[0];
		}
		return helper(f, x);

	}

	private static int helper(Function f, int[] x) {
		int m = f.apply(x[0], x[1]);
		for (int i = 2, i < x.length; i += 1) {
			m = f.apply(x[i], m);
		}
		return m;
	}
}