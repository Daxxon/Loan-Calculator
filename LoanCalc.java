import java.util.Scanner;

public class LoanCalc{

  private static Scanner keyboardInput = new Scanner(System.in);

  public static void main(String args[]){

    float interest = 0;
    int iteration = 0;
    float totalPaid = 0;

    //ask how much to finance
    System.out.print("Enter balance total: ");
    float balance = keyboardInput.nextFloat();
    float financed = balance;

    //ask interest rate
    System.out.print("Enter the interest rate: ");
    float rate = keyboardInput.nextFloat();
    if(rate >= 1){
      rate = rate / 100;
    }

    //ask payment amount
    System.out.print("Enter monthly payment amount: ");
    float payment = keyboardInput.nextFloat();

    while(balance > 0){
      interest = (balance * rate) / 12;
      balance = balance + interest - payment;
      iteration++;
      totalPaid += payment;
    }

    System.out.println("Number of payments: " + iteration);
    System.out.println("Total paid: " + totalPaid);

  }
}


this is a test
