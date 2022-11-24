package de.hfu;

import java.util.Scanner;

public class App 
{
	private static String finalString;
	
    public static void main( String[] args )
    {
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();
        scanner1.close();
        
        finalString = input.toUpperCase();
        
        System.out.println(finalString);
        
    }
}

