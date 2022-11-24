package de.hfu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}

import java.util.Scanner;


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
