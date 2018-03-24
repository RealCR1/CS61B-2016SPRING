/** In order to get a better solution video
	I chose mid-term-1 in Spring 2018 instead of mid-term-1 in Spring 2017.
	This is Part 4 Sans (a) in spring 2018.
	
	@author Jonathan Wang.
	*/

public static int[] sans(int[] x, int y) {
	int[] xclean = new int[x.length];
	int c = 0;
	for (int i = 0; i < x.length; i += 1) {
		if (x[i] != y) {
			xclean[c] == x[i];
			c += 1;
		}
	}
	int[] r = new int[c];
	System.arraycopy(xclean, 0, r, 0, c);
	return r;
}