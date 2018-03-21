/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmanipulation;

/**
 *
 * @author Administrator
 */
public class StringSample {

    public static void main (String a[])
	{
		String str1="Morning";

		System.out.println(str1.length()); // count length if the srting

		String str2="ing";
		
		String str3="morning";
		
		String s4=str3.substring(2,5);
		
		System.out.println(s4);

		String s1=str1.toUpperCase(); // convert lower to upper

		System.out.println(s1);

		String s2=str2.replace ('n', 'N'); //replace 'n' to 'N'
		System.out.println(s2);

		System.out.println(str1);
		str1=str1.concat (" " + str2); // comcate two string
		System.out.println(str1);

		System.out.println(str1.length()); // count length if the srting
		
		
	}

}

