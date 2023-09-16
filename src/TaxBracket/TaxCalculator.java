package TaxBracket;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tax Filing Status Options: ");
        System.out.println("1. Single");
        System.out.println("2. Head of Household");
        System.out.println("3. Married Filing Jointly or Qualifying Widow");
        System.out.println("4. Married Filing Separately");
        int filingStatus = scanner.nextInt();

        System.out.println("Enter your income: ");
        double income = scanner.nextDouble();

        TaxBracket taxBracket = null;

        switch(filingStatus) {
            case 1:
                taxBracket = new SingleTaxBracket();
                break;
            case 2:
                taxBracket = new HeadOfHouseholdTaxBracket();
                break;
            case 3:
                taxBracket = new MarriedJointlyTaxBracket();
            case 4:
                taxBracket = new MarriedSeparatelyTaxBracket();
            default:
                System.out.println("Invaild");
                System.exit(1);
        }

    }
}
