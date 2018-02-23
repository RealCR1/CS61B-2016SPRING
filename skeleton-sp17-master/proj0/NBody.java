public class NBody {
	public static double readRadius(String filename)
	{
		In in = new In(filename);
		in.readLine();
		return in.readDouble();
	}




	public static void main(String[] args) {
		double T = double.parseDouble(args[0]);
		double dt = double.parseDouble(args[1]);
		String filename = args[2];

		Planet[] plants = readPlanets(filename);
		double radius = readRadius(filename);



	}


}
