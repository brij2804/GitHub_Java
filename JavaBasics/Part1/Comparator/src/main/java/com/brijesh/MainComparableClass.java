package main.java.com.brijesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainComparableClass {

    public static void main(String[] args){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010,"Mahesh",10000));
        employees.add(new Employee(1004,"Rittick",20000));
        employees.add(new Employee(1015,"Jay",15000));

        System.out.println("before sorting :"+ Arrays.toString(employees.toArray()));

        Collections.sort(employees);

        System.out.println(" after sorting : "+ Arrays.toString(employees.toArray()));


        Collections.sort(employees,new EmployeeNameComparator());

        System.out.println(" after sorting : "+ Arrays.toString(employees.toArray()));
    }
}
