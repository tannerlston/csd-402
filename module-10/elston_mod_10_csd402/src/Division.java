// Tanner Elston, CSD402, 2/6/26


//Src: https://www.geeksforgeeks.org/java/abstract-classes-in-java/
public abstract class Division {
    private String divisionName;
    private int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public abstract void display();
}