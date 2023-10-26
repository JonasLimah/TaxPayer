package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<TaxPayer> list  = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int numberOfPayer = input.nextInt();

        for (int i = 1; i <= numberOfPayer; i++) {
            System.out.println("Tax payer #"+ i+" data:");
            System.out.print("Individual or Company : ");
            char modelTaxPayer = input.next().toLowerCase().charAt(0);
            switch (modelTaxPayer){
                case 'i':
                    input.nextLine();
                    System.out.print("Name : ");
                    String nameI = input.nextLine();
                    System.out.print("AnuallIncome : ");
                    Double anuallIncomeI = input.nextDouble();
                    System.out.print("Health expenditures : ");
                    Double healthExpendituresI = input.nextDouble();
                    TaxPayer payerI =  new Individual(nameI,anuallIncomeI,healthExpendituresI);
                    list.add(payerI);
                    break;
                case 'c':
                    input.nextLine();
                    System.out.print("Name : ");
                    String nameC = input.nextLine();
                    System.out.print("AnuallIncome : ");
                    Double anuallIncomeC = input.nextDouble();
                    System.out.print("Number Of Employee : ");
                    Integer numberOfEmployee = input.nextInt();
                    TaxPayer payerC =  new Company(nameC,anuallIncomeC,numberOfEmployee);
                    list.add(payerC);
                    break;
            }
        }

        for (TaxPayer tax: list
             ) {
            System.out.println(tax.getName() + ": " + String.format("%.2f",tax.tax()));
        }
        Double amountTax = 0.00;
        for (int i = 0; i < numberOfPayer; i++) {
            amountTax += list.get(i).tax();
        }
        System.out.println("TOTAL TAXES: $"+ String.format("%.2f",amountTax));

    }
}