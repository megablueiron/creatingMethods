/*
 * Michael Botros
 * Oct 31st 2019
 * This program displays a menu with 5 math options that use originally made methods
 */

package creatingmethods;
//import the scanner library
import java.util.Scanner;
/**
 *
 * @author mibot3117
 */
public class CreatingMethods {


    public static void main(String[] args) {
        
        //declaring and initalizing all variables that are used in for the methods
        int choice = 0;
        double side1 = 0;
        double side2 = 0;
        double speed1 = 0;
        double speed2 = 0;
        double time1 = 0;
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double radius = 0;
        double number = 0;
        
        //creating a new scanner object
        Scanner keyedInput = new Scanner(System.in);
        
        //This menu system will loop as long as the user does not select the exit option
        while (choice != 6) {
        
        //printing out the menu header
        System.out.println("");
        System.out.println("Cool premade methods");
        System.out.println("");
        
        //print out the instructions for the user and the options
        System.out.println("Please enter your choice:");
        System.out.println("1... Find the perimeter of a rectangle");
        System.out.println("2... Find the acceleration by putting your starting and ending speed and the time it took");
        System.out.println("3... Find the slope of a line by putting the co-ordinates of two points on the line");
        System.out.println("4... Volume of a sphere");
        System.out.println("5... Find out if a number is prime or not");
        System.out.println("6... Exit");
    
        System.out.println("Please enter your choice:");
        
        //prompting the user for their choice
        choice = keyedInput.nextInt();
        
        //if the user chooses first choice, the program prompts the user for 2 sides and uses the method to output an answer
        if (choice == 1)
        {
            System.out.println("Input the first side in m");
            side1 = keyedInput.nextInt();
            
            System.out.println("Input the second side in m");
            side2 = keyedInput.nextInt();
            
            System.out.println("The perimeter of the rectangle is " + perimeter(side1,side2) + "m");
        }
        
        //if the user selects the second choice, the program will prompt the user for their speeds and time and will use a method to output the acceleration
        if (choice == 2)
        {
            System.out.println("Input the starting speed in m/s");
            speed1 = keyedInput.nextInt();
            
            System.out.println("Input the ending speed in m/s");
            speed2 = keyedInput.nextInt();
            
            System.out.println("Input the time of acceleration in s");
            time1 = keyedInput.nextInt();
            
            System.out.println("Your acceleration is " + acceleration(speed1,speed2,time1) + "m/s²");
        }
        
        //if the user selects the third option, the program will prompt the user for 2 coordinates on a line and will use a method to calculate the slope of the line
        if (choice == 3)
        {
            System.out.println("Input the first x coordinate");
            x1 = keyedInput.nextInt();
            
            System.out.println("Input the second x coordinate");
            x2 = keyedInput.nextInt();
            
            System.out.println("Input the first y coordinate");
            y1 = keyedInput.nextInt();
            
            System.out.println("Input the second y coordinate");
            y2 = keyedInput.nextInt();
            
            System.out.println("The value of the slope is " + slope(x1,x2,y1,y2));
        }
        
        //if the user selects the fourth option, the program will prompt the user for the radius and will use a method to calculate the volume of a sphere with that radius
        if (choice == 4)
        {
            System.out.println("Input the sphere radius in m");
            radius = keyedInput.nextInt();
            
            System.out.println("The volume of the sphere is " + sphereVolume(radius) + "m³");
        }
        
        //if the user selects the 5th option, the program will prompt the user for a number that the method will test if it is prime or not and will display the output
        if (choice == 5)
        {
            System.out.println("Input a number");
            number = keyedInput.nextInt();
            
            prime((int)number);
        }
    }
 }
    /**
     * perimeter() takes two sides and multiplies each side by two and adds them
     * @param - side 1
     * @param - side 2
     * @return - the perimeter as a double
     */
    public static double perimeter(double n1, double n2){
    
    double result = (2*n1) + (2*n2);
    return (result);
}
/**
     * acceleration() takes the difference between 2 speeds and divides it by time
     * @param n1 - speed 1
     * @param n2 - speed 2
     * @param n3 - time
     * @return - the acceleration as a double
     */
public static double acceleration(double n1, double n2, double n3){
    
    double acceleration = (n2-n1)/n3;
    return (acceleration);
}
    /**
     * slope() finds the difference in the x and y coordinates and divides the y value by the x value
     * @param n1 - first x coordinate
     * @param n2 - second x coordinate
     * @param n3 - first y coordinate
     * @param n4 - second y coordinate
     * @return - the slope as a double
     */
public static double slope(double n1, double n2, double n3, double n4){
    
    double slope = (n4-n3/(n2-n1));
    return (slope);
}
    /**
     * sphereVolume() takes the radius of a sphere and calculates the volume of it
     * @param - radius
     * @return - the volume of the sphere as a double
     */
public static double sphereVolume(double n1){
    
    double volume = (Math.pow(n1,3))*(4.0/3.0)*(Math.PI);
    return (volume);
}

    /**
     * prime() takes an integer and checks if it is prime by dividing it until it finds a factor and outputs if its prime or not
     * @param - an integer
     * @return - none
     */
public static void prime(int n1){
    
     boolean flag = false;
        for(int i = 2; i <= n1/2; ++i)
        {
            // condition for nonprime number
            if(n1 % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(n1 + " is a prime number.");
        else
            System.out.println(n1 + " is not a prime number.");
}
}