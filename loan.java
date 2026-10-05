package Assignments;
import java.util.Date;

public class loan {

    // Attributes
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // No-argument constructor
    public loan() {
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }

    // Constructor with parameters
    public loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    // Getter for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Setter for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Getter for numberOfYears
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // Setter for numberOfYears
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // Getter for loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Setter for loanAmount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Getter for loanDate
    public Date getLoanDate() {
        return loanDate;
    }

    // Calculate monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfPayments = numberOfYears * 12;

        return loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate,
                        numberOfPayments));
    }

    // Calculate total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}

 class TestLoan {

    public static void main(String[] args) {

        // Test no-argument constructor
        loan loan1 = new loan();

        // Test getters
        System.out.println("Annual interest rate is: "
                + loan1.getAnnualInterestRate());

        System.out.println("Number of years is: "
                + loan1.getNumberOfYears());

        System.out.println("Loan amount is: "
                + loan1.getLoanAmount());

        System.out.println("Loan date is: "
                + loan1.getLoanDate());

        // Test getMonthlyPayment()
        System.out.println("Monthly payment is: "
                + loan1.getMonthlyPayment());

        // Test getTotalPayment()
        System.out.println("Total payment is: "
                + loan1.getTotalPayment());


        // Test constructor with parameters
        loan loan2 = new loan(5.0, 5, 5000);

        // Test to make sure constructor works
        System.out.println("\nLoan 2:");

        System.out.println("Annual interest rate is: "
                + loan2.getAnnualInterestRate());

        System.out.println("Number of years is: "
                + loan2.getNumberOfYears());

        System.out.println("Loan amount is: "
                + loan2.getLoanAmount());

        System.out.println("Loan date is: "
                + loan2.getLoanDate());

        // Test monthly payment
        System.out.println("Monthly payment is: "
                + loan2.getMonthlyPayment());

        // Test total payment
        System.out.println("Total payment is: "
                + loan2.getTotalPayment());


        // Test setters
        loan2.setAnnualInterestRate(6.0);
        loan2.setNumberOfYears(10);
        loan2.setLoanAmount(10000);

        // Test getters after setters
        System.out.println("\nAfter using setters:");

        System.out.println("Annual interest rate is: "
                + loan2.getAnnualInterestRate());

        System.out.println("Number of years is: "
                + loan2.getNumberOfYears());

        System.out.println("Loan amount is: "
                + loan2.getLoanAmount());

        // Test monthly payment after changes
        System.out.println("Monthly payment is: "
                + loan2.getMonthlyPayment());

        // Test total payment after changes
        System.out.println("Total payment is: "
                + loan2.getTotalPayment());
    }
}

