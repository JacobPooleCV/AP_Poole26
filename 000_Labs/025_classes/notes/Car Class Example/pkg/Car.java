/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Car {
	// -------GLOBAL VARIABLES-------
	double price;
	String model;
	String make;
	int year;
	boolean hasAirConditioning;

	// -------CONSTRUCTORS-------
	public Car() {						// Default/Empty Constructor
		price = 0;						// Set variables to default values in case they are used.
		model = "unknown";				// These variables can be updated later!
		make =  "unknown";
		year = 0;
		hasAirConditioning = false;
	}

	public Car(String mo, String ma){	// String, String Constructor
										// This constructor allows me to make cars when I know what their model and make are.
		model = mo;		// Setting our global variable model to the incoming mo parameter
		make = ma;								
		price = 0; 		// We should still set other variables to default values
		year = 0;
		hasAirConditioning = false;
	}

	public Car(double p, String mo, String ma, int y, boolean ac){	// double, String, String, int, boolean Constructor
		price = p;
		model = mo;
		make = ma;
		year = y;
		hasAirConditioning = ac;
	}

	// -------METHODS-------
	public void setPrice(double p){		// This method allows us to set the price of a car
		price = p;						// This can be called when we find out the price of a car!
		return;
	}

	public double getPrice(){			// This method gets the price of the current car and returns that
		return price;					// This is basically like a variable look up, to access the values in the car object, we need to return values
	}

	public void printDetails(){
		System.out.println("----------------------");
		System.out.println("Model: " + model);
		System.out.println("Make: " + make);
		System.out.println("Year: " + year);
		System.out.println("Price: $" + price);
		if(hasAirConditioning){
			System.out.println("This car has air conditioning.");
		}
		else{
			System.out.println("This car does not have air conditioning.");
		}
		System.out.println("----------------------");
		System.out.println();
		return;
	}

}

