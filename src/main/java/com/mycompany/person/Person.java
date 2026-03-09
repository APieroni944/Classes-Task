/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;
import javax.swing.*;
//import org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

/**
 *
 * @author lab_services_student
 */
public class Person {
    String Name;
    int Age;
    Person() {
        this.Name = Input("Input Name: ");
        this.Age = Integer.parseInt(Input("Input Age: "));
    }
    public String Input(String Prompt) {
        return JOptionPane.showInputDialog(Prompt);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Calculator calc = new Calculator();
        calc.CalculatorTest();
    }
}
class Student extends Person {
    int SNumber;
    Course Course;
    int Year;
    Student() {
        SNumber = Integer.parseInt(Input("Input Student Number: "));
        Course = new Course();
        Year = Integer.parseInt(Input("Input Year: "));
    }
}
class Course {
    String Name;
    String CourseID;
    Course() {
        Name = JOptionPane.showInputDialog("Input course name: ");
        CourseID = JOptionPane.showInputDialog("Input course ID: ");
    }
}
/*
class Calculator{
    public int addNumbers(int a, int b) {
        return a + b;
    }
    @Test
    public void CalculatorTest() {
        assertEquals(10, this.addNumbers(3, 7))
    }
}
*/