/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        Colors.print("Test 1");         // This prints out the value given without a new line   
        Colors.println("Test 2");       // This prints out the value given then a new line
        Colors.print("Test 3", "BRIGHT_Red");       // 2 String parameters: Value, Color of text
        Colors.println("Test 4", "BRIGHT_Red");     // 2 String parameters: Value, Color of text WITH a new line after
        Colors.print("Test 5", "BRIGHT_Red", "BG_Blue");         // 3 String parameters: Value, Color of text, Color of background
        Colors.println("Test 6", "BRIGHT_Red", "BG_Blue");       // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.

        // Feel free to comment out the test code above when you start your assignment

        if(diff == 1){
            /*
                Difficulty level 1:
                    The user will receive a series of colors as words (ex. "Red", "Blue", "Green", etc.)
                    The user must type in the colors in the correct order

                1. The game should repeat until the player loses
                2. Each round, a new set of words is generated. The game starts at 1 word and adds one more word each round.
                    - All words should be randomly chosen and stored to be checked later
                    - Print each word when generated for the user to start to memorize
                3. Tell the user to memorize the phrase then start the count down of 5 seconds
                4. After the delay, print a bunch of new lines to clear the screen
                5. Prompt the user to type in each color one at a time
                    - Take in as many inputs as there words generated
                    - Check all words against the generated list of words
                    - ALL words should be taken in, THEN you can tell the user if they lost
                    - This means checking and keeping track of if they lost or not
                6. Once all inputs are taken in 
                    - Tell the user if they lost or won
                    - If they lost, print out the correct series of colors and end the game
                    - If they won, start a new round with one more word (start back at step 1)
            */


        }
        else if(diff == 2){
            /*
                Difficulty level 2:
                    This should act the same as difficulty level 1 with the following changes:
                    The user will receive a series of colors as words AND as text color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text or as a color
                    The user must type in the colors in the correct order by either text or text color
                    Both the text words and the text colors should be stored to be checked later
            */


        }
        else if(diff == 3){
            /*
                Difficulty level 3:
                    This should act the same as difficulty level 2 with the following changes:
                    The user will receive a series of colors as words, as text color, and as background color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text, as a color, or as background color
                    The user must type in the colors in the correct order
                    All of the text words, the text colors and the background colors should be stored to be checked later
            */
        

        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
