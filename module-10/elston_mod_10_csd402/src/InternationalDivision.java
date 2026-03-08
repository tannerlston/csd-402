// Tanner Elston, CSD402, 2/6/26

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void display() {
        System.out.println("=== International Division ===");
        System.out.println("Division Name   : " + (getDivisionName()));
        System.out.println("Account Number  : " + getAccountNumber());
        System.out.println("Country         : " + (country));
        System.out.println("Language        : " + (language));
        System.out.println();
    }
}