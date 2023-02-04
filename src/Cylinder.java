/**
 * Class: Cylinder
 * @author: Jaylan Igbinoba
 * @version: 1.0
 * @Course: ITEC 2140 Spring 2023
 * @Written: February 2, 2023
 * @Description: This code will try and let users input the area and radius to find the volume of the cylinder.
 */
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
    double pi = 3.141;
// The code below tells the person running the program what to give it.
    Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius:  ");
        double radius = input.nextDouble();

        System.out.print("Please enter the length of the cylinder: ");
        double length = input.nextDouble();
//This code is the calculation for volume needed to give the answer in the program.
        double volume = pi * (radius * radius) * length;
        System.out.println("The volume to this cylinder is: " + volume + "" );

    }
}