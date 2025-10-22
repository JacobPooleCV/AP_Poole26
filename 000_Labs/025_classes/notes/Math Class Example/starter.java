import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myMath test = new myMath();			// This is a myMath object! 
		System.out.println(test.add());		// Calling the add method on our object
		System.out.println(test.add(1,2));

		myMath test2 = new myMath(1,2);		// This is another myMath object!
		System.out.println(test2.add());
	}
}
