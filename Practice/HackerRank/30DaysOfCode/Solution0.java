 import java.io.*;
import java.util.Scanner;
/**
 * Task
 * To complete this challenge, you must save a line of input from stdin to a variable, 
 * print Hello, World. on a single line, and finally print the value of your variable 
 * on a second line.
 *
 * Input Format
 * A single line of text denoting
 * (the variable whose contents must be printed).
 * 
 * Output Format
 * Print Hello, World. on the first line, and the contents of on the second line.
 */
 public class Solution0{
     public static void main(String[] args)
     {
        //Create a Scanner object to read input from stdin
        Scanner scan = new Scanner(System.in);

        //Read a full line of input from stdin and save it to our variable, inputString
        String inputString = scan.nextLine();

        //Close the  scanner object because we've finished reading all the input from stdin
        scan.close();

        //Print a string literal saying "Hello, World" to stdout
        System.out.println("Hello, World.");

        //Write a line of code here the prints the contents of inputString to stdout
        System.out.println(inputString);
     }
 }