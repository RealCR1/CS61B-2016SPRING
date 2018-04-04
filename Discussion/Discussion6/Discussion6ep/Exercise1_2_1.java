public class Exercise1_2_1 {
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		Point2D[] points = new Point2D[input];

		drawPoints(points);

		System.out.println("The shortest distance is: " + %.3f + calculateDistance(points));

	}

	public static void drawPoints(Point2D[] points) {
		for (int i = 0; i < points.length - 1; i += 1) {
			double pointX = StdRandom.uniform();
			double pointY = StdRandom.uniform();

			Point2D point = new Point2D(pointX, pointY);

			points[i] = point;
		}
	}

	public static double calculateDistance(Point2D[] points) {
		double shortestDistance = 0.0;
		double distance = 0.0;
		for (int i = 1; i < points.length; i += 1) {
			distance = points[i].distanceTo(points[i - 1]);
			if (shortestDistance > distance) {
				shortestDistance = distance;
			}
		}
		return shortestDistance;
	}
}