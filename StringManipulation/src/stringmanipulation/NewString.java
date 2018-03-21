/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmanipulation;

/**
 *
 * @author Administrator
 */
public class NewString {

    
	public static void main(String a[])
	{
		char b[]={'J','A','V','A'};
		String s1=new String (b);
		byte c[]={65,66,67};
		String s2=new String (s1);

		// extract substring

		String s3= new String(b,1,3);

		//convert into character
		String s4= new String(c);
		String s5=new String(c,1,2);

		System.out.println("Value of s1 : " + s1);
		System.out.println("Value of s2 : " + s2);	
		System.out.println("Value of s3 : " + s3);	
		System.out.println("Value of s4 : " + s4);	
		System.out.println("Value of s5 : " + s5);	



	}

}
