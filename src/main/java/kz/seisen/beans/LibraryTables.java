package kz.seisen.beans;

public class LibraryTables {
    private int standsAmount;

    public LibraryTables() {
        System.out.println("Eager Library tables singleton");
    }

    public int getStandsAmount() {
        return standsAmount;
    }

    public void setStandsAmount(int standsAmount) {
        this.standsAmount = standsAmount;
    }
}
