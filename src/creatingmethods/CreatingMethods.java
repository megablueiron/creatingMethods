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
    
    static Scanner keyedInput = new Scanner(System.in);

    public static void main(String[] args) {
        
        //declaring and initalizing all variables that are used in for the methods
        int choice = 0;
        int num1 = 0;
        int num2 = 0;
        boolean state = false;
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
        
        //This menu system will loop as long as the user does not select the exit option
        do {
        
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
        System.out.println("6... Find the hypotenuse of a right angle triangle");
        System.out.println("7... Find the sum of 2 numbers");
        System.out.println("8... Find the factorial of a number");
        System.out.println("9... Find the product of 2 numbers");
        System.out.println("10... Find the difference of 2 numbers");
        System.out.println("11... Exit");
        System.out.println("Please enter your choice:");
        
        //prompting the user for their choice
        choice = keyedInput.nextInt();
        
        //if the user chooses first choice, the program prompts the user for 2 sides and uses the method to output an answer
        if (choice == 1)
        {
            System.out.println("Input the first side in m");
            side1 = promptDouble();
            
            System.out.println("Input the second side in m");
            side2 = promptDouble();
            
            System.out.println("The perimeter of the rectangle is " + perimeter(side1,side2) + "m");
        }
        
        //if the user selects the second choice, the program will prompt the user for their speeds and time and will use a method to output the acceleration
        if (choice == 2)
        {
            System.out.println("Input the starting speed in m/s");
            speed1 = promptDouble();
            
            System.out.println("Input the ending speed in m/s");
            speed2 = promptDouble();
            
            System.out.println("Input the time of acceleration in s");
            time1 = promptDouble();
            
            System.out.println("Your acceleration is " + acceleration(speed1,speed2,time1) + "m/s²");
        }
        
        //if the user selects the third option, the program will prompt the user for 2 coordinates on a line and will use a method to calculate the slope of the line
        if (choice == 3)
        {
            System.out.println("Input the first x coordinate");
            x1 = promptDouble();
            
            System.out.println("Input the second x coordinate");
            x2 = promptDouble();
            
            System.out.println("Input the first y coordinate");
            y1 = promptDouble();
            
            System.out.println("Input the second y coordinate");
            y2 = promptDouble();
            
            System.out.println("The value of the slope is " + slope(x1,x2,y1,y2));
        }
        
        //if the user selects the fourth option, the program will prompt the user for the radius and will use a method to calculate the volume of a sphere with that radius
        if (choice == 4)
        {
            System.out.println("Input the sphere radius in m");
            radius = promptDouble();
            
            System.out.println("The volume of the sphere is " + sphereVolume(radius) + "m³");
        }
        
        //if the user selects the 5th option, the program will prompt the user for a number that the method will test if it is prime or not and will display the output
        if (choice == 5)
        {
            number = promptInt();
            
            state = prime((int)number);
            
            if (!state){
                System.out.println(number + " is a prime number.");
            }
            else {
                System.out.println(number + " is not a prime number.");
            }
        }
        if (choice == 6)
        {
            System.out.println("Input the first side in m");
            side1 = promptDouble();
            
            System.out.println("Input the second side in m");
            side2 = promptDouble();
            
            System.out.println("The hypotenuse of the triangle is " + hypotenuse(side1,side2) + "m");
        }
        if (choice == 7)
        {
            num1 = promptInt();
            
            num2 = promptInt();
            
            System.out.println("The sum of the two numbers is " + sum(num1,num2));
        }
        if (choice == 8)
        {
            num1 = promptInt();
            
            System.out.println("The factorial of the number is " + factorial(num1));
        }
        
        if (choice == 9)
        {
            num1 = promptInt();
            
            num2 = promptInt();
            
            System.out.println("The product of your numbers are " + multiply(num1,num2));
        }
        
        if (choice == 10)
        {
            num1 = promptInt();
            
            num2 = promptInt();
            
            System.out.println("The difference of your numbers are " + difference(num1,num2));
        }
    } while (choice != 11);
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
     * @return - boolean statement
     */
public static boolean prime(int n1){
    
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
    return(flag);
}
/**
 * hypotenuse() finds the hypotenuse of a right angle triangle by using the other 2 sides
 * @param n1
 * @param n2
 * @return the hypotenuse as a double
 */
public static double hypotenuse(double n1, double n2){
    
    double hypot = Math.sqrt((n1*n1)+(n2*n2));
    return(hypot);
}

/**
 * sum() adds two doubles together
 * @param n1
 * @param n2
 * @return the sum of n1 and n2 as a double
 */
public static double sum(double n1, double n2){

    double sum = n1 + n2;
    return (sum);
}

/**
 * factorial() takes the factorial of a user inputted number
 * @param n1
 * @return the result of the factorial of the number
 */
public static int factorial(int n1){

    int number = n1;
    int result = 1;
    for (int i=1; i <= n1; i++){
        result = result*i;
        
    }
    return(result);
}

/**
 * multiply() does the product of n1 and n2
 * @param n1
 * @param n2
 * @return the product of n1 and n2 as a double
 */
public static double multiply(double n1,double n2){
    
    double result = n1*n2;
    return (result);
    }

/**
 * difference() subtracts the value of n1 and n2
 * @param n1
 * @param n2
 * @return the difference of n1 and n2 as a double
 */
public static double difference(double n1, double n2){

    double difference = n1 - n2;
    return (difference);
    }

/**
 * promptInt() prompts the user for an input as an integer and uses a scanner to accept it
 * @return the integer value entered by the user
 */
public static int promptInt(){
    
    System.out.println("Input a number");
    int n1 = keyedInput.nextInt();
    return(n1); 
    }

/**
 * promptDouble() prompts the user for an input as a double and uses a scanner to accept it
 * @return the double value entered by the user
 */
public static double promptDouble(){
    
    System.out.println("Input a number");
    double n1 = keyedInput.nextInt();
    return(n1);
    }
}