/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
public class Paper {
    private PaperSize size;
    private PaperType type;
    private double price;

    public Paper(PaperSize size, PaperType type, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public PaperType getType() {
        return type;
    }

    public void setType(PaperType type) {
        this.type = type;
    }

    public PaperSize getSize() {
        return this.size;
    }

    public void setSize(PaperSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

