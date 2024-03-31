

/*import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MOTHS_IN_YEAR =12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
Scanner scanner = new Scanner(System.in);
  while (true){
      System.out.print("principal: ");
        principal = scanner.nextInt();
        if (principal >=1000 && principal <=10_000_000)
            break;
        System.out.println("Enter a value between 1000 and 1_000_000");
       }
  while (true) {
      System.out.print("Annual Interest Rate:");
      float annualInterest = scanner.nextFloat();
      if (annualInterest >=1 && annualInterest <= 30) {
       monthlyInterest = annualInterest / PERCENT / MOTHS_IN_YEAR;
          break;
           }
          System.out.print("Enter a Value Between 1 and 30");
       }
  while (true) {
      System.out.print("Period (years):");
      byte years = scanner.nextByte();
      if (years >= 1 && years <= 30) {
          numberOfPayments = years * MOTHS_IN_YEAR;
          break;
      }
      System.out.println("Enter a value between 1 and 30.")
  }
    double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest) /(Math.pow(1+ monthlyInterest, numberOfPayments)));

            String mortgageFormatted = NumberFormat.getCurrencyInstance(;);
         System.out.println("Mortgage:" + mortgageFormatted);

    }
}
*/




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mortgage Calculator!");
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan term (in years): ");
        int loanTermYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int loanTermMonths = loanTermYears * 12;

        double monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyInterestRate, loanTermMonths);

        System.out.printf("Your monthly mortgage payment is: $%.2f\n", monthlyPayment);

        scanner.close();
    }

    public static double calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, int loanTermMonths) {
        double monthlyPayment;
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));
        return monthlyPayment;
    }
}
