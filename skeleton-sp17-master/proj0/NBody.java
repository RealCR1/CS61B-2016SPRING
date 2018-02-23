public class NBody {
	public static double readRadius(String filename)
	{
		In in = new In(filename);
		in.readLine();
		return in.readDouble();
	}


	public static Planet[] readPlanets(String filename)
	{
		In in = new In(filename);
		int planet_length = In.readInt();

		Planet[] planets = new Planet[planet_length];
		for(int i = 0; i < planet_length; i++)
		{
			planets[i] = readPlanets(in);
		}

		return planets
	}


	public static void main(String[] args) {
		double T = double.parseDouble(args[0]);
		double dt = double.parseDouble(args[1]);
		String filename = args[2];

		Planet[] plants = readPlanets(filename);
		double radius = readRadius(filename);



	}


}
