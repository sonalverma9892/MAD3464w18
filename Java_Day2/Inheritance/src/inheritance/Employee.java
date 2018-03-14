/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Employee extends Person {
    double salary;
    
    Employee(){
        super();
        this.salary = 14;
    }
    
    Employee(String fname, String lname, int age, double pay){
        super(fname, lname, age);
        this.salary = pay;
    }
    
    void read(){
        super.read();
        Scanner input = new Scanner(System.in);
        this.salary = input.nextDouble();
        System.out.println("Enter the Salary : " );
    }
    
    void display(){
        super.display();
        System.out.println("Salary : " + this.salary);
    }
}
