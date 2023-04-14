package entities.models;

public class PessoaJuridica extends Pessoa{
   private Integer numberEmployees;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double calculateTax() {
        if (numberEmployees > 10) {
            return getAnnualIncome() * 0.14;
        }
        else {
            return getAnnualIncome() * 0.16;
        }
    }
}
