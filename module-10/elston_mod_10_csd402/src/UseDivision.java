// Tanner Elston, CSD402, 2/6/26

public class UseDivision {
    public static void main(String[] args) {

        // Two InternationalDivision instances
        InternationalDivision intl1 = new InternationalDivision("Asia Pacific", 1001, "Japan", "Japanese");

        InternationalDivision intl2 = new InternationalDivision("European Operations", 1002, "Germany", "German");

        // Two DomesticDivision instances
        DomesticDivision dom1 = new DomesticDivision("Midwest Region", 2001, "Nebraska");

        DomesticDivision dom2 = new DomesticDivision("Northeast Region", 2002, "New York");

        // Display all four divisions
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}