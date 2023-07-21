/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintingHouse {
    private List<Employee> employees;
    private List<PrintingMachine> machines;
    private List<Publication> publications;

    public PrintingHouse() {
        employees = new ArrayList<>();
        machines = new ArrayList<>();
        publications = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addPrintingMachine(PrintingMachine machine) {
        machines.add(machine);
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public double calculatePaperExpenses(List<Paper> papers) {
        double expenses = 0;
        for (Paper paper : papers) {
            expenses += paper.getPrice();
        }
        return expenses;
    }

    public double calculateSalaryExpenses() {
        double expenses = 0;
        for (Employee employee : employees) {
            expenses += employee.getSalary();
        }
        return expenses;
    }

    public double calculateIncome(double pricePerPublication) {
        return publications.size() * pricePerPublication;
    }

    public double calculateProfit(double paperExpenses, double salaryExpenses, double income) {
        return income - (paperExpenses + salaryExpenses);
    }

    public void writeToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Employees:\n");
            for (Employee employee : employees) {
                writer.write(employee.toString() + "\n");
            }
            writer.write("\nPrinting Machines:\n");
            for (PrintingMachine machine : machines) {
                writer.write(machine.toString() + "\n");
            }
            writer.write("\nPublications:\n");
            for (Publication publication : publications) {
                writer.write(publication.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public void calculateManagerPercentageIncrease(double income, double threshold, double lowPercentage,
            double highPercentage) {
        if (income > threshold) {
            for (Employee employee : employees) {
                if (employee instanceof Manager) {
                    ((Manager) employee).setPercentageIncrease(highPercentage);
                }
            }
        } else {
            for (Employee employee : employees) {
                if (employee instanceof Manager) {
                    ((Manager) employee).setPercentageIncrease(lowPercentage);
                }
            }
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<PrintingMachine> getMachines() {
        return machines;
    }

    public void setMachines(List<PrintingMachine> machines) {
        this.machines = machines;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }
}

