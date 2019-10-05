package creational.abstractfactory;

public class HomeLoan implements Loan {

    @Override
    public double getInterestRate(){
        return 5.00;
    }
}
