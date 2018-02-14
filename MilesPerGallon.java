import java.util.*;
public class MilesPerGallon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input first odometer reading");
		double odomReading1 = input.nextDouble();
		System.out.println("Input second odometer reading");
		double odomReading2 = input.nextDouble();
		double mileage = odomReading2-odomReading1;
		System.out.println("Input gallons of gas consumed");
		double gasConsumed = input.nextDouble();
		double MPG = mileage/gasConsumed;
		System.out.format("%.2f miles/gallon",MPG);
	}

}
