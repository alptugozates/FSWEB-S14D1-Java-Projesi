package com.workintech.company;

public class HRManager extends Employee {

    private  JuniorDeveloper[] juniorDevelopers;
    private  MidDeveloper[] midDevelopers;
    private  SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }


    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        addDeveloper(juniorDeveloper, juniorDevelopers);
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        addDeveloper(midDeveloper, midDevelopers);
    }

    private void addDeveloper(Employee developer, Employee[] developers) {
        for (int i = 0; i < developers.length; i++) {
            if (developers[i] == null) {
                developers[i] = developer;
                developer.setSalary(developer.getSalary() + 500);
                System.out.println(developer.getName() + " added as a developer.");
                return;
            } else {
                System.out.println("Index " + i + " is occupied. Trying the next one.");
            }
        }
        System.out.println("No available index for the developer.");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        addDeveloper(seniorDeveloper, seniorDevelopers);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }
}
