/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmanipulation;

/**
 *
 * @author Administrator
 */
public class StringBufferTest {

    public static void main (String a[])
	{
		StringBuffer str = new StringBuffer("object oriented language");
                StringBuffer str1 = new StringBuffer("This is a test");
                
		System.out.println("Original String is:" + str); // print str

	// Obtain String Lenght
		
		for (int i=0; i<str.length();i++)
		{
			int s=i+1;
			//find the character at position
			System.out.println("Chacter at position" + " " + s + "is:" + " " + str.charAt(i));
	
		}


	//append

	str.append(" Hello");

	str.append(" World");	
	
	//after merging
	System.out.println("After merging :" + str);

	//insert()

	str.insert(6,"Java ");		
   
       System.out.println("After Inserting :"+str);

	//setCharAt()
	
	str.setCharAt(5,' ');

	System.out.println("After  set characetr at particuler position :"+str); 

	//reverse()

	str.reverse();
	System.out.print("Reversed string : ");
	System.out.println(str);        
	str.reverse();
	System.out.println("Reverse String is:"+str); 
        
	//charAt()

	System.out.print("Character at 6th position : ");
	System.out.println(str.charAt(6));   
	
	//substring()

	System.out.print("Substring from position 3 to 6 : ");
	System.out.println(str.substring(3,7));    
        
        // delete character
        StringBuffer ans=str1.delete(4,7);
        
        System.out.println("After deletion :" + ans);
        StringBuffer ans1 = str1.deleteCharAt(0);
        System.out.println("After deletion :" + ans1);
	


	} // end of main



}
