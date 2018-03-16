
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Student {
    String name;
    int rollNo;
    double percentage;
    
    Student(){
        this.name = "Unknown";
        this.rollNo = 0;
        this.percentage = 0.0;
    }

    public Student(String name, int rollNo, double percentage) {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    void displayStudent(){
        System.out.println("Student Name: " + this.name + "\n Student RollNo: " + this.rollNo + "\n Student Percentage: " + this.percentage);
    }
    
}
//to change to decreasing one just change the order of the object
class studentNameComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
       return o1.name.compareToIgnoreCase(o2.name);
    }
    
}
class studentPercentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        
        if(o1.percentage == o2.percentage)
            return 0;
        else if(o1.percentage < o2.percentage)
            return 1;
        else
            return -1;
    
    }
    
}