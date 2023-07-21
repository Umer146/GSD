/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printinthouse;

/**
 *
 * @author Hp
 */
public class PrintingMachine {
    private int maxSheets;
    private int paperInTray;
    private boolean isColor;
    private int pagesPerMinute;
    private int maxPaperCapacity;
    private boolean isLoaded;

    public PrintingMachine(int maxSheets, boolean isColor, int pagesPerMinute, int maxPaperCapacity) {
        this.maxSheets = maxSheets;
        this.isColor = isColor;
        this.pagesPerMinute = pagesPerMinute;
        this.maxPaperCapacity = maxPaperCapacity;
        this.isLoaded = false;
        this.paperInTray = 0;
    }

    public void loadPaper(int numberOfSheets) throws PaperLoadingException {
        if (numberOfSheets > maxSheets - paperInTray) {
            throw new PaperLoadingException("Cannot load more paper than the max capacity");
        }
        paperInTray += numberOfSheets;
        isLoaded = true;
    }

    public int getMaxSheets() {
        return maxSheets;
    }

    public void setMaxSheets(int maxSheets) {
        this.maxSheets = maxSheets;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public int getPagesPerMinute() {
        return pagesPerMinute;
    }

    public void setPagesPerMinute(int pagesPerMinute) {
        this.pagesPerMinute = pagesPerMinute;
    }

    public int getMaxPaperCapacity() {
        return maxPaperCapacity;
    }

    public void setMaxPaperCapacity(int maxPaperCapacity) {
        this.maxPaperCapacity = maxPaperCapacity;
    }

    public int getPaperInTray() {
        return paperInTray;
    }

    public void setPaperInTray(int paperInTray) {
        this.paperInTray = paperInTray;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
}
