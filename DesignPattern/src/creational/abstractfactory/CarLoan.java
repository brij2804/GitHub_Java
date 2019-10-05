package creational.abstractfactory;

public class CarLoan implements Loan {

  @Override
    public double getInterestRate(){
      return 7.00;
  }
}
