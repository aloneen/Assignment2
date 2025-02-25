package kz.seisen.beans;



public class LibraryStands {
    private int standsAmount;

    public LibraryStands() {
        System.out.println("Lazy Library Stands singleton");
    }

    public int getStandsAmount() {
        return standsAmount;
    }

    public void setStandsAmount(int standsAmount) {
        this.standsAmount = standsAmount;
    }
}
