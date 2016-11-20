package com.practiceTest;

/**
 * Created by Swathi.Battula on 20/11/2016.
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee empOne = new Employee("Tanishi");
        Employee empTwo = new Employee("Sahasra");

        empOne.employeeAge(8);
        empOne.employeeSalary(5000);
        empOne.employeedesignation("Engineer");
        empOne.printEmployeeDetails();
        empTwo.employeeAge(2);
        empTwo.employeeSalary(3000);
        empTwo.employeedesignation("Doctor");
        empTwo.printEmployeeDetails();





    }
}
