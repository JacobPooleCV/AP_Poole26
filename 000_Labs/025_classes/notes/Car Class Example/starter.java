/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Car a = new Car();										// Default Constructor
		Car b = new Car("Camry", "Toyota");						// Using String, String Constructor
		Car c = new Car("CRV", "Honda");						// Using String, String Constructor
		Car d = new Car(39000.10, "F150", "Ford", 2025, true); 	// Using double, String, String, int, boolean Constructor

		a.printDetails();
		b.printDetails();
		
		a.setPrice(10000);
		b.setPrice(17000.99);
		
		System.out.println("The price of this car is: " + d.getPrice());

		a.printDetails();
		b.printDetails();
		c.printDetails();
		d.printDetails();
	}
}
