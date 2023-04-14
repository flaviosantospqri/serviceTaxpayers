package entities.models;

public class PessoaFisica extends Pessoa {
   private Double expenseHealth;


    public PessoaFisica(String name, Double annualIncome, Double expenseHealth) {
        super(name, annualIncome);
        this.expenseHealth = expenseHealth;
    }

    public PessoaFisica() {
        super();
    }

    public Double getExpenseHealth() {
        return expenseHealth;
    }

    public void setExpenseHealth(Double expenseHealth) {
        this.expenseHealth = expenseHealth;
    }

    @Override
    public double calculateTax() {
        if (getAnnualIncome() < 20000.0) {
            return getAnnualIncome() * 0.15 - expenseHealth * 0.5;
        }
        else {
            return getAnnualIncome() * 0.25 - expenseHealth * 0.5;
        }
    }
}
