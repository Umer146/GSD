/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
public enum PaperType {
    STANDARD,
    GLOSSY,
    NEWSPAPER;

    public double getPrice(PaperSize size) {
        double price = 0;
        switch (this) {
            case STANDARD:
                switch (size) {
                    case A1:
                        price = 10;
                        break;
                    case A2:
                        price = 7;
                        break;
                    case A3:
                        price = 5;
                        break;
                    case A4:
                        price = 3;
                        break;
                    case A5:
                        price = 1;
                        break;
                }
                break;
            case GLOSSY:
                switch (size) {
                    case A1:
                        price = 20;
                        break;
                    case A2:
                        price = 15;
                        break;
                    case A3:
                        price = 10;
                        break;
                    case A4:
                        price = 5;
                        break;
                    case A5:
                        price = 2;
                        break;
                }
                break;
            case NEWSPAPER:
                switch (size) {
                    case A1:
                        price = 5;
                        break;
                    case A2:
                        price = 4;
                        break;
                    case A3:
                        price = 3;
                        break;
                    case A4:
                        price = 2;
                        break;
                    case A5:
                        price = 1;
                        break;
                }
                break;
        }
        return price;
    }
}
