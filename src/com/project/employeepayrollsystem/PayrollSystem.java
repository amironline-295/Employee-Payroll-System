package com.project.employeepayrollsystem;

import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeesList;

    public PayrollSystem(){
        employeesList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }
    public void removeEmployee(int id){
        Employee removeEmployee = null;
        for(Employee employee : employeesList){
            if(employee.getId() == id){
                removeEmployee = employee;
                break;
            }
        }
        if(removeEmployee != null){
            employeesList.remove(removeEmployee);
        }
    }
    public void displayEmployees(){
        for(Employee employee : employeesList){
            System.out.println(employee);
        }
    }
}
