package assignment6;

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
       
        
        
        final double squareFeetPerGallons = 350.0;
        boolean inputting = true;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
        	try {
		        System.out.println("Enter wall height (feet): ");
		        wallHeight = scnr.nextDouble();
		        inputting = false; 
        	}
        	catch (Exception ex) {
        		scnr.next();
        	}
        } while (wallHeight <= 0); 
       

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
        	try {
		        System.out.println("Enter wall width (feet): ");
		        wallWidth = scnr.nextDouble(); //ERROR #1 - change wallHeight to wallWidth
		        inputting = false;
        	}
        	catch (Exception ex) {
        		scnr.next();
        	}
        } while (wallWidth <= 0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea +  " square feet"); //ERROR #2 - include wallArea variable

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons"); //ERROR #3 - change gallonsPaintNeeded name
        
        scnr.close(); //ERROR #4 - scnr closed to remove scanner leak error on line #9
    }
}
