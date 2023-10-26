package entities;

import resources.CalcTax;

public class Company extends TaxPayer{
    private Integer numberOfEmployee;

    public Company(){
        super();
    }

    public Company(String name, Double anuallcome, Integer numberOfEmployee) {
        super(name, anuallcome);
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public Double tax(){
       return CalcTax.calcTaxCompany(super.getAnuallcome(),numberOfEmployee);
    }
}
