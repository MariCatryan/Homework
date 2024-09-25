//Calculate Income Tax Based on Salary Using Overloaded
//Functions (With Special IT Tax Rate)
//Write overloaded methods named calculateIncomeTax:
//One version accepts a gross salary (as a double) and
//calculates the income tax based on a default tax rate of 20%.
//Another version accepts a gross salary and a custom tax rate
//(as a double) to calculate the income tax.
//A third version accepts a gross salary and a flag
//indicating whether the person works in the IT sector,
//applying a special tax rate of 10% for IT employees.

public class IncomeTaxCalculator {

    public static double calculateIncomeTax(double salary) {
        return salary * 0.20;
    }

    public static double calculateIncomeTax(double salary, double customRate) {
        if (customRate < 0 || customRate > 1) {
            System.out.println("Invalid tax rate.");
            System.exit(1);
        }
        return salary * customRate;
    }

    public static double calculateIncomeTax(double salary, boolean isITEmployee) {
        double taxRate = isITEmployee ? 0.10 : 0.20;
        return salary * taxRate;
    }

    public static void main(String[] args) {
        System.out.println("Income tax on 50000 with default rate: " + calculateIncomeTax(50000));
        System.out.println("Income tax on 50000 with custom rate 15%: " + calculateIncomeTax(50000, 0.15));
        System.out.println("Income tax on 50000 for IT employee: " + calculateIncomeTax(50000, true));
    }
}
