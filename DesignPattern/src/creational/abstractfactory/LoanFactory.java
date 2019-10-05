package creational.abstractfactory;

public class LoanFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bankName){
        return null;
    }

    @Override
    public Loan getLoan(String type) {
        if(type == "home"){
            return new HomeLoan();
        }else if(type == "personal"){
            return new PersonalLoan();
        }else if(type == "car"){
         return new CarLoan();
        }
        return null;
    }
    
}
