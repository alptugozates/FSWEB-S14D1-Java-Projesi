package com.workintech.company;

public class MidDeveloper extends Employee {

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {

        System.out.println("MidDeveloper is working");
setSalary(getSalary() + 150);
    }
}
