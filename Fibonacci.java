import java.util.*;
public class Apcs {

	public static final double ACCELERATION = -9.81;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		giveIntro();

		System.out.print("velocity (meters/second)? ");
		double velocity = console.nextDouble();
		System.out.print("angle (degrees)? ");
		double angle = Math.toRadians(console.nextDouble());
		System.out.print("number of steps to display? ");
		int steps = console.nextInt();
		System.out.println();

		printTable(velocity, angle, steps);
	}

	// prints a table showing the trajectory of an object given
	// its initial velocity and angle and including the given
	// number of steps in the table
	public static void printTable(double velocity, double angle, int steps) {
		double xVelocity = velocity * Math.cos(angle);
		double yVelocity = velocity * Math.sin(angle);
		double totalTime = 2.0 * yVelocity / ACCELERATION;
		double timeIncrement = totalTime / steps;
		double xIncrement = xVelocity * timeIncrement;

		double x = 0.0;
		double y = 0.0;
		double t = 0.0;
		System.out.println("step\tx\ty\ttime");
		System.out.println("0\t0.0\t0.0\t0.0");
		for (int i = 1; i <= steps; i++) {
			t += timeIncrement;
			x += xIncrement;
			y = displacement(yVelocity, t, ACCELERATION);
			System.out.println(i + "\t" + round2(x) + "\t" +
			round2(y) + "\t" + round2(t));
		}
	}

	// gives a brief introduction to the user

	public static void giveIntro() {
		System.out.println("This program computes the");
		System.out.println("trajectory of a projectile given");
		System.out.println("its initial velocity and its");
		System.out.println("angle relative to the");
		System.out.println("horizontal.");
		System.out.println();
	}

	// returns the vertical displacement for a body given
	// initial velocity v, elapsed time t, and acceleration a
	public static double displacement(double v, double t, double a) {
		return v * t + 0.5 * a * t * t;
	}

	// rounds n to 2 digits after the decimal point
	public static double round2(double n) {
		return Math.round(n * 100.0) / 100.0;
	}
 
}

	/*public static final double EARTHRAD = 6372.795;

	public static double getRad(Scanner console) {
		
		int degrees = console.nextInt();
		int minutes = console.nextInt();

		return ( ((degrees + minutes / 60.0) * Math.PI*2)/360.0 ) ;
	}








	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("latitude1 :");
		double rad1a = getRad(console);
		System.out.print("longitude1 :");
		double rad1b = getRad(console);

		System.out.print("latitude2: ");
		double rad2a = getRad(console);
		System.out.print("longitude2: ");
		double rad2b = getRad(console);
		System.out.println();


		figureOut(rad1a, rad1b, rad2a, rad2b);
	}


	public static void figureOut(double rad1a, double rad1b, double rad2a, double rad2b) {
		

		double arcLength = Math.acos(Math.sin(rad1a) * Math.sin(rad2a) + Math.cos(rad1a) * Math.cos(rad2a) * Math.cos(rad1b - rad2b));
		double finalresult = Math.round(arcLength * EARTHRAD);



		System.out.println("arclength: " + arcLength + " radians");

		System.out.println("distance (km):  " + (int) finalresult + " kilometers");
		System.out.println("distance (m): " + (int) (finalresult * 0.621371) + " miles");
	}*/

	

	
}



