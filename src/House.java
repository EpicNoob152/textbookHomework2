/**
 * Class: House
 * @author: Jaylan Igbinoba
 * @version: 1.0
 * @Course: ITEC 2140 Spring 2023
 * @Written: February 2, 2023
 * @Description: This code will try and calculate how many gallons and quarts of paint you will need to paint a house.
 */
import java.util.Scanner;
public class House {
    public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     // The code below tells the person running the program what to give it.
        System.out.print("How long is the House? (Give me the length): ");
        double length = input.nextDouble();
        System.out.print("How wide is the House? (Give me the width):  ");
        double width =  input.nextDouble();
        System.out.print("How tall is the House? (Give me the Height): ");
        double height = input.nextDouble();
        System.out.print("How many windows do you have?: ");
        double windows = input.nextDouble();
        System.out.print("How many doors do you have?: ");
        double doors = input.nextDouble();
        // The code below is calculations on how to find the amount of paint you will need.
        double area = length * width * height;
        double paint = (windows * 15) + (doors * 21) + area;
        double quarts = (paint / 87.5) % 4;
        int gallons = (int) (paint / 350);

        System.out.println("You will need " + gallons + " Gallons and " + quarts + " Quarts of paint.");
    }
}
