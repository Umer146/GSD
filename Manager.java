package printinthouse;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Manager extends Employee {
    private double percentageIncrease;

    public Manager(String name, double baseSalary, double percentageIncrease) {
        super(name, baseSalary);
        this.percentageIncrease = percentageIncrease;
    }

    @Override
    public double getSalary() {
        return baseSalary * (1 + percentageIncrease);
    }

    public double getPercentageIncrease() {
        return percentageIncrease;
    }

    public void setPercentageIncrease(double percentageIncrease) {
        this.percentageIncrease = percentageIncrease;
    }
}
