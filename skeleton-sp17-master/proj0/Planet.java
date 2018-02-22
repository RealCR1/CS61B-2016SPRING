public class Planet {
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	double G_constant = (6.67e-11);

	public Planet(double xP, double yP, double xV,
					double yV, double m, String img) 
	{
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;

	}

	public Planet(Planet p)
	{
		xxPos = p.xxPos;
		yyPos = p.yyPos;
		xxVel = p.xxVel;
		yyVel = p.yyVel;
		mass = p.mass;
		imgFileName = p.imgFileName;

	}
	public double calcForceExertedBy(Planet p)
	{
		if (equals(p))
		{
			return 0;
		}
		double r = calcDistance(p);
		return G_constant * mass * p.mass / Math.pow(r, 2);
	}


	public double calcForceExertedByX(Planet p)
	{
		double dx = p.xxPos - xxPos;
		double f = calcForceExertedBy(p);
		double r = calcDistance(p);
		double fx = f * dx / r;
		return fx;
	}


	public double calcForceExertedByY(Planet p)
	{
		double dy = p.yyPos - yyPos;
		double f = calcForceExertedBy(p);
		double r = calcDistance(p);
		double fy = f * dy / r;
		return fy;
	}


	public double calcDistance(Planet p)
	{
		double dx = xxPos - p.xxPos;
		double dy = yyPos - p.yyPos;
		double distance = Math.pow(dx * dx + dy * dy, 1.0 / 2);
		return distance;
	}

	

	public double calcNetForceExertedByX(Planet[] plants)
	{
		double force_x = 0;
		for (Planet p: plants)
		{
			if(equals(p))
			{
				continue;
			}

			force_x += calcForceExertedByX(p);
		}
		return force_x;
	}


	public double calcNetForceExertedByY(Planet[] plants)
	{
		double force_y = 0;
		for(Planet p: plants)
		{
			if(equals(p))
			{
				continue;
			}

			force_y += calcForceExertedByY(p);
		}
		return force_y;

	}


	public void update(double dt, double fX,double fY)
	{
		double netForceByX = calcAcceleration(fX);
		double netForceByY = calcAcceleration(fY);
		xxVel += netForceByX * dt;
		yyVel += netForceByY * dt;
		xxPos += xxVel * dt;
		yyPos += yyVel * dt;




	}

	public double calcAcceleration(double f)
	{
		return f / mass;
	}
}
