# Java OOP – Inheritance, Polymorphism, Upcasting & Downcasting

This project demonstrates core **Object-Oriented Programming (OOP)** concepts in Java, including inheritance, method overriding, runtime polymorphism, upcasting, and downcasting.  
It includes three employee types (Programmer, Accountant, Manager), all inheriting from a base `Employee` class.

---

## 🔹 Concepts Covered

- **Inheritance**
- **Method Overriding**
- **Polymorphism**
- **Upcasting**
- **Downcasting**
- **instanceof Usage**

---

## 📁 Project Structure

```
Employee.java
Programmer.java
Accountant.java
Manager.java
CompanyDemo.java
README.md
```

---

# 📄 Full Source Code

## Employee.java
```java
class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void paySalary() {
        System.out.println("Paying salary to employee: " + name);
    }
}
```

---

## Programmer.java
```java
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
```

---

## Accountant.java
```java
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
```

---

## Manager.java
```java
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
```

---

## CompanyDemo.java
```java
public class CompanyDemo {
    public static void main(String[] args) {

        // Upcasting
        Employee e1 = new Programmer("Ali");
        Employee e2 = new Accountant("Sara");
        Employee e3 = new Manager("Reza");

        Employee[] employees = { e1, e2, e3 };

        payAllEmployees(employees); // Polymorphism

        System.out.println("Downcasting");
        doExtraWork(employees);     // Downcasting
    }

    // Polymorphism
    public static void payAllEmployees(Employee[] employees) {
        for (Employee e : employees) {
            e.paySalary();
        }
    }

    // Downcasting
    public static void doExtraWork(Employee[] employees) {
        for (Employee e : employees) {
            if (e instanceof Programmer) {
                Programmer p = (Programmer) e;
                p.writeCode();
            } else if (e instanceof Accountant) {
                Accountant a = (Accountant) e;
                a.prepareReport();
            } else if (e instanceof Manager) {
                Manager m = (Manager) e;
                m.approveBonus();
            }
        }
    }
}
```

---

# ▶️ How to Run

### Compile
```bash
javac CompanyDemo.java
```

### Run
```bash
java CompanyDemo
```

---

# 🖥️ Example Output

```
Paying salary to Programmer: Ali
Paying salary to Accountant: Sara
Paying salary to Manager: Reza

Downcasting
Ali is writing code...
Sara is preparing financial report...
Reza is approving bonuses...
```

---

# ✍️ Author
Your Name  
GitHub: https://github.com/kimiaakashian

