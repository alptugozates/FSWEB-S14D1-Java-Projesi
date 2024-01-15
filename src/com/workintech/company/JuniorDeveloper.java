package com.workintech.company;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {

        System.out.println("JuniorDeveloper is working");
        setSalary(getSalary() + 75);

    }
}
