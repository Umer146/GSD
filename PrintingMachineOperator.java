/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
public class PrintingMachineOperator extends Employee {
    public PrintingMachineOperator(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}
