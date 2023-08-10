package JourneyCalculator;

import java.util.Scanner;

public class JourneyCalculatorr {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter The speed and time");
    double speed=scan.nextDouble();
    double time=scan.nextDouble();
    JourneyCalculator journeyCalculator = new JourneyCalculator();
    double Distance=journeyCalculator.calculateDistance(speed,time);
    System.out.println(Distance);
	}
	

}
