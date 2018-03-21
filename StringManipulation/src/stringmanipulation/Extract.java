/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmanipulation;

/**
 *
 * @author Administrator
 */
public class Extract {

    public static void main (String s[])

	{
		String s1= new String("Its a good day");
		char c=(s1.charAt(3)); // charAt() extract single character
		System.out.println(c);
		
		String s2=s1.substring(3);
		System.out.println(s2);
			
		String s3=s1.substring(3,8);
		System.out.println(s3);

		

	}
}
