package creational.abstractfactory;

public class PersonalLoan implements Loan {

    @Override
    public double getInterestRate(){
        return 8.00;
    }
}
