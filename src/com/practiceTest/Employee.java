package com.practiceTest;

/**
 * Created by Swathi.Battula on 20/11/2016.
 */
public class Employee {
    int empage;
    String empname;
    int empsalary;
    String empdesignation;

    public  Employee(String name){
        this.empname=name;
    }
   public void employeeAge(int age){
       empage = age;
   }
    public void employeeSalary(int Salary){
        empsalary = Salary;
    }
    public void employeedesignation(String designation){
        empdesignation = designation;
    }
    public void printEmployeeDetails(){
        System.out.println("Employee name is " +empname);
        System.out.println("Employee age is " +empage);
        System.out.println("Employee salary is " +empsalary);
        System.out.println("Employee designation is " +empdesignation);

    }
}
