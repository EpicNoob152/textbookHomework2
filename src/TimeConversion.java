/**
 * Class: TimeConversion
 * @author: Jaylan Igbinoba
 * @version: 1.0
 * @Course: ITEC 2140 Spring 2023
 * @Written: February 2, 2023
 * @Description: The program should allow you to input the time in seconds and that time will convert into minutes and hours
 */
import java.util.Scanner;
public class TimeConversion {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        // The code below tells the person running the program what to give it
        System.out.print("Please enter any time (in seconds):  ");
        int seconds = input.nextInt();
        // This code is how I converted the seconds into hours and minutes
        int minutes = (seconds / 60) % 60;
        int hour = seconds / 3600;
        int sec = seconds % 60;

        System.out.println( "Your time is " + hour + " Hours " + minutes + " Minutes " + sec + " Seconds " );







    }
}
