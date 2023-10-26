package entities;

import resources.CalcTax;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anuallcome, Double healthExpenditures) {
        super(name, anuallcome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        return CalcTax.calcTaxIndividual( super.getAnuallcome(),healthExpenditures);
    }
}
