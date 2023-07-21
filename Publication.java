/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
class Publication {
    private String title;
    private int numberOfPages;
    private PaperSize paperSize;

    public Publication(String title, int numberOfPages, PaperSize a4) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.paperSize = a4;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public PaperSize getPaperSize() {
        return this.paperSize;
    }

    public void setPaperSize(PaperSize paperSize) {
        this.paperSize = paperSize;
    }
}
