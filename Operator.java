/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
public class Operator extends Employee {
    public Operator(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + getname() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}

