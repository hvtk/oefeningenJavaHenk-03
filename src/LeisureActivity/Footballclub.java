package LeisureActivity;

public class Footballclub {
    private String name;                //class attribute
    private String abbreviation;        //class attribute
    private int foundingYear;

    public String getName() {
        return name;
    }   // lees je de variabele uit

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setAbbreviation(String abbreviation) {  // staat hier String.. tussen () omdat deze methode ook een andere variabele mee kan geven?
        this.abbreviation = abbreviation;
    } // pas je de variabele aan

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    // This is the constructor
    public Footballclub(String name, String abbreviation, int foundingYear) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.foundingYear = foundingYear;
    }
}
