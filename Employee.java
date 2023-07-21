/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
public abstract class Employee {
    protected double baseSalary;
    protected String name;

    public Employee(String name, double baseSalary) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public abstract double getSalary();

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
