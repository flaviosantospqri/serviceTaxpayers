package entities.models;

public abstract class Pessoa {
    private String name;
    private Double annualIncome;

    public Pessoa(String name, Double annualExpense) {
        this.name = name;
        this.annualIncome = annualExpense;
    }

    public Pessoa() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double calculateTax();
}
