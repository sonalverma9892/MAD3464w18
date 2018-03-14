/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclasses;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class OOPClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name;
        
        //create new object of Bank Class
        Bank myBank = new Bank();
        
        System.out.println("Bank ID : " + myBank.bankID);
        System.out.println("Bank Name : " + myBank.bankName);
        
        Bank yourBank = new Bank();
        
        myBank.bankID = 1234;
        myBank.bankName = "RBC";
        
         
        System.out.println("Bank ID : " + myBank.bankID);
        System.out.println("Bank Name : " + myBank.bankName);
        
//        System.out.println("Bank ID : " + yourBank.bankID);
//        System.out.println("Bank Name : " + yourBank.bankName);
        
        myBank.getBankName();
        
        yourBank.setBankName("ICICI");
        yourBank.getBankName();
       
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Enter Bank Name : ");
        
        //Whenever need to use string as input we need to use nextLine()
        name = myInput.nextLine();
        
        yourBank.setBankName(name);
        yourBank.getBankName();
        
        
        //create object of Arithmetic class
        Arithmetic operation1 = new Arithmetic();
        System.out.println("Output of Addition : " + operation1.addition(4, 5));
        
        System.out.println("Output of float Addition : " + operation1.addition(4.58f, 5.98f));
        
        System.out.println("Output of three Addition : " + operation1.addition(5, 10, 15));
        
        System.out.println("Output of array Addition : " + operation1.addition(5, 10, 15, 20, 30));
        
        System.out.println("Output of multiplication : " + operation1.multiplication(10, 20, 30));
        
        //multiplication method can be directly called using class no need to create instance of it as it is defined using static.
        System.out.println("Output of multiplication : " + Arithmetic.multiplication(10,20));
        
        Arithmetic.n1 = 20;
//        Arithmetic.n2 = 20;
        System.out.println(Arithmetic.n1  + " " + Arithmetic.n2);
        
        
    }
    
}
