package resources;



public class  CalcTax {
    public static Double calcTaxIndividual(Double anuallTax,Double healthSpent) {
        Double tax = 0.00;
        if ( anuallTax != null &&  anuallTax < 20_000) {
            if (healthSpent != null && healthSpent == 0.00) {
                tax = ( anuallTax * 0.15);
            } else if (healthSpent != null && healthSpent > 0.00) {
                tax = ( anuallTax * 0.15)+(healthSpent*0.50);
            }
        } else if (anuallTax != null && anuallTax >= 20_000) {
            if (healthSpent != null && healthSpent > 0.00) {
                tax = (anuallTax * 0.25) - (healthSpent * 0.50);
            }else if (healthSpent != null && healthSpent == 0.00) {
                tax = (anuallTax * 0.50);
            }
        }
        return tax;
    }
    public static Double calcTaxCompany(Double anuallTax,Integer numberOfEmployee){
        Double tax = 0.00;
        if(numberOfEmployee <= 10){
            tax = anuallTax*0.16;
        }else {
            tax = anuallTax*0.14;
        }
        return tax;
    }
}