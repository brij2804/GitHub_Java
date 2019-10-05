package creational.abstractfactory;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bankName){
       if(bankName == "SBI"){
           return new SBI();
       }else if(bankName == "ICICI"){
           return new ICICI();
       }else if(bankName == "HDFC"){
           return new HDFC();
       }
       return null;
    }

    @Override
    public Loan getLoan(String type){
        return null;
    }

}
