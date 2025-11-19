package org.example;

class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void paySalary() {
        System.out.println("Paying salary to employee: " + name);
    }
}

class Programmer extends Employee {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void paySalary() {
        System.out.println("Paying salary to Programmer: " + name);
    }

    public void writeCode() {
        System.out.println(name + " is writing code...");
    }
}

class Accountant extends Employee {
    public Accountant(String name) {
        super(name);
    }

    @Override
    public void paySalary() {
        System.out.println("Paying salary to Accountant: " + name);
    }

    public void prepareReport() {
        System.out.println(name + " is preparing financial report...");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void paySalary() {
        System.out.println("Paying salary to Manager: " + name);
    }

    public void approveBonus() {
        System.out.println(name + " is approving bonuses...");
    }
}

public class CompanyDemo {
    public static void main(String[] args) {

        // 🔵 Upcasting
        Employee e1 = new Programmer("Ali");       // Upcast
        Employee e2 = new Accountant("Sara");      // Upcast
        Employee e3 = new Manager("Reza");         // Upcast

        Employee[] employees = { e1, e2, e3 };

        payAllEmployees(employees);   // Polymorphism

        System.out.println("Downcasting");
        doExtraWork(employees);       //  downcast
    }

    //  Upcasting + Polymorphism
    public static void payAllEmployees(Employee[] employees) {
        for (Employee e : employees) {
            e.paySalary();
        }
    }

    //  Downcasting
    public static void doExtraWork(Employee[] employees) {
        for (Employee e : employees) {
            if (e instanceof Programmer) {
                Programmer p = (Programmer) e; // 🔻 Downcast
                p.writeCode();
            } else if (e instanceof Accountant) {
                Accountant a = (Accountant) e; // 🔻 Downcast
                a.prepareReport();
            } else if (e instanceof Manager) {
                Manager m = (Manager) e;       // 🔻 Downcast
                m.approveBonus();
            }
        }
    }
}