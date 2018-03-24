/** In order to get a better solution video
	I chose mid-term-1 in Spring 2018 instead of mid-term-1 in Spring 2017.
	This is Part 4 Sans (a) in spring 2018.
	
	@author Jonathan Wang.
	*/
public static IntList dilsans(IntList x, int y) {
	if (x == null) {
		return null;
	}
	x.rest = dilsans(x.rest, y);
	if (x.first == y) {
		return x.rest;
	}
	return x;
}