package pkg;
import java.util.Scanner;
import java.util.Random;


public class myMath {
	// -------GLOBAL VARIABLES-------
    public int x;
    public int y;
    
	// -------CONSTRUCTORS-------
	public myMath() {  // Empty or Default Constructor
		x = 0;
		y = 0;
	}
	
	public myMath(int a, int b) {  // int, int Constructor
		x = a;
		y = b;
	}
	
	// -------METHODS-------
	public int add(int a, int b){
	    x = a;
	    y = b;
	    return x+y;
	}

	public int add(){
	    return x + y;
	}
}
