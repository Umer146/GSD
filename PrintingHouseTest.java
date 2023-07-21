/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Hp
 */
class PrintingHouseTest {
    @Test
    void testPrintingMachineCreation() {
        PrintingMachine machine = new PrintingMachine(10, true, 50, 10);
        assertNotNull(machine);
    }

    @Test
    void testLoadPaper() {
        PrintingMachine machine = new PrintingMachine(10, true, 50, 10);
        assertDoesNotThrow(() -> machine.loadPaper(5));
        assertEquals(5, machine.getPaperInTray());
    }

    @Test
    void testLoadPaperExceedingCapacity() {
        PrintingMachine machine = new PrintingMachine(10, true, 50, 10);
        assertThrows(PaperLoadingException.class, () -> machine.loadPaper(11));
    }

    @Test
    void testSetMaxSheets() {
        PrintingMachine machine = new PrintingMachine(10, true, 50, 10);
        machine.setMaxSheets(15);
        assertEquals(15, machine.getMaxSheets());
    }
    

     @Test
    void testPaperLoadingExceptionMessage() {
        String message = "Test exception message";
        PaperLoadingException exception = new PaperLoadingException(message);
        assertEquals(message, exception.getMessage());
    }
     private PrintingHouse printingHouse;

    @BeforeEach
    void setUp() {
        printingHouse = new PrintingHouse();
    }

    @Test
    void testAddEmployee() {
        Employee employee = new Employee("John", 100) {
            @Override
            public double getSalary() {
return 0.0;            }
        };
        printingHouse.addEmployee(employee);
        assertEquals(1, printingHouse.getEmployees().size());
    }

    @Test
    void testAddPrintingMachine() {
        PrintingMachine machine = new PrintingMachine(10, true, 50, 10);
        printingHouse.addPrintingMachine(machine);
        assertEquals(1, printingHouse.getMachines().size());
    }

    @Test
    void testAddPublication() {
        Publication publication = new Publication("Book", 200, PaperSize.A4);
        printingHouse.addPublication(publication);
        assertEquals(1, printingHouse.getPublications().size());
    }

    @Test
    void testCalculatePaperExpenses() {
        List<Paper> papers = new ArrayList<>();
        papers.add(new Paper(PaperSize.A4, PaperType.STANDARD, 0.1));
        papers.add(new Paper(PaperSize.A3, PaperType.NEWSPAPER, 0.08));
        papers.add(new Paper(PaperSize.A1, PaperType.GLOSSY, 0.5));

        double expenses = printingHouse.calculatePaperExpenses(papers);
        assertEquals(0.68, expenses);
    }

    @Test
    void testCalculateSalaryExpenses() {
        Employee employee1 = new Employee("John", 100) {
            @Override
            public double getSalary() {
return 0.0;            }
        };
        Employee employee2 = new Employee("Jane", 150) {
            @Override
            public double getSalary() {
return 0.0;            }
        };
        printingHouse.addEmployee(employee1);
        printingHouse.addEmployee(employee2);

        double expenses = printingHouse.calculateSalaryExpenses();
        assertEquals(250, expenses);
    }

    @Test
    void testCalculateIncome() {
        Publication publication1 = new Publication("Book", 200, PaperSize.A4);
        Publication publication2 = new Publication("Newspaper", 24, PaperSize.A3);
        printingHouse.addPublication(publication1);
        printingHouse.addPublication(publication2);

        double income = printingHouse.calculateIncome(30);
        assertEquals(60, income);
    }

    @Test
    void testCalculateProfit() {
        double paperExpenses = 10;
        double salaryExpenses = 20;
        double income = 50;

        double profit = printingHouse.calculateProfit(paperExpenses, salaryExpenses, income);
        assertEquals(20, profit);
    }
  
    public static void main(String[] args) {
        PrintingHouse printingHouse = new PrintingHouse();

        Employee employee1 = new Employee("John", 100) {
            @Override
            public double getSalary() {
              
     return 0.0;       }
        };
        Employee employee2 = new Employee("Jane", 150) {
            @Override
            public double getSalary() {
return 0.0;            }
        };
        printingHouse.addEmployee(employee1);
        printingHouse.addEmployee(employee2);

        PrintingMachine machine1 = new PrintingMachine(10, true, 50, 10);
        printingHouse.addPrintingMachine(machine1);

        Publication publication1 = new Publication("Book", 200, PaperSize.A4);
        Publication publication2 = new Publication("Newspaper", 24, PaperSize.A3);
        printingHouse.addPublication(publication1);
        printingHouse.addPublication(publication2);

        List<Paper> papers = new ArrayList<>();
        papers.add(new Paper(PaperSize.A4, PaperType.STANDARD, 0.1));
        papers.add(new Paper(PaperSize.A3, PaperType.NEWSPAPER, 0.08));
        papers.add(new Paper(PaperSize.A1, PaperType.GLOSSY, 0.5));

        double paperExpenses = printingHouse.calculatePaperExpenses(papers);
        double salaryExpenses = printingHouse.calculateSalaryExpenses();
        double income = printingHouse.calculateIncome(30);
        double profit = printingHouse.calculateProfit(paperExpenses, salaryExpenses, income);

        System.out.println("Paper Expenses: " + paperExpenses);
        System.out.println("Salary Expenses: " + salaryExpenses);
        System.out.println("Income: " + income);
        System.out.println("Profit: " + profit);

        String fileName = "printing_house_report.txt";
        printingHouse.writeToFile(fileName);
        System.out.println("Printing house report saved to file: " + fileName);

        System.out.println("Reading from file: " + fileName);
        printingHouse.readFromFile(fileName);
    }

}