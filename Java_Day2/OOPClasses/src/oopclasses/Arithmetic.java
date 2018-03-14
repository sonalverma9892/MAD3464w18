/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopclasses;

/**
 *
 * @author macstudent
 */
public class Arithmetic {
    
    static int n1;
    final static int n2 = 10;
    
    
    //method overloading: methods with same name but different dataypes, compiler will itself recognize which method to call according to the arguements passed
//    int addition(int n1, int n2){
//        return n1 + n2; 
//    }
//    
//    int addition(int n1, int n2, int n3){
//        return n1 + n2 + n3;
//    }
    
    int addition (int... num){
        int sum, i;
        for(i=0, sum=0 ; i<num.length ; sum+=num[i],i++); 
            
        return sum;
    }
    
    float addition(float n1, float n2){
        
        multiplication(10, 20);
        
        return n1 + n2;
    }
    
    static int multiplication (int... num){
        int i=0, answer=1;
        
        for(i=0;i<num.length; i++){
            answer *= num[i];
        }
        System.out.println("multiplication : " + answer);
        return answer;
    }
    
}
