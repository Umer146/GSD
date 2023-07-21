/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintingHouse printingHouse = new PrintingHouse();

        // Create employees
        Manager manager1 = new Manager("Alice", 60, 10);
        Manager manager2 = new Manager("Bob", 50, 15);
        Operator operator1 = new Operator("Carol", 50);
        Operator operator2 = new Operator("Dave", 30);

        // Add employees to the printing house
        printingHouse.addEmployee(manager1);
        printingHouse.addEmployee(manager2);
        printingHouse.addEmployee(operator1);
        printingHouse.addEmployee(operator2);

        // Create printing machines
        PrintingMachine machine1 = new PrintingMachine(10, true, 50, 10);
        PrintingMachine machine2 = new PrintingMachine(10, false, 40, 2);

        // Add printing machines to the printing house
        printingHouse.addPrintingMachine(machine1);
        try {
            machine1.loadPaper(5);
        } catch (PaperLoadingException e) {
            System.out.println("Failed to load paper into machine1: " + e.getMessage());
        }
        printingHouse.addPrintingMachine(machine2);

        // Create publications
        Publication book = new Publication("Book", 200, PaperSize.A4);
        Publication newspaper = new Publication("Newspaper", 24, PaperSize.A3);
        Publication poster = new Publication("Poster", 1, PaperSize.A1);

        // Add publications to the printing house
        printingHouse.addPublication(book);
        printingHouse.addPublication(newspaper);
        printingHouse.addPublication(poster);

        // Create paper
        List<Paper> papers = new ArrayList<>();
        papers.add(new Paper(PaperSize.A4, PaperType.STANDARD, 0.1));
        papers.add(new Paper(PaperSize.A3, PaperType.NEWSPAPER, 0.08));
        papers.add(new Paper(PaperSize.A1, PaperType.GLOSSY, 0.5));

        // Calculate expenses and income
        double paperExpenses = printingHouse.calculatePaperExpenses(papers);
        double salaryExpenses = printingHouse.calculateSalaryExpenses();
        double income = printingHouse.calculateIncome(30); // Increase the price per publication to 30

        // Update managers' salaries if income is high enough
        double incomeThreshold = 500;
        if (income > incomeThreshold) {
            double percentageIncrease = 20;
            manager1.setPercentageIncrease(percentageIncrease);
            manager2.setPercentageIncrease(percentageIncrease);
        }

        // Calculate profit
        double profit = printingHouse.calculateProfit(paperExpenses, salaryExpenses, income);

        System.out.println("Paper Expenses: " + paperExpenses);
        System.out.println("Salary Expenses: " + salaryExpenses);
        System.out.println("Income: " + income);
        System.out.println("Profit: " + Math.abs(profit));
    }
}
