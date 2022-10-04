/***
 *  1. Stream API introduced in java 8, and it is used to process collection of objects
 *  2. Stream is not a data structure instead its take in put from data structure like collections,ArrayList etc.
 *  3. Stream does not change the original data structure, it only processes the data and provides the desire result.
 *  4. Stream consist a bunch of intermediate and terminal operations, that can be used based on our requirement to get the output.
 */
package com.mw.example;

import com.mw.example.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIMain {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("John", "Doe", "1", 5000.0, Arrays.asList("Project1", "Project2")));
        employees.add(new Employee("Jane", "Doe", "2", 6000.0, Arrays.asList("Project2", "Project3")));
        employees.add(new Employee("Jack", "Doe", "3", 5500.0, Arrays.asList("Project1", "Project3", "Project4")));
        employees.add(new Employee("Jill", "Doe", "4", 4000.0, Arrays.asList("Project2", "Project3", "Project4")));
    }

    public static void main(String[] args) {

        //use of foreach (terminal operation)
        employees.stream().forEach(System.out::println);

        //use of filter (intermediate operation)
        System.out.println("Filtering Employee Salary > 5000");
        employees.stream().filter(employee -> employee.getSalary()>5000).forEach(System.out::println);


        /**
         * map allows you to map a particular type of object into different type of object and
         * returns the stream at the end.
         * Que: how to know which method are the intermediate operation?
         * Ans: intermediate operation always stream itself.
         * */
        System.out.println("Use of map,filter and collectors incrementing salary by 10% who's salary < 5000");
        List<Employee> increasedSal = employees.stream()
                .filter(employee -> employee.getSalary()<5000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getId(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toList());
        System.out.println(increasedSal);

        System.out.println("Use of map,filter and findFirst incrementing salary by 10% who's salary < 5000");
        Employee firstEmployee = null;
        try {
            firstEmployee = employees.stream()
                    .filter(employee -> employee.getSalary()>7000)
                    .map(employee -> new Employee(
                            employee.getFirstName(),
                            employee.getLastName(),
                            employee.getId(),
                            employee.getSalary() * 1.10,
                            employee.getProjects()
                    )).findFirst()
                            .orElseThrow(()-> new Exception("no data found"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(firstEmployee);

    }
}
