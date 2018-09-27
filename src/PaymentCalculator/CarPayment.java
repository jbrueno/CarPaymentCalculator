package PaymentCalculator;

import java.util.Scanner;

public class CarPayment {
	
	public static double monthlyPaymentCalc(double carCost, double downPayment, double interestRate, int loanLength) {
		
		carCost -= downPayment;
		interestRate = (interestRate / 100) / 12;
		
		double monthlyPayment = carCost * ((interestRate * (Math.pow(1 + interestRate, loanLength)) / ((Math.pow(1 + interestRate, loanLength) - 1)))); 
		
		return monthlyPayment;
		
	}
	
	public static double totalInterestCalc(double carCost, double downPayment, double interestRate, int loanLength) {
		
		carCost -= downPayment;
		interestRate = (interestRate / 100) / 12;
		double monthlyPayment = carCost * ((interestRate * (Math.pow(1 + interestRate, loanLength)) / ((Math.pow(1 + interestRate, loanLength) - 1))));
		
		double totalInterest = (monthlyPayment * loanLength) - carCost;
		
		return totalInterest;
		
	}

	public static void main(String[] args) {

		Scanner amount = new Scanner(System.in);
		
		System.out.print("Enter the total cost of the car: ");
		
		double carCost = amount.nextDouble();
		
		System.out.print("Enter the down payment: ");
		
		double downPayment = amount.nextDouble();
		
		System.out.print("Enter the length of loan in months: ");
		
		int loanLength = amount.nextInt();
		
		System.out.print("Enter the interest rate of the loan: ");
		
		double interestRate = amount.nextDouble();
		
		double monthlyPayment = monthlyPaymentCalc(carCost, downPayment, interestRate, loanLength);
		
		double totalInterest = totalInterestCalc(carCost, downPayment, interestRate, loanLength);
		
		System.out.println("Your monthly payment is: " + monthlyPayment + "\n" + "Your total interest is: " + totalInterest);
		
	}

}
