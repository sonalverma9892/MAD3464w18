/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmanipulation;

/**
 *
 * @author Administrator
 */
public class CompareString {
public static void main(String args[])
	{
		String s = new String ("abc");
		String s1 = new String ("abe");
		String s2=new String ("abc");

		int result1=s.compareTo(s1);
                System.out.println("Compared String s is:" + result1);

		int result2=s1.compareTo(s);
                System.out.println("Compared String s1 is:" + result2);
		
                Boolean b=s.endsWith("java");
                System.out.println("String end with is:" + b);
                
		Boolean b1=s2.equalsIgnoreCase("aBc");
                System.out.println("String is:" + b1);

		int a=s.indexOf('a');
                System.out.println(a);
		int a1=s.indexOf('a',2);
                System.out.println(a1);
		
		
		
		
		
		
        }



}
